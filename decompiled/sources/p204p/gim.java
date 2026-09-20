package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class gim {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h4t0 f80207b;

    public /* synthetic */ gim(h4t0 h4t0Var, int i) {
        this.f80206a = i;
        this.f80207b = h4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final dic m44812a(xuk xukVar, xv41 xv41Var) {
        switch (this.f80206a) {
            case 0:
                i23 i23Var = (i23) ((igm) this.f80207b).f102010c;
                b33 b33Var = (b33) i23Var.f97710a;
                z9j0 z9j0VarM27994g = b33Var.m27994g();
                jg31.m53271i(z9j0VarM27994g);
                so3 so3Var = new so3(3);
                Activity activityM27988a = b33Var.m27988a();
                jg31.m53271i(activityM27988a);
                b33 b33Var2 = (b33) i23Var.f97710a;
                Activity activityM27988a2 = b33Var2.m27988a();
                jg31.m53271i(activityM27988a2);
                bco bcoVar = new bco(activityM27988a2, 29);
                bji bjiVar = (bji) b33Var2.f22796A.get();
                jg31.m53271i(bjiVar);
                hic hicVar = new hic(activityM27988a, bcoVar, new fs9(bjiVar));
                luk lukVar = (luk) b33Var.f22871x.get();
                jg31.m53271i(lukVar);
                return new dic(new bxb(z9j0VarM27994g, so3Var, hicVar, lukVar), xukVar, xv41Var);
            case 1:
                return new dic((bxb) ((otm) ((xrm) this.f80207b).f265375c).f169188s0, xukVar, xv41Var);
            case 2:
                mmb mmbVar = (mmb) ((e60) ((xrm) this.f80207b).f265375c).f56505b;
                z9j0 z9j0Var = (z9j0) mmbVar.f145104c;
                jg31.m53271i(z9j0Var);
                so3 so3Var2 = new so3(3);
                Activity activity = (Activity) mmbVar.f145103b;
                jg31.m53271i(activity);
                Activity activity2 = (Activity) mmbVar.f145103b;
                jg31.m53271i(activity2);
                bco bcoVar2 = new bco(activity2, 29);
                bji bjiVar2 = (bji) mmbVar.f145101Z;
                jg31.m53271i(bjiVar2);
                hic hicVar2 = new hic(activity, bcoVar2, new fs9(bjiVar2));
                luk lukVar2 = (luk) mmbVar.f145098O0;
                jg31.m53271i(lukVar2);
                return new dic(new bxb(z9j0Var, so3Var2, hicVar2, lukVar2), xukVar, xv41Var);
            default:
                n06 n06Var = (n06) ((ezm) this.f80207b).f64417c;
                dwz dwzVar = (dwz) n06Var.f148907b;
                z9j0 z9j0Var2 = (z9j0) dwzVar.f53786c.get();
                jg31.m53271i(z9j0Var2);
                so3 so3Var3 = new so3(3);
                Activity activityM37176a = dwzVar.m37176a();
                jg31.m53271i(activityM37176a);
                dwz dwzVar2 = (dwz) n06Var.f148907b;
                Activity activityM37176a2 = dwzVar2.m37176a();
                jg31.m53271i(activityM37176a2);
                bco bcoVar3 = new bco(activityM37176a2, 29);
                bji bjiVar3 = (bji) dwzVar2.f53763E.get();
                jg31.m53271i(bjiVar3);
                hic hicVar3 = new hic(activityM37176a, bcoVar3, new fs9(bjiVar3));
                luk lukVar3 = (luk) dwzVar.f53769K.get();
                jg31.m53271i(lukVar3);
                return new dic(new bxb(z9j0Var2, so3Var3, hicVar3, lukVar3), xukVar, xv41Var);
        }
    }
}
