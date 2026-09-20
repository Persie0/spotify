package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iic {

    /* JADX INFO: renamed from: a */
    public static final iic f102506a;

    /* JADX INFO: renamed from: b */
    public static final iic f102507b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ iic[] f102508c;

    static {
        iic iicVar = new iic("Settings", 0);
        f102506a = iicVar;
        iic iicVar2 = new iic("Cancelled", 1);
        f102507b = iicVar2;
        f102508c = new iic[]{iicVar, iicVar2};
    }

    public static iic valueOf(String str) {
        return (iic) Enum.valueOf(iic.class, str);
    }

    public static iic[] values() {
        return (iic[]) f102508c.clone();
    }
}
