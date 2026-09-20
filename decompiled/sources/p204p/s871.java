package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s871 {

    /* JADX INFO: renamed from: a */
    public static final s871 f206595a;

    /* JADX INFO: renamed from: b */
    public static final s871 f206596b;

    /* JADX INFO: renamed from: c */
    public static final s871 f206597c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ s871[] f206598d;

    static {
        s871 s871Var = new s871("None", 0);
        f206595a = s871Var;
        s871 s871Var2 = new s871("Touch", 1);
        f206596b = s871Var2;
        s871 s871Var3 = new s871("Mouse", 2);
        f206597c = s871Var3;
        f206598d = new s871[]{s871Var, s871Var2, s871Var3};
    }

    public static s871 valueOf(String str) {
        return (s871) Enum.valueOf(s871.class, str);
    }

    public static s871[] values() {
        return (s871[]) f206598d.clone();
    }
}
