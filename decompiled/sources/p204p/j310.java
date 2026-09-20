package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class j310 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108258a;

    /* JADX INFO: renamed from: b */
    public int f108259b;

    /* JADX INFO: renamed from: c */
    public Object f108260c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f108261d;

    public j310(k310 k310Var, byte b) {
        this.f108258a = 3;
        this.f108261d = k310Var;
        this.f108260c = ((qsz0) k310Var.f118744b).iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m52245a() {
        Object objInvoke;
        k310 k310Var = (k310) this.f108261d;
        if (this.f108259b == -2) {
            objInvoke = ((eh00) k310Var.f118744b).invoke();
        } else {
            gh00 gh00Var = (gh00) k310Var.f118745c;
            Object obj = this.f108260c;
            wj50.m88279p(obj);
            objInvoke = gh00Var.invoke(obj);
        }
        this.f108260c = objInvoke;
        this.f108259b = objInvoke == null ? 0 : 1;
    }

    /* JADX INFO: renamed from: b */
    public void m52246b(int i) {
        this.f108259b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f108258a) {
            case 0:
                if (this.f108259b < 0) {
                    m52245a();
                }
                return this.f108259b == 1;
            case 1:
                return ((vsz0) this.f108260c).hasNext();
            case 2:
                return ((vsz0) this.f108260c).hasNext();
            default:
                return ((Iterator) this.f108260c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f108258a) {
            case 0:
                if (this.f108259b < 0) {
                    m52245a();
                }
                if (this.f108259b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f108260c;
                this.f108259b = -1;
                return obj;
            case 1:
                return ((vsz0) this.f108260c).next();
            case 2:
                return ((vsz0) this.f108260c).next();
            default:
                th00 th00Var = (th00) ((k310) this.f108261d).f118745c;
                int i = this.f108259b;
                this.f108259b = i + 1;
                if (i >= 0) {
                    return th00Var.invoke(Integer.valueOf(i), ((Iterator) this.f108260c).next());
                }
                h6f.m46722S();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f108258a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.f108259b;
                if (i != -1) {
                    ((opi0) this.f108261d).f167943b.m62492h(i);
                    this.f108259b = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.f108259b;
                if (i2 != -1) {
                    ((fqi0) this.f108261d).f72225b.m36654m(i2);
                    this.f108259b = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j310(k310 k310Var) {
        this.f108258a = 0;
        this.f108261d = k310Var;
        this.f108259b = -2;
    }

    public j310(fqi0 fqi0Var) {
        this.f108258a = 2;
        this.f108261d = fqi0Var;
        this.f108259b = -1;
        this.f108260c = g0b1.m43277s(new eqi0(fqi0Var, this, null));
    }

    public j310(opi0 opi0Var) {
        this.f108258a = 1;
        this.f108261d = opi0Var;
        this.f108259b = -1;
        this.f108260c = g0b1.m43277s(new npi0(opi0Var, this, null));
    }
}
