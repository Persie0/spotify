package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class xcx0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ xcx0[] f260301a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nzv f260302b;

    /* JADX INFO: Fake field, exist only in values array */
    xcx0 EF5;

    static {
        xcx0[] xcx0VarArr = {new xcx0("UNSPECIFIED", 0), new xcx0("MUST_USE", 1), new xcx0("EXPLICITLY_IGNORABLE", 2)};
        f260301a = xcx0VarArr;
        f260302b = new nzv(xcx0VarArr);
    }

    public static xcx0 valueOf(String str) {
        return (xcx0) Enum.valueOf(xcx0.class, str);
    }

    public static xcx0[] values() {
        return (xcx0[]) f260301a.clone();
    }
}
