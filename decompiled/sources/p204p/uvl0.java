package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class uvl0 {

    /* JADX INFO: renamed from: a */
    public static final uvl0 f234466a;

    /* JADX INFO: renamed from: b */
    public static final uvl0 f234467b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ uvl0[] f234468c;

    static {
        uvl0 uvl0Var = new uvl0("PORTRAIT", 0);
        f234466a = uvl0Var;
        uvl0 uvl0Var2 = new uvl0("LANDSCAPE", 1);
        f234467b = uvl0Var2;
        f234468c = new uvl0[]{uvl0Var, uvl0Var2};
    }

    public static uvl0 valueOf(String str) {
        return (uvl0) Enum.valueOf(uvl0.class, str);
    }

    public static uvl0[] values() {
        return (uvl0[]) f234468c.clone();
    }
}
