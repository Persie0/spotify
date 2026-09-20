package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class spj0 extends ofe {

    /* JADX INFO: renamed from: g */
    public final boolean f212886g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f212887h;

    /* JADX INFO: renamed from: i */
    public final dge f212888i;

    public spj0(y751 y751Var, age ageVar, qti0 qti0Var, boolean z, int i) {
        super(y751Var, ageVar, qti0Var, du31.f52959o0);
        this.f212886g = z;
        b450 b450VarM63417Y = n0e1.m63417Y(0, i);
        ArrayList arrayList = new ArrayList(i6f.m49804T(b450VarM63417Y, 10));
        Iterator it = b450VarM63417Y.iterator();
        while (((a450) it).f12141c) {
            int iNextInt = ((t350) it).nextInt();
            arrayList.add(co91.m33491K1(this, 1, qti0.m73841e("T" + iNextInt), iNextInt, y751Var));
        }
        this.f212887h = arrayList;
        List listM69233l = p711.m69233l(this);
        int i2 = txq.f224744a;
        this.f212888i = new dge(this, listM69233l, Collections.singleton(rxq.m76665c(this).mo53211g().m50153f()), y751Var);
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: G */
    public final jfe mo30956G() {
        return null;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: V */
    public final j3b1 mo30958V() {
        return null;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: X */
    public final boolean mo28469X() {
        return false;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: a0 */
    public final boolean mo30961a0() {
        return false;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: d */
    public final boolean mo30962d() {
        return false;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: d0 */
    public final boolean mo30963d0() {
        return false;
    }

    @Override // p204p.nfe, p204p.b9e0, p204p.tqo
    /* JADX INFO: renamed from: e */
    public final uxq mo28470e() {
        return vxq.f245810e;
    }

    @Override // p204p.b9e0
    /* JADX INFO: renamed from: g0 */
    public final boolean mo28471g0() {
        return false;
    }

    @Override // p204p.d15
    public final l25 getAnnotations() {
        return e370.f55667h;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: h0 */
    public final /* bridge */ /* synthetic */ bfe0 mo30964h0() {
        return afe0.f15137b;
    }

    @Override // p204p.kxh0
    /* JADX INFO: renamed from: j0 */
    public final /* bridge */ /* synthetic */ bfe0 mo30966j0(ld70 ld70Var) {
        return afe0.f15137b;
    }

    @Override // p204p.qge
    /* JADX INFO: renamed from: k */
    public final jn91 mo27378k() {
        return this.f212888i;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: l */
    public final Collection mo30967l() {
        return gbu.f78413a;
    }

    @Override // p204p.rge
    /* JADX INFO: renamed from: n */
    public final boolean mo30968n() {
        return this.f212886g;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: p0 */
    public final int mo30969p0() {
        return 1;
    }

    @Override // p204p.nfe, p204p.rge
    /* JADX INFO: renamed from: r */
    public final List mo30970r() {
        return this.f212887h;
    }

    @Override // p204p.ofe, p204p.b9e0
    /* JADX INFO: renamed from: s */
    public final boolean mo28472s() {
        return false;
    }

    @Override // p204p.nfe, p204p.b9e0
    /* JADX INFO: renamed from: t */
    public final int mo28473t() {
        return 1;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: u */
    public final boolean mo30971u() {
        return false;
    }

    @Override // p204p.nfe
    /* JADX INFO: renamed from: y0 */
    public final boolean mo30973y0() {
        return false;
    }
}
