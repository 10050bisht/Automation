//package DatatDrivenTest;
////package eatpeachy;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.security.GeneralSecurityException;
//import java.time.temporal.ValueRange;
//import java.util.Collections;
//import java.util.List;
//
//import okhttp3.Credentials;
//
//import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.services.sheets.v4.Sheets;
//import com.google.api.services.sheets.v4.SheetsScopes;
//
//public class get_sheet_data {
//	private static final String APPLICATION_NAME = "< Application Name of Google API >";
////	private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//	private static final String TOKENS_DIRECTORY_PATH = "tokens";
//
//	/**
//	 * Global instance of the scopes required by this quickstart. If modifying these
//	 * scopes, delete your previously saved tokens/ folder.
//	 */
//	private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
//	private static final String CREDENTIALS_FILE_PATH = "< Your client_secret.json file path >";
//
//	/**
//	 * Creates an authorized Credential object.
//	 * 
//	 * @param HTTP_TRANSPORT The network HTTP Transport.
//	 * @return An authorized Credential object.
//	 * @throws IOException If the credentials.json file cannot be found.
//	 */
//	private static Credentials getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
//		// Load client secrets.
//		InputStream in = get_sheet_data.class.getResourceAsStream("C:\\pinpoint\\eatpeachy\\src\\eatpeachy\\client_secret.json");
//		if (in == null) {
//			throw new FileNotFoundException("Resource not found: " + in);
//		}
//		GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
//
//		// Build flow and trigger user authorization request.
//		GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY,
//				clientSecrets, SCOPES)
//						.setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
//						.setAccessType("offline").build();
//		LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
//		return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
//	}
//
//	/**
//	 * Prints the names and majors of students in a sample spreadsheet:
//	 * https://docs.google.com/spreadsheets/d/1BxiMVs0XRA5nFMdKvBdBZjgmUUqptlbs74OgvE2upms/edit
//	 */
//	public static List<List<Object>> getData(String range) throws IOException, GeneralSecurityException {
//		// Build a new authorized API client service.
//		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
//		final String spreadsheetId = "< Your google sheet ID >";
//		
//		Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
//				.setApplicationName(APPLICATION_NAME).build();
//		ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
//		List<List<Object>> values = response.getValues();
//		if (values == null || values.isEmpty()) {
//			System.out.println("No data found.");
//			return null;
//		} else {
//			return values;
//		}
//	}
//
//}