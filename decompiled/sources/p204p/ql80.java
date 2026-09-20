package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class ql80 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f189763a;

    /* JADX INFO: renamed from: b */
    public int f189764b;

    /* JADX INFO: renamed from: c */
    public int f189765c;

    /* JADX INFO: renamed from: d */
    public int f189766d;

    /* JADX INFO: renamed from: e */
    public int f189767e;

    public ql80(CharSequence charSequence) {
        this.f189763a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f189764b;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f189767e < 0) {
            this.f189764b = 2;
            return false;
        }
        CharSequence charSequence = this.f189763a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f189765c; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f189764b = 1;
                this.f189767e = i;
                this.f189766d = length;
                return true;
            }
        }
        i = -1;
        this.f189764b = 1;
        this.f189767e = i;
        this.f189766d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f189764b = 0;
        int i = this.f189766d;
        int i2 = this.f189765c;
        this.f189765c = this.f189767e + i;
        return this.f189763a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
