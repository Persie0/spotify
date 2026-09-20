package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ft00 {

    /* JADX INFO: renamed from: a */
    public static final ft00 f73082a;

    /* JADX INFO: renamed from: b */
    public static final ft00 f73083b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ft00[] f73084c;

    static {
        ft00 ft00Var = new ft00("OkButtonClicked", 0);
        f73082a = ft00Var;
        ft00 ft00Var2 = new ft00("DismissButtonClicked", 1);
        f73083b = ft00Var2;
        f73084c = new ft00[]{ft00Var, ft00Var2};
    }

    public static ft00 valueOf(String str) {
        return (ft00) Enum.valueOf(ft00.class, str);
    }

    public static ft00[] values() {
        return (ft00[]) f73084c.clone();
    }
}
