package p204p;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class kdx0 implements ListIterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121746a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f121747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f121748c;

    public kdx0(mdx0 mdx0Var, int i) {
        this.f121748c = mdx0Var;
        this.f121747b = mdx0Var.f142526a.listIterator(g6f.m43719f0(i, mdx0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f121746a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f121747b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f121746a) {
            case 0:
                return ((ListIterator) this.f121747b).hasPrevious();
            case 1:
                return ((ListIterator) this.f121747b).hasPrevious();
            default:
                return ((plv0) this.f121747b).f178796a < ((fr51) this.f121748c).f72374d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f121746a) {
            case 0:
                return ((ListIterator) this.f121747b).hasNext();
            case 1:
                return ((ListIterator) this.f121747b).hasNext();
            default:
                return ((plv0) this.f121747b).f178796a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f121746a) {
            case 0:
                return ((ListIterator) this.f121747b).previous();
            case 1:
                return ((ListIterator) this.f121747b).previous();
            default:
                plv0 plv0Var = (plv0) this.f121747b;
                int i = plv0Var.f178796a + 1;
                fr51 fr51Var = (fr51) this.f121748c;
                q9g1.m72392o(i, fr51Var.f72374d);
                plv0Var.f178796a = i;
                return fr51Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f121746a) {
            case 0:
                ldx0 ldx0Var = (ldx0) this.f121748c;
                return h6f.m46714K(ldx0Var) - ((ListIterator) this.f121747b).previousIndex();
            case 1:
                mdx0 mdx0Var = (mdx0) this.f121748c;
                return h6f.m46714K(mdx0Var) - ((ListIterator) this.f121747b).previousIndex();
            default:
                return ((plv0) this.f121747b).f178796a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f121746a) {
            case 0:
                return ((ListIterator) this.f121747b).next();
            case 1:
                return ((ListIterator) this.f121747b).next();
            default:
                plv0 plv0Var = (plv0) this.f121747b;
                int i = plv0Var.f178796a;
                fr51 fr51Var = (fr51) this.f121748c;
                q9g1.m72392o(i, fr51Var.f72374d);
                plv0Var.f178796a = i - 1;
                return fr51Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f121746a) {
            case 0:
                ldx0 ldx0Var = (ldx0) this.f121748c;
                return h6f.m46714K(ldx0Var) - ((ListIterator) this.f121747b).nextIndex();
            case 1:
                mdx0 mdx0Var = (mdx0) this.f121748c;
                return h6f.m46714K(mdx0Var) - ((ListIterator) this.f121747b).nextIndex();
            default:
                return ((plv0) this.f121747b).f178796a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f121746a) {
            case 0:
                ((ListIterator) this.f121747b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f121746a) {
            case 0:
                ((ListIterator) this.f121747b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public kdx0(ldx0 ldx0Var, int i) {
        this.f121748c = ldx0Var;
        this.f121747b = ldx0Var.f132373a.listIterator(g6f.m43719f0(i, ldx0Var));
    }

    public kdx0(plv0 plv0Var, fr51 fr51Var) {
        this.f121747b = plv0Var;
        this.f121748c = fr51Var;
    }
}
