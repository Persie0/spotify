package p204p;

import java.util.Iterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.z2t0[], still in use, count: 1, list:
  (r0v1 p.z2t0[]) from 0x003c: CONSTRUCTOR (r0v1 p.z2t0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class z2t0 {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);


    /* JADX INFO: renamed from: b */
    public static final z2t0[] f278666b;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ nzv f278673i;

    /* JADX INFO: renamed from: a */
    public final int f278674a;

    static {
        Object next;
        f278673i = new nzv(z2t0VarArr);
        z2t0[] z2t0VarArr = new z2t0[8];
        for (int i = 0; i < 8; i++) {
            Iterator it = f278673i.iterator();
            do {
                C2042k7 c2042k7 = (C2042k7) it;
                if (!c2042k7.hasNext()) {
                    next = null;
                    break;
                }
                next = c2042k7.next();
            } while (((z2t0) next).f278674a != i);
            z2t0 z2t0Var = (z2t0) next;
            if (z2t0Var == null) {
                z2t0Var = INVALID;
            }
            z2t0VarArr[i] = z2t0Var;
        }
        f278666b = z2t0VarArr;
    }

    public z2t0(int i) {
        super(str, i);
        this.f278674a = i;
    }

    public static z2t0 valueOf(String str) {
        return (z2t0) Enum.valueOf(z2t0.class, str);
    }

    public static z2t0[] values() {
        return (z2t0[]) f278672h.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m95233a(int i) {
        return (i << 3) | this.f278674a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return edb.m38567p(sb, this.f278674a, ')');
    }
}
