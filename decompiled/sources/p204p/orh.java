package p204p;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class orh extends wz8 {

    /* JADX INFO: renamed from: i */
    public final HashMap f168566i = new HashMap();

    /* JADX INFO: renamed from: t */
    public Handler f168567t;

    /* JADX INFO: renamed from: D */
    public abstract vsd0 mo44601D(Object obj, vsd0 vsd0Var);

    /* JADX INFO: renamed from: G */
    public abstract void mo44604G(Object obj, wz8 wz8Var, qp71 qp71Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.lrh, p.wsd0] */
    /* JADX INFO: renamed from: H */
    public final void m67694H(final Object obj, wz8 wz8Var) {
        HashMap map = this.f168566i;
        c95.m31843i(!map.containsKey(obj));
        ?? r1 = new wsd0() { // from class: p.lrh
            @Override // p204p.wsd0
            /* JADX INFO: renamed from: a */
            public final void mo35153a(wz8 wz8Var2, qp71 qp71Var) {
                this.f136314a.mo44604G(obj, wz8Var2, qp71Var);
            }
        };
        mrh mrhVar = new mrh(this, obj);
        map.put(obj, new nrh(wz8Var, r1, mrhVar));
        Handler handler = this.f168567t;
        handler.getClass();
        wz8Var.m89407b(handler, mrhVar);
        Handler handler2 = this.f168567t;
        handler2.getClass();
        wz8Var.m89406a(handler2, mrhVar);
        w9p0 w9p0Var = this.f256524g;
        w9p0Var.getClass();
        at8 at8Var = this.f256525h;
        at8Var.getClass();
        wz8Var.m89411q(r1, w9p0Var, at8Var);
        if (this.f256519b.isEmpty()) {
            wz8Var.m89409g(r1);
        }
    }

    @Override // p204p.wz8
    /* JADX INFO: renamed from: h */
    public final void mo67695h() {
        for (nrh nrhVar : this.f168566i.values()) {
            nrhVar.f157559a.m89409g(nrhVar.f157560b);
        }
    }

    @Override // p204p.wz8
    /* JADX INFO: renamed from: j */
    public final void mo67696j() {
        for (nrh nrhVar : this.f168566i.values()) {
            nrhVar.f157559a.m89410i(nrhVar.f157560b);
        }
    }

    @Override // p204p.wz8
    /* JADX INFO: renamed from: o */
    public void mo27869o() {
        Iterator it = this.f168566i.values().iterator();
        while (it.hasNext()) {
            ((nrh) it.next()).f157559a.mo27869o();
        }
    }

    @Override // p204p.wz8
    /* JADX INFO: renamed from: x */
    public void mo27872x() {
        HashMap map = this.f168566i;
        for (nrh nrhVar : map.values()) {
            wz8 wz8Var = nrhVar.f157559a;
            mrh mrhVar = nrhVar.f157561c;
            wz8Var.m89413w(nrhVar.f157560b);
            wz8Var.m89415z(mrhVar);
            wz8Var.m89414y(mrhVar);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: E */
    public long mo44602E(long j, Object obj) {
        return j;
    }

    /* JADX INFO: renamed from: F */
    public int mo44603F(int i, Object obj) {
        return i;
    }
}
