package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class dgz implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48919a;

    /* JADX INFO: renamed from: b */
    public final Iterator f48920b;

    /* JADX INFO: renamed from: c */
    public int f48921c;

    /* JADX INFO: renamed from: d */
    public Object f48922d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qsz0 f48923e;

    public dgz(egz egzVar) {
        this.f48919a = 0;
        this.f48923e = egzVar;
        this.f48920b = egzVar.f59432a.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m35950a() {
        Iterator it = this.f48920b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((mxr) this.f48923e).f148168c.invoke(next)).booleanValue()) {
                this.f48921c = 1;
                this.f48922d = next;
                return;
            }
        }
        this.f48921c = 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m35951b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f48922d;
        if (it2 != null && it2.hasNext()) {
            this.f48921c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f48920b;
            if (!it3.hasNext()) {
                this.f48921c = 2;
                this.f48922d = null;
                return false;
            }
            Object next = it3.next();
            egz egzVar = (egz) this.f48923e;
            it = (Iterator) egzVar.f59434c.invoke(egzVar.f59433b.invoke(next));
        } while (!it.hasNext());
        this.f48922d = it;
        this.f48921c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f48919a) {
            case 0:
                int i = this.f48921c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return m35951b();
            default:
                if (this.f48921c == -1) {
                    m35950a();
                }
                return this.f48921c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f48919a) {
            case 0:
                int i = this.f48921c;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !m35951b()) {
                    throw new NoSuchElementException();
                }
                this.f48921c = 0;
                Iterator it = (Iterator) this.f48922d;
                wj50.m88279p(it);
                return it.next();
            default:
                if (this.f48921c == -1) {
                    m35950a();
                }
                if (this.f48921c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f48922d;
                this.f48922d = null;
                this.f48921c = -1;
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f48919a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dgz(mxr mxrVar) {
        this.f48919a = 1;
        this.f48923e = mxrVar;
        this.f48920b = mxrVar.f148167b.iterator();
        this.f48921c = -1;
    }
}
