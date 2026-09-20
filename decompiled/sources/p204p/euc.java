package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class euc implements Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final char f62942a;

    /* JADX INFO: renamed from: b */
    public final char f62943b;

    /* JADX INFO: renamed from: c */
    public final int f62944c = 1;

    public euc(char c, char c2) {
        this.f62942a = c;
        this.f62943b = (char) xtm0.m92097r(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fuc(this.f62942a, this.f62943b, this.f62944c);
    }
}
