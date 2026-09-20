package p204p;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wv21 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255322a;

    /* JADX INFO: renamed from: b */
    public int f255323b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f255324c;

    /* JADX INFO: renamed from: d */
    public Iterator f255325d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractMap f255326e;

    public /* synthetic */ wv21(AbstractMap abstractMap, int i) {
        this.f255322a = i;
        this.f255326e = abstractMap;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m89076a() {
        switch (this.f255322a) {
            case 0:
                if (this.f255325d == null) {
                    this.f255325d = ((nv21) this.f255326e).f158770c.entrySet().iterator();
                }
                break;
            case 1:
                if (this.f255325d == null) {
                    this.f255325d = ((ov21) this.f255326e).f170408c.entrySet().iterator();
                }
                break;
            default:
                if (this.f255325d == null) {
                    this.f255325d = ((pv21) this.f255326e).f181581c.entrySet().iterator();
                }
                break;
        }
        return this.f255325d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f255322a) {
            case 0:
                int i = this.f255323b + 1;
                nv21 nv21Var = (nv21) this.f255326e;
                if (i >= nv21Var.f158769b) {
                    return !nv21Var.f158770c.isEmpty() && m89076a().hasNext();
                }
                return true;
            case 1:
                return this.f255323b + 1 < ((ov21) this.f255326e).f170407b.size() || m89076a().hasNext();
            default:
                int i2 = this.f255323b + 1;
                pv21 pv21Var = (pv21) this.f255326e;
                if (i2 >= pv21Var.f181580b.size()) {
                    return !pv21Var.f181581c.isEmpty() && m89076a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f255322a) {
            case 0:
                this.f255324c = true;
                int i = this.f255323b + 1;
                this.f255323b = i;
                nv21 nv21Var = (nv21) this.f255326e;
                return i < nv21Var.f158769b ? (tv21) nv21Var.f158768a[i] : (Map.Entry) m89076a().next();
            case 1:
                this.f255324c = true;
                int i2 = this.f255323b + 1;
                this.f255323b = i2;
                ov21 ov21Var = (ov21) this.f255326e;
                return i2 < ov21Var.f170407b.size() ? (Map.Entry) ov21Var.f170407b.get(this.f255323b) : (Map.Entry) m89076a().next();
            default:
                this.f255324c = true;
                int i3 = this.f255323b + 1;
                this.f255323b = i3;
                pv21 pv21Var = (pv21) this.f255326e;
                return i3 < pv21Var.f181580b.size() ? (Map.Entry) pv21Var.f181580b.get(this.f255323b) : (Map.Entry) m89076a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f255322a;
        AbstractMap abstractMap = this.f255326e;
        switch (i) {
            case 0:
                nv21 nv21Var = (nv21) abstractMap;
                if (!this.f255324c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f255324c = false;
                int i2 = nv21.f158767g;
                nv21Var.m65714b();
                int i3 = this.f255323b;
                if (i3 >= nv21Var.f158769b) {
                    m89076a().remove();
                    return;
                } else {
                    this.f255323b = i3 - 1;
                    nv21Var.m65719h(i3);
                    return;
                }
            case 1:
                ov21 ov21Var = (ov21) abstractMap;
                if (!this.f255324c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f255324c = false;
                int i4 = ov21.f170405f;
                ov21Var.m68111b();
                if (this.f255323b >= ov21Var.f170407b.size()) {
                    m89076a().remove();
                    return;
                }
                int i5 = this.f255323b;
                this.f255323b = i5 - 1;
                ov21Var.m68115f(i5);
                return;
            default:
                pv21 pv21Var = (pv21) abstractMap;
                if (!this.f255324c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f255324c = false;
                int i6 = pv21.f181578g;
                pv21Var.m71106b();
                if (this.f255323b >= pv21Var.f181580b.size()) {
                    m89076a().remove();
                    return;
                }
                int i7 = this.f255323b;
                this.f255323b = i7 - 1;
                pv21Var.m71111g(i7);
                return;
        }
    }
}
