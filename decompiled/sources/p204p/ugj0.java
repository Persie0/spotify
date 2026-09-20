package p204p;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ugj0 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f230194a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ugj0[] f230195b;

    /* JADX INFO: Fake field, exist only in values array */
    ugj0 EF1;

    static {
        ugj0 ugj0Var = new ugj0("UNKNOWN_MOBILE_SUBTYPE", 0);
        ugj0 ugj0Var2 = new ugj0("GPRS", 1);
        ugj0 ugj0Var3 = new ugj0("EDGE", 2);
        ugj0 ugj0Var4 = new ugj0("UMTS", 3);
        ugj0 ugj0Var5 = new ugj0("CDMA", 4);
        ugj0 ugj0Var6 = new ugj0("EVDO_0", 5);
        ugj0 ugj0Var7 = new ugj0("EVDO_A", 6);
        ugj0 ugj0Var8 = new ugj0("RTT", 7);
        ugj0 ugj0Var9 = new ugj0("HSDPA", 8);
        ugj0 ugj0Var10 = new ugj0("HSUPA", 9);
        ugj0 ugj0Var11 = new ugj0("HSPA", 10);
        ugj0 ugj0Var12 = new ugj0("IDEN", 11);
        ugj0 ugj0Var13 = new ugj0("EVDO_B", 12);
        ugj0 ugj0Var14 = new ugj0("LTE", 13);
        ugj0 ugj0Var15 = new ugj0("EHRPD", 14);
        ugj0 ugj0Var16 = new ugj0("HSPAP", 15);
        ugj0 ugj0Var17 = new ugj0("GSM", 16);
        ugj0 ugj0Var18 = new ugj0("TD_SCDMA", 17);
        ugj0 ugj0Var19 = new ugj0("IWLAN", 18);
        ugj0 ugj0Var20 = new ugj0("LTE_CA", 19);
        f230195b = new ugj0[]{ugj0Var, ugj0Var2, ugj0Var3, ugj0Var4, ugj0Var5, ugj0Var6, ugj0Var7, ugj0Var8, ugj0Var9, ugj0Var10, ugj0Var11, ugj0Var12, ugj0Var13, ugj0Var14, ugj0Var15, ugj0Var16, ugj0Var17, ugj0Var18, ugj0Var19, ugj0Var20, new ugj0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f230194a = sparseArray;
        sparseArray.put(0, ugj0Var);
        sparseArray.put(1, ugj0Var2);
        sparseArray.put(2, ugj0Var3);
        sparseArray.put(3, ugj0Var4);
        sparseArray.put(4, ugj0Var5);
        sparseArray.put(5, ugj0Var6);
        sparseArray.put(6, ugj0Var7);
        sparseArray.put(7, ugj0Var8);
        sparseArray.put(8, ugj0Var9);
        sparseArray.put(9, ugj0Var10);
        sparseArray.put(10, ugj0Var11);
        sparseArray.put(11, ugj0Var12);
        sparseArray.put(12, ugj0Var13);
        sparseArray.put(13, ugj0Var14);
        sparseArray.put(14, ugj0Var15);
        sparseArray.put(15, ugj0Var16);
        sparseArray.put(16, ugj0Var17);
        sparseArray.put(17, ugj0Var18);
        sparseArray.put(18, ugj0Var19);
        sparseArray.put(19, ugj0Var20);
    }

    public static ugj0 valueOf(String str) {
        return (ugj0) Enum.valueOf(ugj0.class, str);
    }

    public static ugj0[] values() {
        return (ugj0[]) f230195b.clone();
    }
}
