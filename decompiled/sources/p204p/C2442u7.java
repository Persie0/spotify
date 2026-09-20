package p204p;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p.u7 */
/* JADX INFO: loaded from: classes4.dex */
public class C2442u7 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227462a = 2;

    /* JADX INFO: renamed from: b */
    public final Iterator f227463b;

    /* JADX INFO: renamed from: c */
    public Object f227464c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f227465d;

    public C2442u7(ydf1 ydf1Var, ListIterator listIterator) {
        this.f227465d = ydf1Var;
        this.f227464c = ydf1Var.f271749b;
        this.f227463b = listIterator;
    }

    /* JADX INFO: renamed from: a */
    public void m82475a() {
        AbstractC1732c8 abstractC1732c8 = (AbstractC1732c8) this.f227465d;
        abstractC1732c8.m31766b();
        if (abstractC1732c8.f35054b != ((Collection) this.f227464c)) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82476b() {
        ydf1 ydf1Var = (ydf1) this.f227465d;
        ydf1Var.zzb();
        if (ydf1Var.f271749b != ((Collection) this.f227464c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f227462a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                m82475a();
                break;
            case 3:
                break;
            default:
                m82476b();
                break;
        }
        return this.f227463b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f227462a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f227463b.next();
                this.f227464c = (Collection) entry.getValue();
                return ((C2485v7) this.f227465d).m84819a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f227463b.next();
                this.f227464c = entry2;
                return entry2.getKey();
            case 2:
                m82475a();
                return this.f227463b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.f227463b.next();
                this.f227464c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                qgf1 qgf1Var = (qgf1) ((C2485v7) this.f227465d).f238000e;
                qgf1Var.getClass();
                List list = (List) collection;
                return new tjf1(key, list instanceof RandomAccess ? new uaf1(qgf1Var, key, list, null) : new ydf1(qgf1Var, key, list, null));
            default:
                m82476b();
                return this.f227463b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f227462a) {
            case 0:
                c95.m31856v(((Collection) this.f227464c) != null, "no calls to next() since the last call to remove()");
                this.f227463b.remove();
                ((AbstractC1888g8) ((C2485v7) this.f227465d).f238000e).f77372f -= ((Collection) this.f227464c).size();
                ((Collection) this.f227464c).clear();
                this.f227464c = null;
                return;
            case 1:
                c95.m31856v(((Map.Entry) this.f227464c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.f227464c).getValue();
                this.f227463b.remove();
                ((C2523w7) this.f227465d).f248500c.f77372f -= collection.size();
                collection.clear();
                this.f227464c = null;
                return;
            case 2:
                this.f227463b.remove();
                AbstractC1732c8 abstractC1732c8 = (AbstractC1732c8) this.f227465d;
                abstractC1732c8.f35057e.f77372f--;
                abstractC1732c8.m31767d();
                return;
            case 3:
                if (!(((Collection) this.f227464c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f227463b.remove();
                ((qgf1) ((C2485v7) this.f227465d).f238000e).getClass();
                ((Collection) this.f227464c).size();
                ((Collection) this.f227464c).clear();
                this.f227464c = null;
                return;
            default:
                this.f227463b.remove();
                ((ydf1) this.f227465d).m93431a();
                return;
        }
    }

    public C2442u7(C2485v7 c2485v7, byte b) {
        this.f227465d = c2485v7;
        this.f227463b = c2485v7.f237997b.entrySet().iterator();
    }

    public C2442u7(ydf1 ydf1Var) {
        Iterator it;
        this.f227465d = ydf1Var;
        Collection collection = ydf1Var.f271749b;
        this.f227464c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f227463b = it;
    }

    public C2442u7(AbstractC1732c8 abstractC1732c8) {
        Iterator it;
        this.f227465d = abstractC1732c8;
        Collection collection = abstractC1732c8.f35054b;
        this.f227464c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f227463b = it;
    }

    public C2442u7(C1805e8 c1805e8, ListIterator listIterator) {
        this.f227465d = c1805e8;
        this.f227464c = c1805e8.f35054b;
        this.f227463b = listIterator;
    }

    public C2442u7(C2523w7 c2523w7, Iterator it) {
        this.f227463b = it;
        this.f227465d = c2523w7;
    }

    public C2442u7(C2485v7 c2485v7) {
        this.f227465d = c2485v7;
        this.f227463b = c2485v7.f237997b.entrySet().iterator();
    }
}
