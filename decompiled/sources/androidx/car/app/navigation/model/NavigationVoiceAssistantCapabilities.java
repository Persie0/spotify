package androidx.car.app.navigation.model;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import p204p.rzb;
import p204p.x9j0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class NavigationVoiceAssistantCapabilities {
    public static final int ACTION_ALLOW_AND_AVOID_FERRIES = 1;
    public static final int ACTION_ALLOW_AND_AVOID_HIGHWAYS = 2;
    public static final int ACTION_ALLOW_AND_AVOID_TOLLS = 3;
    public static final int ACTION_CLEAR_SEARCH_RESULTS = 4;
    public static final int ACTION_EXIT_NAVIGATION = 5;
    public static final int ACTION_FOLLOW_MODE = 6;
    public static final int ACTION_MUTE_AND_UNMUTE = 7;
    public static final int ACTION_ROUTE_OVERVIEW = 8;
    public static final int ACTION_SHOW_ALTERNATES = 9;
    public static final int ACTION_SHOW_DIRECTIONS_LIST = 10;
    public static final int ACTION_SHOW_SATELLITE = 11;
    public static final int ACTION_SHOW_TRAFFIC = 12;
    public static final int ACTION_UNDEFINED = 0;
    public static final int DISRUPTION_REPORT_CONSTRUCTION = 1;
    public static final int DISRUPTION_REPORT_CRASH = 2;
    public static final int DISRUPTION_REPORT_FLOODING = 3;
    public static final int DISRUPTION_REPORT_FOG = 4;
    public static final int DISRUPTION_REPORT_OBJECT_ON_ROAD = 5;
    public static final int DISRUPTION_REPORT_POLICE = 6;
    public static final int DISRUPTION_REPORT_POTHOLE = 7;
    public static final int DISRUPTION_REPORT_ROAD_CLOSURE = 8;
    public static final int DISRUPTION_REPORT_SNOW = 9;
    public static final int DISRUPTION_REPORT_TRAFFIC = 10;
    public static final int DISRUPTION_REPORT_UNDEFINED = 0;
    public static final int DISRUPTION_REPORT_VEHICLE = 11;
    private final boolean mIsVoiceAssistantConsentGranted;
    private final Set<Integer> mSupportedActions;
    private final Set<Integer> mSupportedDisruptions;

    private NavigationVoiceAssistantCapabilities(x9j0 x9j0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationVoiceAssistantCapabilities)) {
            return false;
        }
        NavigationVoiceAssistantCapabilities navigationVoiceAssistantCapabilities = (NavigationVoiceAssistantCapabilities) obj;
        return this.mIsVoiceAssistantConsentGranted == navigationVoiceAssistantCapabilities.mIsVoiceAssistantConsentGranted && Objects.equals(this.mSupportedActions, navigationVoiceAssistantCapabilities.mSupportedActions) && Objects.equals(this.mSupportedDisruptions, navigationVoiceAssistantCapabilities.mSupportedDisruptions);
    }

    public Set<Integer> getSupportedActions() {
        return this.mSupportedActions;
    }

    public Set<Integer> getSupportedDisruptions() {
        return this.mSupportedDisruptions;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsVoiceAssistantConsentGranted), this.mSupportedActions, this.mSupportedDisruptions);
    }

    public boolean isVoiceAssistantConsentGranted() {
        return this.mIsVoiceAssistantConsentGranted;
    }

    public String toString() {
        return "NavigationVoiceAssistantCapabilities[ isVoiceAssistantConsentGranted: " + this.mIsVoiceAssistantConsentGranted + ", supportedActions: " + this.mSupportedActions + ", supportedDisruptions: " + this.mSupportedDisruptions + " ]";
    }

    private NavigationVoiceAssistantCapabilities() {
        this.mIsVoiceAssistantConsentGranted = false;
        Set<Integer> set = Collections.EMPTY_SET;
        this.mSupportedActions = set;
        this.mSupportedDisruptions = set;
    }
}
