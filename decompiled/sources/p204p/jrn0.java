package p204p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class jrn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public Object f115236a;

    /* JADX INFO: renamed from: b */
    public final hrn0 f115237b;

    /* JADX INFO: renamed from: c */
    public Object f115238c = t6x0.f217624Q0;

    /* JADX INFO: renamed from: d */
    public boolean f115239d;

    /* JADX INFO: renamed from: e */
    public int f115240e;

    /* JADX INFO: renamed from: f */
    public int f115241f;

    public jrn0(Object obj, hrn0 hrn0Var) {
        this.f115236a = obj;
        this.f115237b = hrn0Var;
        this.f115240e = hrn0Var.f94492d.f94226e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tn80 next() {
        hrn0 hrn0Var = this.f115237b;
        if (hrn0Var.f94492d.f94226e != this.f115240e) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f115236a;
        this.f115238c = obj;
        this.f115239d = true;
        this.f115241f++;
        V v = hrn0Var.f94492d.get(obj);
        if (v == 0) {
            throw new ConcurrentModificationException(edb.m38568q(new StringBuilder("Hash code of a key ("), this.f115236a, ") has changed after it was added to the persistent map."));
        }
        tn80 tn80Var = (tn80) v;
        this.f115236a = tn80Var.f221906c;
        return tn80Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f115241f < this.f115237b.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f115239d) {
            throw new IllegalStateException();
        }
        Object obj = this.f115238c;
        hrn0 hrn0Var = this.f115237b;
        hrn0Var.remove(obj);
        this.f115238c = null;
        this.f115239d = false;
        this.f115240e = hrn0Var.f94492d.f94226e;
        this.f115241f--;
    }
}
