package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class egz implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final qsz0 f59432a;

    /* JADX INFO: renamed from: b */
    public final gh00 f59433b;

    /* JADX INFO: renamed from: c */
    public final gh00 f59434c;

    public egz(qsz0 qsz0Var, gh00 gh00Var, gh00 gh00Var2) {
        this.f59432a = qsz0Var;
        this.f59433b = gh00Var;
        this.f59434c = gh00Var2;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new dgz(this);
    }
}
