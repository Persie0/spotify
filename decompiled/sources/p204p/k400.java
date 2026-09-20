package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k400 extends ywy {

    /* JADX INFO: renamed from: c */
    public final ywy f119035c;

    public k400(ywy ywyVar) {
        this.f119035c = ywyVar;
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: a */
    public final ai21 mo40342a(tbn0 tbn0Var) {
        return this.f119035c.mo40342a(tbn0Var);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: c */
    public final void mo39301c(tbn0 tbn0Var, tbn0 tbn0Var2) {
        this.f119035c.mo39301c(tbn0Var, tbn0Var2);
    }

    @Override // p204p.ywy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f119035c.close();
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: e */
    public final void mo40343e(tbn0 tbn0Var) {
        this.f119035c.mo40343e(tbn0Var);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: f */
    public final void mo40344f(tbn0 tbn0Var) {
        this.f119035c.mo40344f(tbn0Var);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: g */
    public final List mo40345g(tbn0 tbn0Var) {
        List listMo40345g = this.f119035c.mo40345g(tbn0Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo40345g.iterator();
        while (it.hasNext()) {
            arrayList.add((tbn0) it.next());
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: h */
    public final jwy mo39302h(tbn0 tbn0Var) {
        jwy jwyVarMo39302h = this.f119035c.mo39302h(tbn0Var);
        if (jwyVarMo39302h == null) {
            return null;
        }
        tbn0 tbn0Var2 = jwyVarMo39302h.f116738c;
        return tbn0Var2 == null ? jwyVarMo39302h : new jwy(jwyVarMo39302h.f116736a, jwyVarMo39302h.f116737b, tbn0Var2, jwyVarMo39302h.f116739d, jwyVarMo39302h.f116740e, jwyVarMo39302h.f116741f, jwyVarMo39302h.f116742g, jwyVarMo39302h.f116743h);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: i */
    public final xn60 mo40346i(tbn0 tbn0Var) {
        return this.f119035c.mo40346i(tbn0Var);
    }

    @Override // p204p.ywy
    /* JADX INFO: renamed from: n */
    public final wt31 mo40348n(tbn0 tbn0Var) {
        return this.f119035c.mo40348n(tbn0Var);
    }

    public final String toString() {
        return qpv0.f191387a.mo54112b(getClass()).mo29111F() + '(' + this.f119035c + ')';
    }
}
