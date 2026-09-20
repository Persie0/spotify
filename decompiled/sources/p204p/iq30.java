package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class iq30 implements bk30, lk30 {

    /* JADX INFO: renamed from: b */
    public static final xp30 f104622b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ iq30[] f104623c;

    /* JADX INFO: renamed from: a */
    public final String f104624a;

    static {
        xp30 xp30Var = new xp30("SECTION_HEADER", 0, "glue:sectionHeader");
        f104622b = xp30Var;
        f104623c = new iq30[]{xp30Var, new yp30("SECTION_HEADER_LARGE", 1, "glue:row:sectionHeaderLarge"), new zp30("SECTION_HEADER_LARGE_WITH_DESCRIPTION", 2, "glue:row:sectionHeaderLargeWithDescription"), new aq30("SECTION_HEADER_SMALL", 3, "glue:sectionHeaderSmall"), new bq30("SECTION_HEADER_SMALL_NO_DESCRIPTION", 4, "glue:row:sectionHeaderSmall"), new cq30("SECTION_HEADER_SMALL_WITH_DESCRIPTION", 5, "glue:row:sectionHeaderSmallWithDescription")};
    }

    public iq30(String str, int i, String str2) {
        super(str, i);
        str2.getClass();
        this.f104624a = str2;
    }

    public static iq30 valueOf(String str) {
        return (iq30) Enum.valueOf(iq30.class, str);
    }

    public static iq30[] values() {
        return (iq30[]) f104623c.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return xj30.SECTION_HEADER.f262032a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f104624a;
    }
}
