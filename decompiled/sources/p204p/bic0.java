package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class bic0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f27388a;

    /* JADX INFO: renamed from: b */
    public int f27389b = -1;

    /* JADX INFO: renamed from: c */
    public fic0 f27390c;

    /* JADX INFO: renamed from: d */
    public AtomicReferenceArray f27391d;

    /* JADX INFO: renamed from: e */
    public dic0 f27392e;

    /* JADX INFO: renamed from: f */
    public zic0 f27393f;

    /* JADX INFO: renamed from: g */
    public zic0 f27394g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ajc0 f27395h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f27396i;

    public bic0(ajc0 ajc0Var, int i) {
        this.f27396i = i;
        this.f27395h = ajc0Var;
        this.f27388a = ajc0Var.f16233c.length - 1;
        m29308a();
    }

    /* JADX INFO: renamed from: a */
    public final void m29308a() {
        this.f27393f = null;
        if (m29312e() || m29313f()) {
            return;
        }
        while (true) {
            int i = this.f27388a;
            if (i < 0) {
                return;
            }
            fic0[] fic0VarArr = this.f27395h.f16233c;
            this.f27388a = i - 1;
            fic0 fic0Var = fic0VarArr[i];
            this.f27390c = fic0Var;
            if (fic0Var.f69843b != 0) {
                AtomicReferenceArray atomicReferenceArray = this.f27390c.f69846e;
                this.f27391d = atomicReferenceArray;
                this.f27389b = atomicReferenceArray.length() - 1;
                if (m29313f()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29309b(dic0 dic0Var) {
        fic0 fic0Var;
        ajc0 ajc0Var = this.f27395h;
        try {
            Object key = dic0Var.getKey();
            Object value = dic0Var.getKey() == null ? null : dic0Var.getValue();
            if (value == null) {
                return false;
            }
            this.f27393f = new zic0(ajc0Var, key, value);
            return true;
        } finally {
            this.f27390c.m41708g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m29310c() {
        return m29311d();
    }

    /* JADX INFO: renamed from: d */
    public final zic0 m29311d() {
        zic0 zic0Var = this.f27393f;
        if (zic0Var == null) {
            throw new NoSuchElementException();
        }
        this.f27394g = zic0Var;
        m29308a();
        return this.f27394g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m29312e() {
        dic0 dic0Var = this.f27392e;
        if (dic0Var == null) {
            return false;
        }
        while (true) {
            this.f27392e = dic0Var.mo26068c();
            dic0 dic0Var2 = this.f27392e;
            if (dic0Var2 == null) {
                return false;
            }
            if (m29309b(dic0Var2)) {
                return true;
            }
            dic0Var = this.f27392e;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m29313f() {
        while (true) {
            int i = this.f27389b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f27391d;
            this.f27389b = i - 1;
            dic0 dic0Var = (dic0) atomicReferenceArray.get(i);
            this.f27392e = dic0Var;
            if (dic0Var != null && (m29309b(dic0Var) || m29312e())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27393f != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f27396i) {
            case 1:
                return m29311d().f283127b;
            case 2:
                return m29311d().f283128c;
            default:
                return m29310c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        c95.m31856v(this.f27394g != null, "no calls to next() since the last call to remove()");
        this.f27395h.remove(this.f27394g.f283127b);
        this.f27394g = null;
    }
}
