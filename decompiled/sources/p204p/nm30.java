package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class nm30 implements bk30, lk30 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ nm30[] f155273b = {new fm30(xj30.SECTION_HEADER)};

    /* JADX INFO: renamed from: a */
    public final String f155274a;

    /* JADX INFO: Fake field, exist only in values array */
    nm30 EF4;

    public nm30(xj30 xj30Var) {
        super("SECTION_HEADER", 0);
        xj30Var.getClass();
        this.f155274a = xj30Var.f262032a;
    }

    public static nm30 valueOf(String str) {
        return (nm30) Enum.valueOf(nm30.class, str);
    }

    public static nm30[] values() {
        return (nm30[]) f155273b.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return this.f155274a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return "glue2:sectionHeader";
    }
}
