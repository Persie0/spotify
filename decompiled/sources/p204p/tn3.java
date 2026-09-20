package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class tn3 {

    /* JADX INFO: renamed from: a */
    public static final tn3 f221868a;

    /* JADX INFO: renamed from: b */
    public static final tn3 f221869b;

    /* JADX INFO: renamed from: c */
    public static final tn3 f221870c;

    /* JADX INFO: renamed from: d */
    public static final tn3 f221871d;

    /* JADX INFO: renamed from: e */
    public static final tn3 f221872e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ tn3[] f221873f;

    static {
        tn3 tn3Var = new tn3("CHAT", 0);
        f221868a = tn3Var;
        tn3 tn3Var2 = new tn3("SPEAK", 1);
        f221869b = tn3Var2;
        tn3 tn3Var3 = new tn3("MODERATION_CONTROLS", 2);
        f221870c = tn3Var3;
        tn3 tn3Var4 = new tn3("HOST_CONTROLS", 3);
        f221871d = tn3Var4;
        tn3 tn3Var5 = new tn3("VIEW_CHAT_MESSAGES", 4);
        f221872e = tn3Var5;
        f221873f = new tn3[]{tn3Var, tn3Var2, tn3Var3, tn3Var4, tn3Var5};
    }

    public static tn3 valueOf(String str) {
        return (tn3) Enum.valueOf(tn3.class, str);
    }

    public static tn3[] values() {
        return (tn3[]) f221873f.clone();
    }
}
