package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v8b1 {

    /* JADX INFO: renamed from: a */
    public static final v8b1 f238462a;

    /* JADX INFO: renamed from: b */
    public static final v8b1 f238463b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ v8b1[] f238464c;

    static {
        v8b1 v8b1Var = new v8b1("MapClicked", 0);
        f238462a = v8b1Var;
        v8b1 v8b1Var2 = new v8b1("AttributionClicked", 1);
        f238463b = v8b1Var2;
        f238464c = new v8b1[]{v8b1Var, v8b1Var2};
    }

    public static v8b1 valueOf(String str) {
        return (v8b1) Enum.valueOf(v8b1.class, str);
    }

    public static v8b1[] values() {
        return (v8b1[]) f238464c.clone();
    }
}
