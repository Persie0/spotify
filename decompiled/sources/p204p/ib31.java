package p204p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ib31 implements vw41, Map, tq60 {

    /* JADX INFO: renamed from: a */
    public hb31 f100425a;

    /* JADX INFO: renamed from: b */
    public final va31 f100426b;

    /* JADX INFO: renamed from: c */
    public final va31 f100427c;

    /* JADX INFO: renamed from: d */
    public final va31 f100428d;

    public ib31() {
        cjc.m32945k();
        eqn0 eqn0Var = eqn0.f61927c;
        oa31 oa31VarM82674j = ua31.m82674j();
        hb31 hb31Var = new hb31(oa31VarM82674j.mo28818g(), eqn0Var);
        if (!(oa31VarM82674j instanceof sg10)) {
            hb31Var.f20764b = new hb31(1, eqn0Var);
        }
        this.f100425a = hb31Var;
        this.f100426b = new va31(this, 0);
        this.f100427c = new va31(this, 1);
        this.f100428d = new va31(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m50116a(ib31 ib31Var, hb31 hb31Var, int i, frn0 frn0Var) {
        boolean z;
        synchronized (r9g1.f197058a) {
            if (hb31Var.m46980e() == i) {
                hb31Var.m46981f(frn0Var);
                z = true;
                hb31Var.m46982g(hb31Var.m46980e() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final hb31 m50117b() {
        return (hb31) ua31.m82684t(this.f100425a, this);
    }

    @Override // java.util.Map
    public final void clear() {
        oa31 oa31VarM58609h;
        hb31 hb31Var = (hb31) ua31.m82672h(this.f100425a);
        cjc.m32945k();
        eqn0 eqn0Var = eqn0.f61927c;
        if (eqn0Var != hb31Var.m46979d()) {
            hb31 hb31Var2 = this.f100425a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                hb31 hb31Var3 = (hb31) ua31.m82686v(hb31Var2, this, oa31VarM58609h);
                synchronized (r9g1.f197058a) {
                    hb31Var3.m46981f(eqn0Var);
                    hb31Var3.m46982g(hb31Var3.m46980e() + 1);
                }
            }
            ua31.m82678n(oa31VarM58609h, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m50117b().m46979d().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m50117b().m46979d().containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f100426b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m50117b().m46979d().get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((AbstractC2328r7) m50117b().m46979d()).isEmpty();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f100425a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f100427c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        frn0 frn0VarM46979d;
        int iM46980e;
        Object objPut;
        oa31 oa31VarM58609h;
        boolean zM50116a;
        do {
            synchronized (r9g1.f197058a) {
                hb31 hb31Var = (hb31) ua31.m82672h(this.f100425a);
                frn0VarM46979d = hb31Var.m46979d();
                iM46980e = hb31Var.m46980e();
            }
            wj50.m88279p(frn0VarM46979d);
            iqn0 iqn0Var = (iqn0) frn0VarM46979d.mo39729e();
            objPut = iqn0Var.put(obj, obj2);
            frn0 frn0VarBuild = iqn0Var.build();
            if (wj50.m88271j(frn0VarBuild, frn0VarM46979d)) {
                break;
            }
            hb31 hb31Var2 = this.f100425a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM50116a = m50116a(this, (hb31) ua31.m82686v(hb31Var2, this, oa31VarM58609h), iM46980e, frn0VarBuild);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM50116a);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        frn0 frn0VarM46979d;
        int iM46980e;
        oa31 oa31VarM58609h;
        boolean zM50116a;
        do {
            synchronized (r9g1.f197058a) {
                hb31 hb31Var = (hb31) ua31.m82672h(this.f100425a);
                frn0VarM46979d = hb31Var.m46979d();
                iM46980e = hb31Var.m46980e();
            }
            wj50.m88279p(frn0VarM46979d);
            iqn0 iqn0Var = (iqn0) frn0VarM46979d.mo39729e();
            iqn0Var.putAll(map);
            frn0 frn0VarBuild = iqn0Var.build();
            if (wj50.m88271j(frn0VarBuild, frn0VarM46979d)) {
                return;
            }
            hb31 hb31Var2 = this.f100425a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM50116a = m50116a(this, (hb31) ua31.m82686v(hb31Var2, this, oa31VarM58609h), iM46980e, frn0VarBuild);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM50116a);
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        this.f100425a = (hb31) ax41Var;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        frn0 frn0VarM46979d;
        int iM46980e;
        Object objRemove;
        oa31 oa31VarM58609h;
        boolean zM50116a;
        do {
            synchronized (r9g1.f197058a) {
                hb31 hb31Var = (hb31) ua31.m82672h(this.f100425a);
                frn0VarM46979d = hb31Var.m46979d();
                iM46980e = hb31Var.m46980e();
            }
            wj50.m88279p(frn0VarM46979d);
            drn0 drn0VarMo39729e = frn0VarM46979d.mo39729e();
            objRemove = drn0VarMo39729e.remove(obj);
            frn0 frn0VarBuild = drn0VarMo39729e.build();
            if (wj50.m88271j(frn0VarBuild, frn0VarM46979d)) {
                break;
            }
            hb31 hb31Var2 = this.f100425a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM50116a = m50116a(this, (hb31) ua31.m82686v(hb31Var2, this, oa31VarM58609h), iM46980e, frn0VarBuild);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM50116a);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return ((AbstractC2328r7) m50117b().m46979d()).mo36659c();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((hb31) ua31.m82672h(this.f100425a)).m46979d() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f100428d;
    }
}
