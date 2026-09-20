package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public abstract class rn30 implements bk30, lk30 {

    /* JADX INFO: renamed from: b */
    public static final in30 f200711b;

    /* JADX INFO: renamed from: c */
    public static final jn30 f200712c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rn30[] f200713d;

    /* JADX INFO: renamed from: a */
    public final String f200714a;

    static {
        in30 in30Var = new in30("ENTITY", 0, "glue:entityCard");
        f200711b = in30Var;
        jn30 jn30Var = new jn30("NORMAL", 1, "glue:card");
        f200712c = jn30Var;
        f200713d = new rn30[]{in30Var, jn30Var};
    }

    public rn30(String str, int i, String str2) {
        super(str, i);
        this.f200714a = str2;
    }

    public static rn30 valueOf(String str) {
        return (rn30) Enum.valueOf(rn30.class, str);
    }

    public static rn30[] values() {
        return (rn30[]) f200713d.clone();
    }

    @Override // p204p.bk30
    public final String category() {
        return xj30.CARD.f262032a;
    }

    @Override // p204p.bk30
    /* JADX INFO: renamed from: id */
    public final String mo29575id() {
        return this.f200714a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f200714a;
    }
}
