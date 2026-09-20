package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class g4r0 extends gla1 {

    /* JADX INFO: renamed from: v */
    public static final v3r0 f76505v = new v3r0();

    /* JADX INFO: renamed from: w */
    public static final zb20 f76506w = e95.m38211p();

    /* JADX INFO: renamed from: o */
    public d4r0 f76507o;

    /* JADX INFO: renamed from: p */
    public Executor f76508p;

    /* JADX INFO: renamed from: q */
    public rxz0 f76509q;

    /* JADX INFO: renamed from: r */
    public ue40 f76510r;

    /* JADX INFO: renamed from: s */
    public v761 f76511s;

    /* JADX INFO: renamed from: t */
    public s861 f76512t;

    /* JADX INFO: renamed from: u */
    public sxz0 f76513u;

    /* JADX INFO: renamed from: B */
    public final void m43545B() {
        sxz0 sxz0Var = this.f76513u;
        if (sxz0Var != null) {
            sxz0Var.m79672b();
            this.f76513u = null;
        }
        ue40 ue40Var = this.f76510r;
        if (ue40Var != null) {
            ue40Var.mo61983a();
            this.f76510r = null;
        }
        v761 v761Var = this.f76511s;
        if (v761Var != null) {
            v761Var.m84842b();
            this.f76511s = null;
        }
        this.f76512t = null;
    }

    /* JADX INFO: renamed from: C */
    public final void m43546C(d4r0 d4r0Var) {
        hxg1.m49006s();
        if (d4r0Var == null) {
            this.f76507o = null;
            this.f81037c = 2;
            m45119o();
            return;
        }
        this.f76507o = d4r0Var;
        this.f76508p = f76506w;
        j28 j28Var = this.f81041g;
        if ((j28Var != null ? j28Var.f107950a : null) != null) {
            m43547D((i5r0) this.f81040f, j28Var);
            m45118n();
        }
        m45117m();
    }

    /* JADX INFO: renamed from: D */
    public final void m43547D(i5r0 i5r0Var, j28 j28Var) {
        hxg1.m49006s();
        ifb ifbVarM45109b = m45109b();
        Objects.requireNonNull(ifbVarM45109b);
        m43545B();
        wj50.m88281r(null, this.f76511s == null);
        Matrix matrix = this.f81044j;
        boolean zMo50434n = ifbVarM45109b.mo50434n();
        Size size = j28Var.f107950a;
        Rect rect = this.f81043i;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int iM45113g = m45113g(ifbVarM45109b, m45115k(ifbVarM45109b));
        y940 y940Var = (y940) this.f81040f;
        sy7 sy7Var = y940.f270499Q;
        v761 v761Var = new v761(1, 34, j28Var, matrix, zMo50434n, rect, iM45113g, ((Integer) y940Var.mo39830f(sy7Var, -1)).intValue(), ifbVarM45109b.mo50434n() && m45115k(ifbVarM45109b));
        this.f76511s = v761Var;
        ig10 ig10Var = new ig10(this, 24);
        hxg1.m49006s();
        v761Var.m84841a();
        v761Var.f238080m.add(ig10Var);
        s861 s861VarM84843c = this.f76511s.m84843c(ifbVarM45109b, true);
        this.f76512t = s861VarM84843c;
        this.f76510r = s861VarM84843c.f206586k;
        if (this.f76507o != null) {
            ifb ifbVarM45109b2 = m45109b();
            v761 v761Var2 = this.f76511s;
            if (ifbVarM45109b2 != null && v761Var2 != null) {
                hxg1.m48987B(new lci0(v761Var2, m45113g(ifbVarM45109b2, m45115k(ifbVarM45109b2)), ((Integer) ((y940) this.f81040f).mo39830f(sy7Var, -1)).intValue(), 2));
            }
            d4r0 d4r0Var = this.f76507o;
            d4r0Var.getClass();
            s861 s861Var = this.f76512t;
            s861Var.getClass();
            this.f76508p.execute(new mpd0(13, d4r0Var, s861Var));
        }
        rxz0 rxz0VarM76683d = rxz0.m76683d(i5r0Var, j28Var.f107950a);
        xvb xvbVar = rxz0VarM76683d.f193768b;
        Range range = j28Var.f107952c;
        xvbVar.getClass();
        ((lpi0) xvbVar.f266338d).m59673v(yvb.f276631j, range);
        int iM53666p = i5r0Var.m53666p();
        if (iM53666p != 0) {
            xvbVar.getClass();
            if (iM53666p != 0) {
                ((lpi0) xvbVar.f266338d).m59673v(jla1.f113570G0, Integer.valueOf(iM53666p));
            }
        }
        phi phiVar = j28Var.f107953d;
        if (phiVar != null) {
            xvbVar.m92221i(phiVar);
        }
        if (this.f76507o != null) {
            rxz0VarM76683d.m76685b(this.f76510r, j28Var.f107951b, ((Integer) ((y940) this.f81040f).mo39830f(y940.f270500R, -1)).intValue());
        }
        sxz0 sxz0Var = this.f76513u;
        if (sxz0Var != null) {
            sxz0Var.m79672b();
        }
        sxz0 sxz0Var2 = new sxz0(new q340(this, 3));
        this.f76513u = sxz0Var2;
        rxz0VarM76683d.f193772f = sxz0Var2;
        this.f76509q = rxz0VarM76683d;
        Object[] objArr = {rxz0VarM76683d.m76686c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m45107A(Collections.unmodifiableList(arrayList));
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: e */
    public final jla1 mo43548e(boolean z, mla1 mla1Var) {
        f76505v.getClass();
        i5r0 i5r0Var = v3r0.f236928a;
        phi phiVarMo56820a = mla1Var.mo56820a(i5r0Var.mo53667q(), 1);
        if (z) {
            phiVarMo56820a = phi.m70006r(phiVarMo56820a, i5r0Var);
        }
        if (phiVarMo56820a == null) {
            return null;
        }
        return new i5r0(jvl0.m54384j(((o440) mo43550j(phiVarMo56820a)).f161549b));
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: i */
    public final Set mo43549i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: j */
    public final ila1 mo43550j(phi phiVar) {
        return new o440(lpi0.m59672u(phiVar), 1);
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: r */
    public final jla1 mo43551r(gfb gfbVar, ila1 ila1Var) {
        ((lpi0) ila1Var.mo25090f()).m59673v(t640.f217444M, 34);
        return ila1Var.mo51006i();
    }

    public final String toString() {
        return "Preview:".concat(m45112f());
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: u */
    public final j28 mo43552u(phi phiVar) {
        this.f76509q.m76684a(phiVar);
        Object[] objArr = {this.f76509q.m76686c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m45107A(Collections.unmodifiableList(arrayList));
        cxe cxeVarM52211a = this.f81041g.m52211a();
        cxeVarM52211a.f43014d = phiVar;
        return cxeVarM52211a.m34297i();
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: v */
    public final j28 mo43553v(j28 j28Var, j28 j28Var2) {
        m43547D((i5r0) this.f81040f, j28Var);
        return j28Var;
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: w */
    public final void mo43554w() {
        m43545B();
    }

    @Override // p204p.gla1
    /* JADX INFO: renamed from: y */
    public final void mo43555y(Rect rect) {
        this.f81043i = rect;
        ifb ifbVarM45109b = m45109b();
        v761 v761Var = this.f76511s;
        if (ifbVarM45109b == null || v761Var == null) {
            return;
        }
        hxg1.m48987B(new lci0(v761Var, m45113g(ifbVarM45109b, m45115k(ifbVarM45109b)), ((Integer) ((y940) this.f81040f).mo39830f(y940.f270499Q, -1)).intValue(), 2));
    }
}
