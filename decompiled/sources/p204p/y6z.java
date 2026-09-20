package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class y6z implements l25 {

    /* JADX INFO: renamed from: a */
    public final l25 f269918a;

    /* JADX INFO: renamed from: b */
    public final b321 f269919b;

    public y6z(l25 l25Var, b321 b321Var) {
        this.f269918a = l25Var;
        this.f269919b = b321Var;
    }

    @Override // p204p.l25
    /* JADX INFO: renamed from: M */
    public final y15 mo55148M(y400 y400Var) {
        if (((Boolean) this.f269919b.invoke(y400Var)).booleanValue()) {
            return this.f269918a.mo55148M(y400Var);
        }
        return null;
    }

    @Override // p204p.l25
    public final boolean isEmpty() {
        l25 l25Var = this.f269918a;
        if ((l25Var instanceof Collection) && ((Collection) l25Var).isEmpty()) {
            return false;
        }
        Iterator it = l25Var.iterator();
        while (it.hasNext()) {
            y400 y400VarMo51608b = ((y15) it.next()).mo51608b();
            if (y400VarMo51608b != null && ((Boolean) this.f269919b.invoke(y400VarMo51608b)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f269918a) {
            y400 y400VarMo51608b = ((y15) obj).mo51608b();
            if (y400VarMo51608b != null && ((Boolean) this.f269919b.invoke(y400VarMo51608b)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // p204p.l25
    /* JADX INFO: renamed from: r0 */
    public final boolean mo55149r0(y400 y400Var) {
        if (((Boolean) this.f269919b.invoke(y400Var)).booleanValue()) {
            return this.f269918a.mo55149r0(y400Var);
        }
        return false;
    }
}
