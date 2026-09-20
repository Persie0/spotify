package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ru10 {

    /* JADX INFO: renamed from: a */
    public static final ru10 f202723a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ru10[] f202724b;

    static {
        ru10 ru10Var = new ru10("INELIGIBLE", 0);
        f202723a = ru10Var;
        f202724b = new ru10[]{ru10Var, new ru10("CAN_REQUEST_GRADUATION", 1), new ru10("GRADUATION_CHOICE_REQUIRED", 2), new ru10("GRADUATION_POSTPONED_AND_MUST_ACCEPT_NEW_TERMS", 3), new ru10("GRADUATION_REQUEST_PENDING_AND_MUST_ACCEPT_NEW_TERMS", 4), new ru10("GRADUATION_REQUEST_PENDING", 5), new ru10("GRADUATION_REQUEST_APPROVED", 6), new ru10("GRADUATION_REQUEST_DENIED", 7), new ru10("GRADUATION_PENDING", 8), new ru10("GRADUATION_REQUIRED", 9)};
    }

    public static ru10 valueOf(String str) {
        return (ru10) Enum.valueOf(ru10.class, str);
    }

    public static ru10[] values() {
        return (ru10[]) f202724b.clone();
    }
}
