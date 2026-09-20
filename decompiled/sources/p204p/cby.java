package p204p;

import android.os.Looper;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class cby implements jfm0 {

    /* JADX INFO: renamed from: a */
    public final jfm0 f36263a;

    /* JADX INFO: renamed from: b */
    public final jfm0 f36264b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f36265c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final hzd0 f36266d = sam.m77676o(new bby(this));

    public cby(jfm0 jfm0Var, jfm0 jfm0Var2) {
        this.f36263a = jfm0Var;
        this.f36264b = jfm0Var2;
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        qfm0 qfm0VarMo31538a = this.f36263a.mo31538a();
        return qfm0VarMo31538a == null ? this.f36264b.mo31538a() : qfm0VarMo31538a;
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke removeObserver on a background thread");
        }
        if (this.f36265c.remove(dqk0Var)) {
            this.f36266d.mo33102k(dqk0Var);
            dqk0Var.mo31453b(null);
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Cannot invoke observe on a background thread");
        }
        LinkedHashSet linkedHashSet = this.f36265c;
        if (linkedHashSet.contains(dqk0Var)) {
            throw new IllegalStateException("The observer already observes this property, duplicates are not allowed");
        }
        linkedHashSet.add(dqk0Var);
        this.f36266d.m33100g(dqk0Var);
    }
}
