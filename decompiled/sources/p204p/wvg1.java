package p204p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class wvg1 extends ox8 {
    /* JADX INFO: renamed from: f1 */
    public final void m89123f1(Object[] objArr, Object obj) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            fug1 fug1Var = (fug1) this.f170906a;
            if (fug1Var == null) {
                fug1Var = new fug1();
                this.f170906a = fug1Var;
            }
            qvg1 qvg1Var = (qvg1) fug1Var.get(obj);
            if (qvg1Var == null) {
                int iMax = listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4;
                nsf1.m65535u(iMax, "expectedSize");
                qvg1Var = new qvg1();
                nsf1.m65535u(iMax, "initialCapacity");
                qvg1Var.f193017a = new Object[iMax];
                qvg1Var.f193018b = 0;
                qvg1Var.f193020d = new Object[tvg1.m81608j(iMax)];
                fug1 fug1Var2 = (fug1) this.f170906a;
                if (fug1Var2 == null) {
                    fug1Var2 = new fug1();
                    this.f170906a = fug1Var2;
                }
                fug1Var2.put(obj, qvg1Var);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                nsf1.m65534t(obj, next);
                if (qvg1Var.f193020d != null) {
                    int iM81608j = tvg1.m81608j(qvg1Var.f193018b);
                    Object[] objArr2 = qvg1Var.f193020d;
                    if (iM81608j <= objArr2.length) {
                        int length = objArr2.length - 1;
                        int iHashCode = next.hashCode();
                        int iM39679O = epv0.m39679O(iHashCode);
                        while (true) {
                            int i = iM39679O & length;
                            Object[] objArr3 = qvg1Var.f193020d;
                            Object obj2 = objArr3[i];
                            if (obj2 != null) {
                                if (obj2.equals(next)) {
                                    break;
                                } else {
                                    iM39679O = i + 1;
                                }
                            } else {
                                objArr3[i] = next;
                                qvg1Var.f193021e += iHashCode;
                                qvg1Var.m74031a(next);
                                break;
                            }
                        }
                    }
                }
                qvg1Var.f193020d = null;
                qvg1Var.m74031a(next);
            }
        }
    }
}
