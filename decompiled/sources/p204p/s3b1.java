package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class s3b1 extends g4b1 implements dtm0, f4b1 {

    /* JADX INFO: renamed from: X */
    public final gd70 f205254X;

    /* JADX INFO: renamed from: Y */
    public final s3b1 f205255Y;

    /* JADX INFO: renamed from: g */
    public final int f205256g;

    /* JADX INFO: renamed from: h */
    public final boolean f205257h;

    /* JADX INFO: renamed from: i */
    public final boolean f205258i;

    /* JADX INFO: renamed from: t */
    public final boolean f205259t;

    public s3b1(cab cabVar, s3b1 s3b1Var, int i, l25 l25Var, qti0 qti0Var, gd70 gd70Var, boolean z, boolean z2, boolean z3, gd70 gd70Var2, du31 du31Var) {
        super(cabVar, l25Var, qti0Var, gd70Var, du31Var);
        this.f205256g = i;
        this.f205257h = z;
        this.f205258i = z2;
        this.f205259t = z3;
        this.f205254X = gd70Var2;
        this.f205255Y = s3b1Var == null ? this : s3b1Var;
    }

    /* JADX INFO: renamed from: H1 */
    public s3b1 mo74627H1(qi00 qi00Var, qti0 qti0Var, int i) {
        return new s3b1(qi00Var, null, i, getAnnotations(), qti0Var, getType(), m77123I1(), this.f205258i, this.f205259t, this.f205254X, du31.f52959o0);
    }

    /* JADX INFO: renamed from: I1 */
    public final boolean m77123I1() {
        return this.f205257h && ((eab) ((cab) super.mo27379o())).mo38278l0() != 2;
    }

    /* JADX INFO: renamed from: J1 */
    public final cab m77124J1() {
        return (cab) super.mo27379o();
    }

    @Override // p204p.rqo, p204p.pqo, p204p.oqo
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public final s3b1 mo27377a() {
        s3b1 s3b1Var = this.f205255Y;
        return s3b1Var == this ? this : s3b1Var.mo27377a();
    }

    @Override // p204p.f4b1
    /* JADX INFO: renamed from: P */
    public final boolean mo40725P() {
        return false;
    }

    @Override // p204p.tqo
    /* JADX INFO: renamed from: e */
    public final uxq mo28470e() {
        return vxq.f245811f;
    }

    @Override // p204p.yu51
    /* JADX INFO: renamed from: f */
    public final qqo mo29932f(oo91 oo91Var) {
        if (oo91Var.f167518a.mo26562e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p204p.f4b1
    /* JADX INFO: renamed from: i0 */
    public final /* bridge */ /* synthetic */ i5j mo40727i0() {
        return null;
    }

    @Override // p204p.rqo, p204p.oqo
    /* JADX INFO: renamed from: o */
    public final oqo mo27379o() {
        return (cab) super.mo27379o();
    }

    @Override // p204p.cab
    /* JADX INFO: renamed from: p */
    public final Collection mo32019p() {
        Collection collectionMo32019p = ((cab) super.mo27379o()).mo32019p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(collectionMo32019p, 10));
        Iterator it = collectionMo32019p.iterator();
        while (it.hasNext()) {
            arrayList.add((s3b1) ((cab) it.next()).mo32015K().get(this.f205256g));
        }
        return arrayList;
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28180c(this, obj);
    }
}
