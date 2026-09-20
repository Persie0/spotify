package p204p;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class x4l0 implements x8b {

    /* JADX INFO: renamed from: a */
    public final yuw0 f258146a;

    /* JADX INFO: renamed from: b */
    public final Object f258147b;

    /* JADX INFO: renamed from: c */
    public final Object[] f258148c;

    /* JADX INFO: renamed from: d */
    public final w8b f258149d;

    /* JADX INFO: renamed from: e */
    public final tpk f258150e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f258151f;

    /* JADX INFO: renamed from: g */
    public zuu0 f258152g;

    /* JADX INFO: renamed from: h */
    public Throwable f258153h;

    /* JADX INFO: renamed from: i */
    public boolean f258154i;

    public x4l0(yuw0 yuw0Var, Object obj, Object[] objArr, w8b w8bVar, tpk tpkVar) {
        this.f258146a = yuw0Var;
        this.f258147b = obj;
        this.f258148c = objArr;
        this.f258149d = w8bVar;
        this.f258150e = tpkVar;
    }

    @Override // p204p.x8b
    /* JADX INFO: renamed from: a */
    public final o2x0 mo52178a() {
        y8b y8bVarM89903c;
        synchronized (this) {
            if (this.f258154i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f258154i = true;
            y8bVarM89903c = m89903c();
        }
        if (this.f258151f) {
            ((zuu0) y8bVarM89903c).cancel();
        }
        return m89904d(((zuu0) y8bVarM89903c).m97071g());
    }

    /* JADX INFO: renamed from: b */
    public final zuu0 m89902b() {
        rth rthVar;
        ph30 ph30VarM76382c;
        yuw0 yuw0Var = this.f258146a;
        lqg1[] lqg1VarArr = yuw0Var.f276495k;
        Object[] objArr = this.f258148c;
        int length = objArr.length;
        if (length != lqg1VarArr.length) {
            throw new IllegalArgumentException(klh.m56832d(lqg1VarArr.length, ")", klh.m56838j(length, "Argument count (", ") doesn't match expected count (")));
        }
        fuw0 fuw0Var = new fuw0(yuw0Var.f276488d, yuw0Var.f276487c, yuw0Var.f276489e, yuw0Var.f276490f, yuw0Var.f276491g, yuw0Var.f276492h, yuw0Var.f276493i, yuw0Var.f276494j);
        if (yuw0Var.f276496l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            lqg1VarArr[i].mo39937r(fuw0Var, objArr[i]);
        }
        rth rthVar2 = fuw0Var.f73591d;
        if (rthVar2 != null) {
            ph30VarM76382c = rthVar2.m76382c();
        } else {
            String str = fuw0Var.f73590c;
            ph30 ph30Var = fuw0Var.f73589b;
            ph30Var.getClass();
            try {
                rthVar = new rth();
                rthVar.m76391l(ph30Var, str);
            } catch (IllegalArgumentException unused) {
                rthVar = null;
            }
            ph30VarM76382c = rthVar != null ? rthVar.m76382c() : null;
            if (ph30VarM76382c == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + ph30Var + ", Relative: " + fuw0Var.f73590c);
            }
        }
        euw0 na20Var = fuw0Var.f73598k;
        if (na20Var == null) {
            i5z i5zVar = fuw0Var.f73597j;
            if (i5zVar != null) {
                na20Var = i5zVar.m49784p();
            } else {
                oge0 oge0Var = fuw0Var.f73596i;
                if (oge0Var != null) {
                    na20Var = oge0Var.m66886g();
                } else if (fuw0Var.f73595h) {
                    na20Var = qbn0.m72501b(0, null, new byte[0]);
                }
            }
        }
        ayd0 ayd0Var = fuw0Var.f73594g;
        sep sepVar = fuw0Var.f73593f;
        if (ayd0Var != null) {
            if (na20Var != null) {
                na20Var = new na20(2, na20Var, ayd0Var);
            } else {
                sepVar.m77929c("Content-Type", ayd0Var.f21211a);
            }
        }
        ztw0 ztw0Var = fuw0Var.f73592e;
        ztw0Var.f286275a = ph30VarM76382c;
        ztw0Var.f286277c = sepVar.m77935i().m78536e();
        ztw0Var.m96951d(fuw0Var.f73588a, na20Var);
        ztw0Var.m96953f(zn50.class, new zn50(yuw0Var.f276485a, this.f258147b, yuw0Var.f276486b, arrayList));
        return ((z4l0) this.f258149d).m95348b(new auw0(ztw0Var));
    }

    /* JADX INFO: renamed from: c */
    public final y8b m89903c() throws IOException {
        zuu0 zuu0Var = this.f258152g;
        if (zuu0Var != null) {
            return zuu0Var;
        }
        Throwable th = this.f258153h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            zuu0 zuu0VarM89902b = m89902b();
            this.f258152g = zuu0VarM89902b;
            return zuu0VarM89902b;
        } catch (IOException | Error | RuntimeException e) {
            zn91.m96574r0(e);
            this.f258153h = e;
            throw e;
        }
    }

    @Override // p204p.x8b
    public final void cancel() {
        zuu0 zuu0Var;
        this.f258151f = true;
        synchronized (this) {
            zuu0Var = this.f258152g;
        }
        if (zuu0Var != null) {
            zuu0Var.cancel();
        }
    }

    public final Object clone() {
        return new x4l0(this.f258146a, this.f258147b, this.f258148c, this.f258149d, this.f258150e);
    }

    /* JADX INFO: renamed from: d */
    public final o2x0 m89904d(n2x0 n2x0Var) throws IOException {
        p3x0 p3x0Var = n2x0Var.f149863g;
        z1x0 z1x0VarM63572c = n2x0Var.m63572c();
        z1x0VarM63572c.f278428g = new w4l0(p3x0Var.mo28082f(), p3x0Var.mo28081e());
        n2x0 n2x0VarM95164a = z1x0VarM63572c.m95164a();
        int i = n2x0VarM95164a.f149860d;
        if (i < 200 || i >= 300) {
            try {
                npa npaVar = new npa();
                p3x0Var.mo28080C1().mo45429w1(npaVar);
                return o2x0.m66139b(new o3x0(p3x0Var.mo28082f(), p3x0Var.mo28081e(), npaVar), n2x0VarM95164a);
            } finally {
                p3x0Var.close();
            }
        }
        if (i == 204 || i == 205) {
            p3x0Var.close();
            return o2x0.m66141d(null, n2x0VarM95164a);
        }
        v4l0 v4l0Var = new v4l0(p3x0Var);
        try {
            return o2x0.m66141d(this.f258150e.mo26363k(v4l0Var), n2x0VarM95164a);
        } catch (RuntimeException e) {
            IOException iOException = v4l0Var.f237203d;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // p204p.x8b
    /* JADX INFO: renamed from: f */
    public final synchronized boolean mo52179f() {
        return this.f258154i;
    }

    @Override // p204p.x8b
    /* JADX INFO: renamed from: n */
    public final synchronized auw0 mo52180n() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((zuu0) m89903c()).f286531b;
    }

    @Override // p204p.x8b
    /* JADX INFO: renamed from: o */
    public final boolean mo52181o() {
        boolean z = true;
        if (this.f258151f) {
            return true;
        }
        synchronized (this) {
            try {
                zuu0 zuu0Var = this.f258152g;
                if (zuu0Var == null || !zuu0Var.f286524P0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p204p.x8b
    /* JADX INFO: renamed from: p */
    public final void mo52182p(hab habVar) {
        zuu0 zuu0Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f258154i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f258154i = true;
                zuu0Var = this.f258152g;
                th = this.f258153h;
                if (zuu0Var == null && th == null) {
                    try {
                        zuu0 zuu0VarM89902b = m89902b();
                        this.f258152g = zuu0VarM89902b;
                        zuu0Var = zuu0VarM89902b;
                    } catch (Throwable th2) {
                        th = th2;
                        zn91.m96574r0(th);
                        this.f258153h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            habVar.mo25646l(this, th);
            return;
        }
        if (this.f258151f) {
            zuu0Var.cancel();
        }
        zuu0Var.m97070e(new u4l0(this, habVar));
    }

    @Override // p204p.x8b
    /* JADX INFO: renamed from: clone */
    public final x8b mo98369clone() {
        return new x4l0(this.f258146a, this.f258147b, this.f258148c, this.f258149d, this.f258150e);
    }
}
