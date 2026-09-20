package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class xza {

    /* JADX INFO: renamed from: a */
    public static final xza f267563a;

    /* JADX INFO: renamed from: b */
    public static final xza f267564b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ xza[] f267565c;

    static {
        xza xzaVar = new xza("START_STOP", 0);
        f267563a = xzaVar;
        xza xzaVar2 = new xza("CREATE_DESTROY", 1);
        f267564b = xzaVar2;
        f267565c = new xza[]{xzaVar, xzaVar2};
    }

    public static xza valueOf(String str) {
        return (xza) Enum.valueOf(xza.class, str);
    }

    public static xza[] values() {
        return (xza[]) f267565c.clone();
    }
}
