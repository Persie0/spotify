package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n25 implements l25 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149628a;

    /* JADX INFO: renamed from: b */
    public final Object f149629b;

    public /* synthetic */ n25(Object obj, int i) {
        this.f149628a = i;
        this.f149629b = obj;
    }

    @Override // p204p.l25
    /* JADX INFO: renamed from: M */
    public final y15 mo55148M(y400 y400Var) {
        Object next;
        switch (this.f149628a) {
            case 0:
                Iterator it = iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (wj50.m88271j(((y15) next).mo51608b(), y400Var)) {
                        return (y15) next;
                    }
                }
                next = null;
                return (y15) next;
            case 1:
                return (y15) btz0.m30482F(btz0.m30491O(new arh(y400Var, 0), new ek5((List) this.f149629b, 1)));
            default:
                if (y400Var.equals((y400) this.f149629b)) {
                    return uav.f228559a;
                }
                return null;
        }
    }

    @Override // p204p.l25
    public final boolean isEmpty() {
        switch (this.f149628a) {
            case 0:
                return ((List) this.f149629b).isEmpty();
            case 1:
                List list = (List) this.f149629b;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((l25) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f149628a) {
            case 0:
                return ((List) this.f149629b).iterator();
            case 1:
                return new dgz(btz0.m30483G(a53.f12387R0, new ek5((List) this.f149629b, 1)));
            default:
                return kau.f120963a;
        }
    }

    @Override // p204p.l25
    /* JADX INFO: renamed from: r0 */
    public final boolean mo55149r0(y400 y400Var) {
        switch (this.f149628a) {
            case 0:
                return mo55148M(y400Var) != null;
            case 1:
                Iterator it = ((List) this.f149629b).iterator();
                while (it.hasNext()) {
                    if (((l25) it.next()).mo55149r0(y400Var)) {
                        return true;
                    }
                }
                return false;
            default:
                return mo55148M(y400Var) != null;
        }
    }

    public String toString() {
        switch (this.f149628a) {
            case 0:
                return ((List) this.f149629b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n25(l25[] l25VarArr) {
        this(bk5.m29620k1(l25VarArr), 1);
        this.f149628a = 1;
    }
}
