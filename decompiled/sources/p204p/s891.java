package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s891 {

    /* JADX INFO: renamed from: a */
    public static final s891 f206604a;

    /* JADX INFO: renamed from: b */
    public static final s891 f206605b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ s891[] f206606c;

    static {
        s891 s891Var = new s891("REVERT", 0);
        f206604a = s891Var;
        s891 s891Var2 = new s891("RE_SAVE", 1);
        f206605b = s891Var2;
        f206606c = new s891[]{s891Var, s891Var2};
    }

    public static s891 valueOf(String str) {
        return (s891) Enum.valueOf(s891.class, str);
    }

    public static s891[] values() {
        return (s891[]) f206606c.clone();
    }
}
