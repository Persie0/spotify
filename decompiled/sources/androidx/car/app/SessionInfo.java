package androidx.car.app;

import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Objects;
import java.util.Set;
import p204p.ftv0;
import p204p.hg40;
import p204p.rzb;
import p204p.ty61;
import p204p.zh21;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class SessionInfo {
    private static final hg40 CLUSTER_SUPPORTED_TEMPLATES_API_6;
    private static final hg40 CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
    public static final SessionInfo DEFAULT_SESSION_INFO;
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    static {
        int i = hg40.f91023c;
        CLUSTER_SUPPORTED_TEMPLATES_API_6 = new zh21(NavigationTemplate.class);
        CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = ftv0.f73317t;
        DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    }

    public SessionInfo(int i, String str) {
        this.mDisplayType = i;
        this.mSessionId = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public Set<Class<? extends ty61>> getSupportedTemplates(int i) {
        if (this.mDisplayType == 1) {
            return i >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
    }
}
