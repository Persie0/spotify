package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a7z implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final qsz0 f13149a;

    /* JADX INFO: renamed from: b */
    public final boolean f13150b;

    /* JADX INFO: renamed from: c */
    public final gh00 f13151c;

    public a7z(qsz0 qsz0Var, boolean z, gh00 gh00Var) {
        this.f13149a = qsz0Var;
        this.f13150b = z;
        this.f13151c = gh00Var;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new z6z(this);
    }
}
