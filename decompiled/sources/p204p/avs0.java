package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class avs0 {

    /* JADX INFO: renamed from: a */
    public static final avs0 f20255a;

    /* JADX INFO: renamed from: b */
    public static final avs0 f20256b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ avs0[] f20257c;

    /* JADX INFO: Fake field, exist only in values array */
    avs0 EF0;

    static {
        avs0 avs0Var = new avs0("UNSPECIFIED", 0);
        avs0 avs0Var2 = new avs0("MANUAL", 1);
        f20255a = avs0Var2;
        avs0 avs0Var3 = new avs0("SCHEDULED", 2);
        avs0 avs0Var4 = new avs0("OUTDATED_PROMPT_VERSION_TRIGGER", 3);
        avs0 avs0Var5 = new avs0("OVERDUE_SCHEDULED_PLAYLIST_OPENED", 4);
        f20256b = avs0Var5;
        f20257c = new avs0[]{avs0Var, avs0Var2, avs0Var3, avs0Var4, avs0Var5};
    }

    public static avs0 valueOf(String str) {
        return (avs0) Enum.valueOf(avs0.class, str);
    }

    public static avs0[] values() {
        return (avs0[]) f20257c.clone();
    }
}
