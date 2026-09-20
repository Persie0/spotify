package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class bn30 implements bk30, lk30 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bn30[] f28688c;

    /* JADX INFO: renamed from: a */
    public final String f28689a;

    /* JADX INFO: renamed from: b */
    public final String f28690b;

    /* JADX INFO: Fake field, exist only in values array */
    bn30 EF9;

    static {
        xj30 xj30Var = xj30.SECTION_HEADER;
        f28688c = new bn30[]{new qm30("SECTION_HEADER", 0, "glue2:solarSectionHeader", xj30Var), new rm30("SECTION_HEADER_LARGE", 1, "glue2:solarSectionHeaderLarge", xj30Var), new sm30("SECTION_HEADER_SMALL", 2, "glue2:solarSectionHeaderSmall", xj30Var), new tm30("SECTION_HEADER_WITH_DESCRIPTION", 3, "glue2:solarSectionHeaderWithDescription", xj30Var), new um30("SECTION_HEADER_WITH_RECOMMENDATION", 4, "glue2:solarSectionHeaderWithRecommendation", xj30Var)};
    }

    public bn30(String str, int i, String str2, xj30 xj30Var) {
        super(str, i);
        this.f28689a = str2;
        xj30Var.getClass();
        this.f28690b = xj30Var.f262032a;
    }

    public static bn30 valueOf(String str) {
        return (bn30) Enum.valueOf(bn30.class, str);
    }

    public static bn30[] values() {
        return (bn30[]) f28688c.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return this.f28690b;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f28689a;
    }
}
