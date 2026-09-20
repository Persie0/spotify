package p204p;

import android.os.Looper;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cmq implements dqk0, jfm0 {

    /* JADX INFO: renamed from: a */
    public final ck90 f39758a;

    /* JADX INFO: renamed from: b */
    public final Class f39759b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f39760c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final bmq f39761d = new bmq(this, 0);

    public cmq(xoi0 xoi0Var, Class cls) {
        this.f39758a = xoi0Var;
        this.f39759b = cls;
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        jfm0 jfm0VarMo15684j0;
        ofm0 ofm0Var = (ofm0) this.f39758a.mo33098e();
        if (ofm0Var == null || (jfm0VarMo15684j0 = ofm0Var.mo15684j0(this.f39759b)) == null) {
            return null;
        }
        return jfm0VarMo15684j0.mo31538a();
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        ofm0 ofm0Var = (ofm0) obj;
        bmq bmqVar = this.f39761d;
        if (ofm0Var != null) {
            bmqVar.mo33104m(ofm0Var.mo15684j0(this.f39759b));
        } else {
            bmqVar.mo33104m(null);
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke removeObserver on a background thread");
        }
        dqk0 dqk0Var2 = (dqk0) this.f39760c.remove(dqk0Var);
        if (dqk0Var2 == null) {
            return;
        }
        dqk0Var2.mo31453b(null);
        this.f39761d.mo33102k(dqk0Var2);
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke observe on a background thread");
        }
        LinkedHashMap linkedHashMap = this.f39760c;
        if (linkedHashMap.containsKey(dqk0Var)) {
            throw new IllegalStateException("the observer already observes this property, duplicates are not allowed");
        }
        jc5 jc5Var = new jc5(3, new rlv0(), dqk0Var);
        linkedHashMap.put(dqk0Var, jc5Var);
        this.f39761d.m33100g(jc5Var);
    }
}
