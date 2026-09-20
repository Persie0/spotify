package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class rec0 {

    /* JADX INFO: renamed from: a */
    public static final rec0 f198342a;

    /* JADX INFO: renamed from: b */
    public static final rec0 f198343b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ rec0[] f198344c;

    static {
        rec0 rec0Var = new rec0("Image", 0);
        f198342a = rec0Var;
        rec0 rec0Var2 = new rec0("Popup", 1);
        f198343b = rec0Var2;
        f198344c = new rec0[]{rec0Var, rec0Var2};
    }

    public static rec0 valueOf(String str) {
        return (rec0) Enum.valueOf(rec0.class, str);
    }

    public static rec0[] values() {
        return (rec0[]) f198344c.clone();
    }
}
