

package com.mibarim.taximeter.core;

/**
 * Bootstrap constants
 */
public final class Constants {
    private Constants() {}

    public static final class Auth {
        private Auth() {}

        /**
         * Account type id
         */
        public static final String BOOTSTRAP_ACCOUNT_TYPE = "com.mibarim.taximeter";

        /**
         * Account name
         */
        public static final String BOOTSTRAP_ACCOUNT_NAME = "Mibarim";

        /**
         * Provider id
         */
        public static final String BOOTSTRAP_PROVIDER_AUTHORITY = "com.mibarim.taximeter.sync";

        /**
         * Auth token type
         */
        public static final String AUTHTOKEN_TYPE = BOOTSTRAP_ACCOUNT_TYPE;
        /**
         * mobile login
         */
        public static final String REG_MOBILE = "mobile";
        public static final String REG_PASSWORD = "password";
    }

    /**
     * All HTTP is done through a REST style API built for demonstration purposes on Parse.com
     * Thanks to the nice people at Parse for creating such a nice system for us to use for bootstrap!
     */
    public static final class Http {
        private Http() {}


        /**
         * Base for all requests
         */
//        public static final String URL_BASE = "http://localhost:50226";
//        public static final String URL_BASE = "http://mibarim.ir/CoreApi";
//          public static final String URL_BASE = "http://CoreApi.mibarim.ir/";
//        public static final String URL_BASE = "http://mibarim.ir/testApp";
//        public static final String URL_BASE = "http://mibarimapp.com/testApp";
        public static final String URL_BASE = "http://Kerayechi.mibarimapp.com";
        public static final String URL_BASE_TEST = "http://127.0.0.1:5000";


        /**
         * Authentication URL
         */
        public static final String URL_AUTH_FRAG = "/TokenAuthentication";

        public static final String GENERATE_TOKEN_ENDPOINT = "http://mibarimapp.com";

        public static final String URL_REGISTER_FRAG = "/RegisterWebUser";
        public static final String URL_MOBILE_CONFIRM_FRAG = "/ConfirmMobileNo";
        public static final String URL_MOBILE_CONFIRM_SMS = "/ConfirmMobileSms";
        public static final String URL_MOBILE_SEND_SMS = "/SendConfirmMobileSms";
        public static final String URL_AUTH = URL_BASE + URL_AUTH_FRAG;

        /**
         * RouteResponse Requesta
         */
        public static final String URL_INSERT_ROUTE = "/InsertUserRoute";
        public static final String URL_INSERT_EVENT_ROUTE = "/InsertUserEventRoute";
        public static final String URL_CONFIRM_ROUTE = "/ConfirmRoute";
        public static final String URL_NOT_CONFIRM_ROUTE = "/NotConfirmRoute";
        public static final String URL_JOIN_GROUP = "/JoinGroup";
        public static final String URL_DELETE_GROUP = "/DeleteGroupSuggest";
        public static final String URL_LEAVE_GROUP = "/LeaveGroup";
        public static final String URL_ACCEPT_ROUTE = "/AcceptSuggestedRoute";
        public static final String URL_DELETE_ROUTE_SUGGESTION = "/DeleteRouteSuggest";
        public static final String URL_DELETE_ROUTE = "/DeleteRoute";
        public static final String URL_SHARE_ROUTE = "/ShareRoute";
        public static final String URL_GET_ROUTE = "/GetUserRoutes";
        public static final String URL_NOTIFY_EVENT = "/NotifyEvents";
        public static final String URL_REQUEST_RIDE_SHARE = "/RequestRideShare";
        public static final String URL_ACCEPT_RIDE_SHARE = "/AcceptRideShare";
        public static final String URL_GET_ROUTE_INFO = "/GetRouteInfo";
        public static final String URL_INSERT_RIDE_REQUEST = "/InsertRideRequest";
        /**
         * UserInfoService
         */
        public static final String URL_GET_MESSAGE = "/GetGroupComments";
        public static final String URL_SEND_MESSAGE = "/SubmitComment";
        public static final String MESSAGE_IMAGE_URL= "/GetCommentUserImage";
        /**
         * UserInfoService
         */
        public static final String URL_LICENSE_INFO = "/GetLicenseInfo";
        public static final String URL_CAR_INFO = "/GetCarInfo";
        public static final String URL_PERSON_INFO = "/GetPersonalInfo";
        public static final String URL_GET_USER_INFO = "/GetUserInfo";
        public static final String URL_SET_PERSON_INFO = "/InsertPersoanlInfo";
        public static final String URL_SET_USER_INFO = "/InsertUserInfo";
        public static final String URL_SET_PERSON_Email = "/InsertEmailInfo";
        public static final String URL_SET_LICENSE_INFO = "/InsertLicenseInfo";
        public static final String URL_SET_CAR_INFO = "/InsertCarInfo";
        public static final String URL_SET_PERSON_IMAGE = "/InsertPersonalPic";
        public static final String URL_SET_LICENSE_IMAGE = "/InsertLicensePic";
        public static final String URL_SET_CAR_IMAGE = "/InsertCarPics";
        public static final String URL_SET_CAR_BCK_IMAGE = "/InsertCarBackPic";
        public static final String URL_SET_NATIONAL_CARD_IMAGE = "/InsertNationalCardPic";
        public static final String URL_SET_BANK_CARD_IMAGE = "/InsertBankCardPic";
        public static final String URL_GET_VERSION = "/GetAppVersion";
        public static final String URL_GET_SCORE = "/GetUserScores";
        public static final String URL_SET_GOOGLE_TOKEN = "/SaveGcmToken";
        public static final String URL_GET_IMAGE = "/GetImageById";
        /**
         * Trips
         */
        public static final String URL_GET_TRIP_ID = "/GetUserTripId";
        public static final String URL_USER_TRIP_LOCATION = "/SendUserTripLocation";
        public static final String URL_GET_TRIP_INFO = "/GetTripInfo";
        public static final String URL_END_TRIP = "/EndTripRequest";
        /**
         * List Users URL
         */
        public static final String URL_USERS_FRAG =  "/1/users";
        public static final String URL_USERS = URL_BASE + URL_USERS_FRAG;


        /**
         * List News URL
         */
        public static final String URL_NEWS_FRAG = "/1/classes/News";
        public static final String URL_NEWS = URL_BASE + URL_NEWS_FRAG;


        /**
         * List Checkin's URL
         */
        public static final String URL_CHECKINS_FRAG = "/1/classes/Locations";
        public static final String URL_CHECKINS = URL_BASE + URL_CHECKINS_FRAG;

        /**
         * PARAMS for auth
         */
        public static final String PARAM_USERNAME = "username";
        public static final String PARAM_PASSWORD = "password";
        public static final String PARAM_REG_NAME = "Name";
        public static final String PARAM_REG_Family = "Family";
        public static final String PARAM_REG_Gender = "Gender";
        public static final String PARAM_REG_USERNAME = "Mobile";
        public static final String PARAM_REG_PASSWORD = "Password";
        public static final String PARAM_REG_CODE = "Code";
        public static final String PARAM_GRANT_TYPE = "grant_type";
        public static final String PARAM_RESPONSE_TYPE = "response_type";
        public static final String PARAM_AUTHORIZATION = "Authorization";
        public static final String PARAM_CONTENT = "Content-Type";

        public static final String PARSE_APP_ID = "zHb2bVia6kgilYRWWdmTiEJooYA17NnkBSUVsr4H";
        public static final String PARSE_REST_API_KEY = "N2kCY1T3t3Jfhf9zpJ5MCURn3b25UpACILhnf5u9";
        public static final String HEADER_PARSE_REST_API_KEY = "X-Parse-REST-API-Key";
        public static final String HEADER_PARSE_APP_ID = "X-Parse-Application-Id";
        public static final String CONTENT_TYPE_JSON = "application/json";
        public static final String USERNAME = "username";
        public static final String PASSWORD = "password";
        public static final String SESSION_TOKEN = "sessionToken";


        public static final String ROUTE_IMAGE_URL = "/GetRouteUserImage";
        public static final String SUGGEST_ROUTE_URL = "/GetSuggestRoute";
        public static final String SIMILAR_SUGGEST_ROUTE_URL = "/GetSimilarSuggestRoute";

        public static final String URL_GET_EVENT = "/GetAllEvents";
        public static final String URL_GET_CITY_LOCATION = "/GetCityLocations";
        public static final String URL_GET_LOCAL_ROUTES = "/GetLocalRoutes";
        public static final String URL_GET_RECOMMEND_ROUTES = "/GetRouteRecommends";
        public static final String URL_GET_CONTACTS = "/GetUserContacts";
        public static final String URL_PRICE = "/GetPrice";
        public static final String URL_PATH_PRICE = "/GetPathPrice";
        public static final String URL_TAP30_PATH_PRICE_FROM_SERVER = "/GetTap30Price";
        public static final String URL_SNAPP_PATH_PRICE_FROM_SERVER = "/GetSnappPrice";

    }

    public static final class Geocoding {
        public static final String SERVICE_BASE_URL = "https://maps.googleapis.com";
        public static final String SERVICE_URL = "/maps/api/geocode/json";
        public static final String AUTOCOMPLETE_SERVICE_URL = "/maps/api/place/autocomplete/json";
        public static final String DETAIL_SERVICE_URL = "/maps/api/place/details/json";
        public static final String AUTOCOMPLETE_INPUT = "input";
        public static final String LAT_LONG_KEY = "latlng";
        public static final String LANGUAGE_KEY = "language";
        public static final String LANGUAGE_VALUE = "fa";
        public static final String COMPONENTS_KEY = "components";
        public static final String COMPONENTS_VALUE = "country:fa";
        public static final String LOCATION_AUTOCOMPLETE_TYPE_KEY = "types";
        public static final String LOCATION_AUTOCOMPLETE_TYPE_VALUE = "(regions)";
        public static final String LOCATION_TYPE_KEY = "location_type";
        public static final String LOCATION_TYPE_VALUE = "GEOMETRIC_CENTER|APPROXIMATE";
        public static final String GOOGLE_AUTOCOMPLETE_SERVICE_KEY = "key";
//        public static final String GOOGLE_AUTOCOMPLETE_SERVICE_VALUE = "autocomplete";//AIzaSyCgq_JPSr6m0qKVHeyXnTI85FvpESXitSk
        public static final String GOOGLE_SERVICE_KEY = "key";
//        public static final String GOOGLE_SERVICE_VALUE = "AIzaSyAbHHEaaGfcm2jtmfdbvu_qraFZAbr0QGM";
        public static final String PLACE_ID_KEY = "placeid";
        public static final String GOOGLE_KEYS = "google.autocomplete";
        public static final String GOOGLE_AUTOCOMPLETE_AUTH = "google.autocomplete.googleKey";
//        public static final String GOOGLE_ADDRESS_AUTH = "google.address.googleKey";
    }

    public static final class MibarimServer {
        public static final String SRC_LAT = "SrcLat";
        public static final String SRC_LNG = "SrcLng";
        public static final String DST_LAT = "DstLat";
        public static final String DST_LNG = "DstLng";
        public static final String WAYPOINTS = "WayPoints";
    }

    public static final class Extra {
        private Extra() {}

        public static final String NEWS_ITEM = "news_item";

        public static final String USER = "user";

    }

    public static final class Intent {
        private Intent() {}

        /**
         * Action prefix for all intents created
         */
        public static final String INTENT_PREFIX = "com.mibarim.taximeter.";

    }

    public static class Notification {
        private Notification() {
        }

        public static final int TIMER_NOTIFICATION_ID = 1000; // Why 1000? Why not? :)
    }

}


