package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class co40 implements Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final eh00 f40181a;

    public co40(eh00 eh00Var) {
        this.f40181a = eh00Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new do40((Iterator) this.f40181a.invoke(), 0);
    }
}
