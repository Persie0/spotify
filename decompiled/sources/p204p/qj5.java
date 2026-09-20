package p204p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class qj5 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f189154a;

    /* JADX INFO: renamed from: b */
    public int f189155b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f189156c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uj5 f189157d;

    public qj5(uj5 uj5Var) {
        this.f189157d = uj5Var;
        this.f189154a = uj5Var.f13976c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f189156c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f189155b;
        uj5 uj5Var = this.f189157d;
        return fem.m41463k(key, uj5Var.m25312f(i)) && fem.m41463k(entry.getValue(), uj5Var.m25315i(this.f189155b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f189156c) {
            return this.f189157d.m25312f(this.f189155b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f189156c) {
            return this.f189157d.m25315i(this.f189155b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f189155b < this.f189154a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f189156c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f189155b;
        uj5 uj5Var = this.f189157d;
        Object objM25312f = uj5Var.m25312f(i);
        Object objM25315i = uj5Var.m25315i(this.f189155b);
        return (objM25312f == null ? 0 : objM25312f.hashCode()) ^ (objM25315i != null ? objM25315i.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f189155b++;
        this.f189156c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f189156c) {
            throw new IllegalStateException();
        }
        this.f189157d.m25313g(this.f189155b);
        this.f189155b--;
        this.f189154a--;
        this.f189156c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f189156c) {
            return this.f189157d.m25314h(this.f189155b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
