package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lv1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ lv1[] f137187a = {new lv1("FAILURE_EVENT_UNSPECIFIED", 0), new lv1("FAILURE_USER_INSUFFICIENT_TIER", 1), new lv1("FAILURE_USER_UNKNOWN", 2), new lv1("FAILURE_USER_CANCELLED", 3), new lv1("FAILURE_USER_UNAUTHORIZED", 4), new lv1("FAILURE_APP_GENERIC_ERROR", 5), new lv1("FAILURE_APP_NETWORK_CONNECTIVITY", 6), new lv1("FAILURE_APP_STARTUP", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    lv1 EF5;

    public static lv1 valueOf(String str) {
        return (lv1) Enum.valueOf(lv1.class, str);
    }

    public static lv1[] values() {
        return (lv1[]) f137187a.clone();
    }
}
