package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p.y0p0[], still in use, count: 1, list:
  (r0v1 p.y0p0[]) from 0x0028: CONSTRUCTOR (r1v2 p.nzv) = (r0v1 p.y0p0[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:41) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
public final class y0p0 {
    /* JADX INFO: Fake field, exist only in values array */
    WAYPOINT_REACHED(0),
    /* JADX INFO: Fake field, exist only in values array */
    RENDERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED(2),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(3);


    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f268037b;

    /* JADX INFO: renamed from: a */
    public final int f268039a;

    static {
        nzv nzvVar = new nzv(y0p0VarArr);
        int iM31820L = c95.m31820L(i6f.m49804T(nzvVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L < 16 ? 16 : iM31820L);
        Iterator it = nzvVar.iterator();
        while (true) {
            C2042k7 c2042k7 = (C2042k7) it;
            if (!c2042k7.hasNext()) {
                f268037b = linkedHashMap;
                return;
            } else {
                Object next = c2042k7.next();
                linkedHashMap.put(Integer.valueOf(((y0p0) next).f268039a), next);
            }
        }
    }

    public y0p0(int i) {
        super(str, i);
        this.f268039a = i;
    }

    public static y0p0 valueOf(String str) {
        return (y0p0) Enum.valueOf(y0p0.class, str);
    }

    public static y0p0[] values() {
        return (y0p0[]) f268038c.clone();
    }
}
