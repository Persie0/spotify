package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hdf0 {

    /* JADX INFO: renamed from: a */
    public static final hdf0 f90130a;

    /* JADX INFO: renamed from: b */
    public static final hdf0 f90131b;

    /* JADX INFO: renamed from: c */
    public static final hdf0 f90132c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hdf0[] f90133d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f90134e;

    static {
        hdf0 hdf0Var = new hdf0("UNSPECIFIED", 0);
        f90130a = hdf0Var;
        hdf0 hdf0Var2 = new hdf0("DJ", 1);
        hdf0 hdf0Var3 = new hdf0("AGENT", 2);
        f90131b = hdf0Var3;
        hdf0 hdf0Var4 = new hdf0("AUDIO_RECOGNITION", 3);
        f90132c = hdf0Var4;
        hdf0[] hdf0VarArr = {hdf0Var, hdf0Var2, hdf0Var3, hdf0Var4};
        f90133d = hdf0VarArr;
        f90134e = new nzv(hdf0VarArr);
    }

    public static hdf0 valueOf(String str) {
        return (hdf0) Enum.valueOf(hdf0.class, str);
    }

    public static hdf0[] values() {
        return (hdf0[]) f90133d.clone();
    }
}
