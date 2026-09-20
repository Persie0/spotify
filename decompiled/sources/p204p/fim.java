package p204p;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fim {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h4t0 f69917b;

    public /* synthetic */ fim(h4t0 h4t0Var, int i) {
        this.f69916a = i;
        this.f69917b = h4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public static mzp0 m41750a(fim fimVar, xuk xukVar, ifw0 ifw0Var, zv41 zv41Var, int i) {
        ifw0 ifw0Var2 = (i & 2) != 0 ? null : ifw0Var;
        zv41 zv41Var2 = (i & 4) != 0 ? null : zv41Var;
        switch (fimVar.f69916a) {
            case 0:
                i23 i23Var = (i23) ((igm) fimVar.f69917b).f102010c;
                Activity activityM27988a = ((b33) i23Var.f97710a).m27988a();
                jg31.m53271i(activityM27988a);
                Activity activityM27988a2 = ((b33) i23Var.f97710a).m27988a();
                jg31.m53271i(activityM27988a2);
                bco bcoVar = new bco(activityM27988a2, 29);
                bji bjiVar = (bji) ((b33) i23Var.f97710a).f22796A.get();
                jg31.m53271i(bjiVar);
                fs9 fs9Var = new fs9(bjiVar);
                og6 og6Var = new og6(23);
                luk lukVar = (luk) ((b33) i23Var.f97710a).f22871x.get();
                jg31.m53271i(lukVar);
                return new mzp0(activityM27988a, bcoVar, fs9Var, og6Var, lukVar, xukVar, ifw0Var2, zv41Var2);
            case 1:
                otm otmVar = (otm) ((xrm) fimVar.f69917b).f265375c;
                return new mzp0((Context) otmVar.f169158d0, new bco((Activity) otmVar.f169190t0, 29), new fs9((bji) otmVar.f169115C), (og6) otmVar.f169196w0, (luk) otmVar.f169195w, xukVar, ifw0Var2, zv41Var2);
            case 2:
                e60 e60Var = (e60) ((xrm) fimVar.f69917b).f265375c;
                Activity activity = (Activity) ((mmb) e60Var.f56505b).f145103b;
                jg31.m53271i(activity);
                Activity activity2 = (Activity) ((mmb) e60Var.f56505b).f145103b;
                jg31.m53271i(activity2);
                bco bcoVar2 = new bco(activity2, 29);
                bji bjiVar2 = (bji) ((mmb) e60Var.f56505b).f145101Z;
                jg31.m53271i(bjiVar2);
                fs9 fs9Var2 = new fs9(bjiVar2);
                og6 og6Var2 = new og6(23);
                luk lukVar2 = (luk) ((mmb) e60Var.f56505b).f145098O0;
                jg31.m53271i(lukVar2);
                return new mzp0(activity, bcoVar2, fs9Var2, og6Var2, lukVar2, xukVar, ifw0Var2, zv41Var2);
            default:
                n06 n06Var = (n06) ((ezm) fimVar.f69917b).f64417c;
                Activity activityM37176a = ((dwz) n06Var.f148907b).m37176a();
                jg31.m53271i(activityM37176a);
                Activity activityM37176a2 = ((dwz) n06Var.f148907b).m37176a();
                jg31.m53271i(activityM37176a2);
                bco bcoVar3 = new bco(activityM37176a2, 29);
                bji bjiVar3 = (bji) ((dwz) n06Var.f148907b).f53763E.get();
                jg31.m53271i(bjiVar3);
                fs9 fs9Var3 = new fs9(bjiVar3);
                og6 og6Var3 = new og6(23);
                luk lukVar3 = (luk) ((dwz) n06Var.f148907b).f53769K.get();
                jg31.m53271i(lukVar3);
                return new mzp0(activityM37176a, bcoVar3, fs9Var3, og6Var3, lukVar3, xukVar, ifw0Var2, zv41Var2);
        }
    }
}
