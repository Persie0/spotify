package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd20 implements j561 {

    /* JADX INFO: renamed from: b */
    public static final td20 f240300b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vd20[] f240301c;

    /* JADX INFO: renamed from: a */
    public final g2e f240302a;

    static {
        td20 td20Var = new td20("CRC_32", 0, "Hashing.crc32()");
        f240300b = td20Var;
        f240301c = new vd20[]{td20Var, new ud20("ADLER_32", 1, "Hashing.adler32()")};
    }

    public vd20(String str, int i, String str2) {
        super(str, i);
        this.f240302a = new g2e(this, str2);
    }

    public static vd20 valueOf(String str) {
        return (vd20) Enum.valueOf(vd20.class, str);
    }

    public static vd20[] values() {
        return (vd20[]) f240301c.clone();
    }
}
