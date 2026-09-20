package p204p;

import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wz8 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f256518a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f256519b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final zk1 f256520c = new zk1((Serializable) new CopyOnWriteArrayList(), 0, (Object) null, 20);

    /* JADX INFO: renamed from: d */
    public final ehs f256521d = new ehs();

    /* JADX INFO: renamed from: e */
    public Looper f256522e;

    /* JADX INFO: renamed from: f */
    public qp71 f256523f;

    /* JADX INFO: renamed from: g */
    public w9p0 f256524g;

    /* JADX INFO: renamed from: h */
    public at8 f256525h;

    /* JADX INFO: renamed from: a */
    public final void m89406a(Handler handler, fhs fhsVar) {
        handler.getClass();
        fhsVar.getClass();
        ehs ehsVar = this.f256521d;
        ehsVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ehsVar.f59657c;
        dhs dhsVar = new dhs();
        dhsVar.f49146a = handler;
        dhsVar.f49147b = fhsVar;
        copyOnWriteArrayList.add(dhsVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m89407b(Handler handler, ctd0 ctd0Var) {
        handler.getClass();
        zk1 zk1Var = this.f256520c;
        zk1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) zk1Var.f283579b;
        btd0 btd0Var = new btd0();
        btd0Var.f30554a = handler;
        btd0Var.f30555b = ctd0Var;
        copyOnWriteArrayList.add(btd0Var);
    }

    /* JADX INFO: renamed from: c */
    public boolean mo27866c(ufd0 ufd0Var) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final zk1 m89408e(vsd0 vsd0Var) {
        return new zk1((Serializable) this.f256520c.f283579b, 0, (Object) vsd0Var, 20);
    }

    /* JADX INFO: renamed from: f */
    public abstract xhd0 mo27867f(vsd0 vsd0Var, mn3 mn3Var, long j);

    /* JADX INFO: renamed from: g */
    public final void m89409g(wsd0 wsd0Var) {
        HashSet hashSet = this.f256519b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(wsd0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo67695h();
    }

    /* JADX INFO: renamed from: i */
    public final void m89410i(wsd0 wsd0Var) {
        this.f256522e.getClass();
        HashSet hashSet = this.f256519b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(wsd0Var);
        if (zIsEmpty) {
            mo67696j();
        }
    }

    /* JADX INFO: renamed from: k */
    public qp71 mo44607k() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public abstract ufd0 mo27868l();

    /* JADX INFO: renamed from: n */
    public boolean mo44608n() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo27869o();

    /* JADX INFO: renamed from: p */
    public void mo33612p(qp71 qp71Var) {
        m89412t(qp71Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m89411q(wsd0 wsd0Var, w9p0 w9p0Var, at8 at8Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f256522e;
        c95.m31843i(looper == null || looper == looperMyLooper);
        this.f256524g = w9p0Var;
        this.f256525h = at8Var;
        qp71 qp71Var = this.f256523f;
        this.f256518a.add(wsd0Var);
        if (this.f256522e == null) {
            this.f256522e = looperMyLooper;
            this.f256519b.add(wsd0Var);
            mo27870s(at8Var.mo27125d());
        } else if (qp71Var != null) {
            m89410i(wsd0Var);
            wsd0Var.mo35153a(this, qp71Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo27870s(x491 x491Var);

    /* JADX INFO: renamed from: t */
    public final void m89412t(qp71 qp71Var) {
        this.f256523f = qp71Var;
        Iterator it = this.f256518a.iterator();
        while (it.hasNext()) {
            ((wsd0) it.next()).mo35153a(this, qp71Var);
        }
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo27871v(xhd0 xhd0Var);

    /* JADX INFO: renamed from: w */
    public final void m89413w(wsd0 wsd0Var) {
        ArrayList arrayList = this.f256518a;
        arrayList.remove(wsd0Var);
        if (!arrayList.isEmpty()) {
            m89409g(wsd0Var);
            return;
        }
        this.f256522e = null;
        this.f256523f = null;
        this.f256524g = null;
        this.f256519b.clear();
        mo27872x();
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo27872x();

    /* JADX INFO: renamed from: y */
    public final void m89414y(fhs fhsVar) {
        CopyOnWriteArrayList<dhs> copyOnWriteArrayList = this.f256521d.f59657c;
        for (dhs dhsVar : copyOnWriteArrayList) {
            if (dhsVar.f49147b == fhsVar) {
                copyOnWriteArrayList.remove(dhsVar);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m89415z(ctd0 ctd0Var) {
        CopyOnWriteArrayList<btd0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f256520c.f283579b;
        for (btd0 btd0Var : copyOnWriteArrayList) {
            if (btd0Var.f30555b == ctd0Var) {
                copyOnWriteArrayList.remove(btd0Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo67695h() {
    }

    /* JADX INFO: renamed from: j */
    public void mo67696j() {
    }

    /* JADX INFO: renamed from: A */
    public void mo27864A(ufd0 ufd0Var) {
    }
}
