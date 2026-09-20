package p204p;

import android.os.Looper;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class c651 implements dqk0, jfm0 {

    /* JADX INFO: renamed from: a */
    public final ck90 f34392a;

    /* JADX INFO: renamed from: b */
    public final Class f34393b;

    /* JADX INFO: renamed from: d */
    public jfm0 f34395d;

    /* JADX INFO: renamed from: e */
    public qfm0 f34396e;

    /* JADX INFO: renamed from: f */
    public boolean f34397f;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f34394c = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public final b651 f34398g = new b651(this);

    /* JADX INFO: renamed from: h */
    public final ccf0 f34399h = new ccf0(this, 14);

    public c651(xoi0 xoi0Var, Class cls) {
        this.f34392a = xoi0Var;
        this.f34393b = cls;
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        qfm0 qfm0VarMo31538a;
        jfm0 jfm0Var = this.f34395d;
        if (jfm0Var != null && (qfm0VarMo31538a = jfm0Var.mo31538a()) != null) {
            return qfm0VarMo31538a;
        }
        if (this.f34397f) {
            return this.f34396e;
        }
        return null;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        ofm0 ofm0Var = (ofm0) obj;
        jfm0 jfm0Var = this.f34395d;
        ccf0 ccf0Var = this.f34399h;
        if (jfm0Var != null) {
            jfm0Var.mo31539c(ccf0Var);
        }
        if (ofm0Var == null) {
            this.f34395d = null;
            this.f34397f = true;
            this.f34398g.m33101j(this.f34396e);
        } else {
            jfm0 jfm0VarMo15684j0 = ofm0Var.mo15684j0(this.f34393b);
            this.f34395d = jfm0VarMo15684j0;
            if (jfm0VarMo15684j0 != null) {
                jfm0VarMo15684j0.mo31540d(ccf0Var);
            }
            this.f34397f = false;
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke removeObserver on a background thread");
        }
        if (this.f34394c.remove(dqk0Var)) {
            this.f34398g.mo33102k(dqk0Var);
            dqk0Var.mo31453b(null);
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke observe on a background thread");
        }
        LinkedHashSet linkedHashSet = this.f34394c;
        if (linkedHashSet.contains(dqk0Var)) {
            throw new IllegalStateException("The observer already observes this property, duplicates are not allowed");
        }
        linkedHashSet.add(dqk0Var);
        this.f34398g.m33100g(dqk0Var);
    }
}
