package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class guc extends euc implements fte {
    static {
        new guc((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof guc)) {
            return false;
        }
        if (isEmpty() && ((guc) obj).isEmpty()) {
            return true;
        }
        guc gucVar = (guc) obj;
        return this.f62942a == gucVar.f62942a && this.f62943b == gucVar.f62943b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f62942a * 31) + this.f62943b;
    }

    @Override // p204p.fte
    public final boolean isEmpty() {
        return wj50.m88282u(this.f62942a, this.f62943b) > 0;
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: n */
    public final Comparable mo28071n() {
        return Character.valueOf(this.f62942a);
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: o */
    public final Comparable mo28072o() {
        return Character.valueOf(this.f62943b);
    }

    public final String toString() {
        return this.f62942a + ".." + this.f62943b;
    }
}
