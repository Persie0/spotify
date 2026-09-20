package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ddr {

    /* JADX INFO: renamed from: a */
    public static final ddr f47852a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ddr[] f47853b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nzv f47854c;

    static {
        ddr ddrVar = new ddr("DEFAULT", 0);
        f47852a = ddrVar;
        ddr[] ddrVarArr = {ddrVar, new ddr("ML_BASED", 1), new ddr("BLE_PROXIMITY", 2)};
        f47853b = ddrVarArr;
        f47854c = new nzv(ddrVarArr);
    }

    public static ddr valueOf(String str) {
        return (ddr) Enum.valueOf(ddr.class, str);
    }

    public static ddr[] values() {
        return (ddr[]) f47853b.clone();
    }
}
