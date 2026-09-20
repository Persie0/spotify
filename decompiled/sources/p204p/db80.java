package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class db80 implements w8j {

    /* JADX INFO: renamed from: a */
    public static final xa80 f47238a;

    /* JADX INFO: renamed from: b */
    public static final ya80 f47239b;

    /* JADX INFO: renamed from: c */
    public static final za80 f47240c;

    /* JADX INFO: renamed from: d */
    public static final ab80 f47241d;

    /* JADX INFO: renamed from: e */
    public static final bb80 f47242e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ db80[] f47243f;

    static {
        xa80 xa80Var = new xa80();
        f47238a = xa80Var;
        ya80 ya80Var = new ya80();
        f47239b = ya80Var;
        za80 za80Var = new za80();
        f47240c = za80Var;
        ab80 ab80Var = new ab80();
        f47241d = ab80Var;
        bb80 bb80Var = new bb80();
        f47242e = bb80Var;
        f47243f = new db80[]{xa80Var, ya80Var, za80Var, ab80Var, bb80Var};
    }

    public static db80 valueOf(String str) {
        return (db80) Enum.valueOf(db80.class, str);
    }

    public static db80[] values() {
        return (db80[]) f47243f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return edb.m38564m("Event.", name());
    }
}
