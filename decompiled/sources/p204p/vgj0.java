package p204p;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 p.vgj0, still in use, count: 1, list:
  (r1v0 p.vgj0) from 0x00e0: INVOKE (r0v15 android.util.SparseArray), (0 int), (r1v0 p.vgj0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:225)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class vgj0 {
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(0),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS(2),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL(3),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(7),
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY(8),
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA(10),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS(11),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS(12),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI_P2P(13),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IA(14),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_EMERGENCY(15),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(16),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(17),
    NONE(-1);


    /* JADX INFO: renamed from: c */
    public static final SparseArray f241252c;

    /* JADX INFO: renamed from: a */
    public final int f241254a;

    static {
        vgj0 vgj0Var = NONE;
        SparseArray sparseArray = new SparseArray();
        f241252c = sparseArray;
        sparseArray.put(0, vgj0Var);
        sparseArray.put(1, vgj0Var);
        sparseArray.put(2, vgj0Var);
        sparseArray.put(3, vgj0Var);
        sparseArray.put(4, vgj0Var);
        sparseArray.put(5, vgj0Var);
        sparseArray.put(6, vgj0Var);
        sparseArray.put(7, vgj0Var);
        sparseArray.put(8, vgj0Var);
        sparseArray.put(9, vgj0Var);
        sparseArray.put(10, vgj0Var);
        sparseArray.put(11, vgj0Var);
        sparseArray.put(12, vgj0Var);
        sparseArray.put(13, vgj0Var);
        sparseArray.put(14, vgj0Var);
        sparseArray.put(15, vgj0Var);
        sparseArray.put(16, vgj0Var);
        sparseArray.put(17, vgj0Var);
        sparseArray.put(-1, vgj0Var);
    }

    public vgj0(int i) {
        super(str, i);
        this.f241254a = i;
    }

    public static vgj0 valueOf(String str) {
        return (vgj0) Enum.valueOf(vgj0.class, str);
    }

    public static vgj0[] values() {
        return (vgj0[]) f241253d.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m85487a() {
        return this.f241254a;
    }
}
