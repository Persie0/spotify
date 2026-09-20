package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class a450 extends t350 {

    /* JADX INFO: renamed from: a */
    public final int f12139a;

    /* JADX INFO: renamed from: b */
    public final int f12140b;

    /* JADX INFO: renamed from: c */
    public boolean f12141c;

    /* JADX INFO: renamed from: d */
    public int f12142d;

    public a450(int i, int i2, int i3) {
        this.f12139a = i3;
        this.f12140b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f12141c = z;
        this.f12142d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12141c;
    }

    @Override // p204p.t350
    public final int nextInt() {
        int i = this.f12142d;
        if (i != this.f12140b) {
            this.f12142d = this.f12139a + i;
            return i;
        }
        if (!this.f12141c) {
            throw new NoSuchElementException();
        }
        this.f12141c = false;
        return i;
    }
}
