package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r891 {

    /* JADX INFO: renamed from: a */
    public static final r891 f196741a;

    /* JADX INFO: renamed from: b */
    public static final r891 f196742b;

    /* JADX INFO: renamed from: c */
    public static final r891 f196743c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ r891[] f196744d;

    static {
        r891 r891Var = new r891("TRANSITION_MODE_UNSPECIFIED", 0);
        f196741a = r891Var;
        r891 r891Var2 = new r891("TRANSITION_MODE_INSTANT", 1);
        f196742b = r891Var2;
        r891 r891Var3 = new r891("TRANSITION_MODE_SEAMLESS", 2);
        f196743c = r891Var3;
        f196744d = new r891[]{r891Var, r891Var2, r891Var3};
    }

    public static r891 valueOf(String str) {
        return (r891) Enum.valueOf(r891.class, str);
    }

    public static r891[] values() {
        return (r891[]) f196744d.clone();
    }
}
