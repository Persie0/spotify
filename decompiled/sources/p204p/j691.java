package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j691 implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final qsz0 f109257a;

    /* JADX INFO: renamed from: b */
    public final gh00 f109258b;

    public j691(gh00 gh00Var, qsz0 qsz0Var) {
        this.f109257a = qsz0Var;
        this.f109258b = gh00Var;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new tv51(this);
    }
}
