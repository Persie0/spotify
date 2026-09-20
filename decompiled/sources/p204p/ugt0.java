package p204p;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ugt0 {

    /* JADX INFO: renamed from: a */
    public static final ugt0 f230257a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ugt0[] f230258b;

    static {
        ugt0 ugt0Var = new ugt0("DEFAULT", 0);
        f230257a = ugt0Var;
        ugt0 ugt0Var2 = new ugt0("UNMETERED_ONLY", 1);
        ugt0 ugt0Var3 = new ugt0("UNMETERED_OR_DAILY", 2);
        ugt0 ugt0Var4 = new ugt0("FAST_IF_RADIO_AWAKE", 3);
        ugt0 ugt0Var5 = new ugt0("NEVER", 4);
        ugt0 ugt0Var6 = new ugt0("UNRECOGNIZED", 5);
        f230258b = new ugt0[]{ugt0Var, ugt0Var2, ugt0Var3, ugt0Var4, ugt0Var5, ugt0Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, ugt0Var);
        sparseArray.put(1, ugt0Var2);
        sparseArray.put(2, ugt0Var3);
        sparseArray.put(3, ugt0Var4);
        sparseArray.put(4, ugt0Var5);
        sparseArray.put(-1, ugt0Var6);
    }

    public static ugt0 valueOf(String str) {
        return (ugt0) Enum.valueOf(ugt0.class, str);
    }

    public static ugt0[] values() {
        return (ugt0[]) f230258b.clone();
    }
}
