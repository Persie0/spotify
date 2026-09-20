package p204p;

import android.content.Context;
import android.view.View;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class xrt0 extends AbstractC2441u6 implements ovf {

    /* JADX INFO: renamed from: L0 */
    public final yum0 f265407L0;

    /* JADX INFO: renamed from: t */
    public final xrt0 f265408t;

    public xrt0(Context context) {
        super(context, null, 0);
        this.f265408t = this;
        this.f265407L0 = sam.m77645B(new vrt0(""));
    }

    private final vrt0 getState() {
        return (vrt0) this.f265407L0.getValue();
    }

    private final void setState(vrt0 vrt0Var) {
        this.f265407L0.setValue(vrt0Var);
    }

    /* JADX INFO: renamed from: u */
    public static final void m91949u(xrt0 xrt0Var, xq00 xq00Var, int i) {
        int i2;
        vlh vlhVar;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-1386059490);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91770i(xrt0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            long j = leu.m58815a(xq00Var2).f112823a.f229874a.f123093a;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64245h = nec.m64245h(mi21.m61822f(1.0f, cxh0Var), tm4.m81087E(new pqm0[]{new pqm0(Float.valueOf(0.0f), new n6f(j)), new pqm0(Float.valueOf(0.9f), new n6f(j)), new pqm0(Float.valueOf(1.0f), new n6f(n6f.f150870j))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM64245h);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar2 = roh.f201266k;
            zsf1.m96833D(vlhVar2, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            if (xrt0Var.getState().f244248c) {
                xq00Var2.m91771i0(-1436266381);
                vlhVar = vlhVar2;
                tsg1.m81422g(zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224759b, 1), 1, leu.m58815a(xq00Var2).f112823a.f229875b.f123093a, xq00Var2, 0, 0);
                xq00Var2.m91788r(false);
            } else {
                vlhVar = vlhVar2;
                xq00Var2.m91771i0(-1436055922);
                xq00Var2.m91788r(false);
            }
            vb9 vb9Var = d7f0.f46142M0;
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var2).f117230b.f224759b), vb9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            Integer num = xrt0Var.getState().f244247b;
            if (num == null) {
                xq00Var2.m91771i0(-1300062084);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(-1300062083);
                iz30.m51966a(kmg1.m56924v(num.intValue(), 0, xq00Var2), mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159603a, cxh0Var), leu.m58815a(xq00Var2).f112824b.f138758b, xq00Var2, 56, 0);
                xq00Var2.m91788r(false);
            }
            ahf1.m25932d(xrt0Var.getState().f244246a, zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var2).f117230b.f224760c, 1), leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lvs0(xrt0Var, i, 1);
        }
    }

    @Override // p204p.AbstractC2441u6
    /* JADX INFO: renamed from: a */
    public final void mo301a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1023601093);
        int i2 = (xq00Var.m91770i(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            y0v.m92603a(2, rkk.m75772x(-830786631, new wrt0(this), xq00Var), xq00Var, 390, 2);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wrt0(this, i);
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setState((vrt0) obj);
    }

    @Override // p204p.clc1
    public View getView() {
        return this.f265408t;
    }
}
