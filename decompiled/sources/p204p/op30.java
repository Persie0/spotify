package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class op30 implements bk30, lk30 {

    /* JADX INFO: renamed from: b */
    public static final so30 f167743b;

    /* JADX INFO: renamed from: c */
    public static final wo30 f167744c;

    /* JADX INFO: renamed from: d */
    public static final yo30 f167745d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ op30[] f167746e;

    /* JADX INFO: renamed from: a */
    public final String f167747a;

    static {
        so30 so30Var = new so30("ENTITY", 0, "glue:entityRow");
        f167743b = so30Var;
        to30 to30Var = new to30("MULTILINE", 1, "glue:text");
        uo30 uo30Var = new uo30("MULTILINE_CAPPED", 2, "glue:textRow");
        vo30 vo30Var = new vo30("NAVIGATION", 3, "glue:navigationRow");
        wo30 wo30Var = new wo30("NORMAL", 4, "glue:row");
        f167744c = wo30Var;
        xo30 xo30Var = new xo30("SMALL", 5, "glue:smallRow");
        yo30 yo30Var = new yo30("VIDEO", 6, "glue:videoRow");
        f167745d = yo30Var;
        f167746e = new op30[]{so30Var, to30Var, uo30Var, vo30Var, wo30Var, xo30Var, yo30Var};
    }

    public op30(String str, int i, String str2) {
        super(str, i);
        str2.getClass();
        this.f167747a = str2;
    }

    public static op30 valueOf(String str) {
        return (op30) Enum.valueOf(op30.class, str);
    }

    public static op30[] values() {
        return (op30[]) f167746e.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return xj30.ROW.f262032a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f167747a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f167747a;
    }
}
