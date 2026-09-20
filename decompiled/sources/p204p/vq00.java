package p204p;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vq00 extends hsh {

    /* JADX INFO: renamed from: a */
    public final long f243820a;

    /* JADX INFO: renamed from: b */
    public final boolean f243821b;

    /* JADX INFO: renamed from: c */
    public final boolean f243822c;

    /* JADX INFO: renamed from: d */
    public final C1668ai f243823d;

    /* JADX INFO: renamed from: e */
    public HashSet f243824e;

    /* JADX INFO: renamed from: f */
    public final dqi0 f243825f;

    /* JADX INFO: renamed from: g */
    public final yum0 f243826g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xq00 f243827h;

    public vq00(xq00 xq00Var, long j, boolean z, boolean z2, C1668ai c1668ai) {
        this.f243827h = xq00Var;
        this.f243820a = j;
        this.f243821b = z;
        this.f243822c = z2;
        this.f243823d = c1668ai;
        dqi0 dqi0Var = sdy0.f208112a;
        this.f243825f = new dqi0();
        mwg1.m63037q();
        this.f243826g = sam.m77644A(vpn0.f243731d, kxq0.f127575g);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[LOOP:0: B:9:0x0018->B:22:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[EDGE_INSN: B:26:0x0067->B:23:0x0067 BREAK  A[LOOP:0: B:9:0x0018->B:22:0x0064], SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    public final void m86177A() {
        dqi0 dqi0Var = this.f243825f;
        if (dqi0Var.m36649h()) {
            HashSet hashSet = this.f243824e;
            if (hashSet != null) {
                Object[] objArr = dqi0Var.f52019b;
                long[] jArr = dqi0Var.f52018a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    xq00 xq00Var = (xq00) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(xq00Var.m91732B());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            dqi0Var.m36643b();
        }
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: a */
    public final void mo48459a(msh mshVar, th00 th00Var) {
        this.f243827h.f264812b.mo48459a(mshVar, th00Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: b */
    public final dqi0 mo48460b(msh mshVar, ej11 ej11Var, th00 th00Var) {
        return this.f243827h.f264812b.mo48460b(mshVar, ej11Var, th00Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: c */
    public final void mo48461c(q2i0 q2i0Var) {
        this.f243827h.f264812b.mo48461c(q2i0Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: d */
    public final void mo48462d() {
        this.f243827h.f264790A--;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: e */
    public final boolean mo48463e() {
        return this.f243827h.f264812b.mo48463e();
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: f */
    public final boolean mo48464f() {
        return this.f243821b;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: g */
    public final boolean mo48465g() {
        return this.f243822c;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: h */
    public final long mo48466h() {
        return this.f243820a;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: i */
    public final gsh mo48467i() {
        return this.f243827h.f264818h;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: j */
    public final wpn0 mo48468j() {
        return (wpn0) this.f243826g.getValue();
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: k */
    public final juk mo48469k() {
        return this.f243827h.f264812b.mo48469k();
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: l */
    public final C1668ai mo48470l() {
        return this.f243823d;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: m */
    public final boolean mo48471m() {
        return this.f243827h.f264812b.mo48471m();
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: n */
    public final void mo48472n(q2i0 q2i0Var) {
        this.f243827h.f264812b.mo48472n(q2i0Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: o */
    public final void mo48473o(msh mshVar) {
        xq00 xq00Var = this.f243827h;
        xq00Var.f264812b.mo48473o(xq00Var.f264818h);
        xq00Var.f264812b.mo48473o(mshVar);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: p */
    public final void mo48474p(q2i0 q2i0Var, p2i0 p2i0Var, ug5 ug5Var) {
        this.f243827h.f264812b.mo48474p(q2i0Var, p2i0Var, ug5Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: q */
    public final p2i0 mo48475q(q2i0 q2i0Var) {
        return this.f243827h.f264812b.mo48475q(q2i0Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: r */
    public final dqi0 mo48476r(msh mshVar, ej11 ej11Var, dqi0 dqi0Var) {
        return this.f243827h.f264812b.mo48476r(mshVar, ej11Var, dqi0Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: s */
    public final void mo48477s(Set set) {
        HashSet hashSet = this.f243824e;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f243824e = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: t */
    public final void mo48478t(xq00 xq00Var) {
        this.f243825f.m36642a(xq00Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: u */
    public final void mo48479u(pgv0 pgv0Var) {
        this.f243827h.f264812b.mo48479u(pgv0Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: v */
    public final void mo48480v(msh mshVar) {
        this.f243827h.f264812b.mo48480v(mshVar);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: w */
    public final nqb mo48481w(ag70 ag70Var) {
        return this.f243827h.f264812b.mo48481w(ag70Var);
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: x */
    public final void mo48482x() {
        this.f243827h.f264790A++;
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: y */
    public final void mo48483y(xq00 xq00Var) {
        HashSet hashSet = this.f243824e;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(xq00Var.m91732B());
            }
        }
        if (xq00Var != null) {
            this.f243825f.m36653l(xq00Var);
        }
    }

    @Override // p204p.hsh
    /* JADX INFO: renamed from: z */
    public final void mo48484z(msh mshVar) {
        this.f243827h.f264812b.mo48484z(mshVar);
    }
}
