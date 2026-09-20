package p204p;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b6j implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f23973a;

    public b6j(qsz0 qsz0Var) {
        this.f23973a = new AtomicReference(qsz0Var);
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        qsz0 qsz0Var = (qsz0) this.f23973a.getAndSet(null);
        if (qsz0Var != null) {
            return qsz0Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
