package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vz8 implements nad0 {

    /* JADX INFO: renamed from: b */
    public final long f246410b;

    /* JADX INFO: renamed from: c */
    public final long f246411c;

    /* JADX INFO: renamed from: d */
    public long f246412d;

    public vz8(long j, long j2) {
        this.f246410b = j;
        this.f246411c = j2;
        this.f246412d = j - 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m86873d() {
        long j = this.f246412d;
        if (j < this.f246410b || j > this.f246411c) {
            throw new NoSuchElementException();
        }
    }

    @Override // p204p.nad0
    public final boolean next() {
        long j = this.f246412d + 1;
        this.f246412d = j;
        return !(j > this.f246411c);
    }
}
