package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jb9 {

    /* JADX INFO: renamed from: a */
    public final y1n f110702a;

    /* JADX INFO: renamed from: b */
    public final xre f110703b;

    /* JADX INFO: renamed from: c */
    public final jth f110704c;

    /* JADX INFO: renamed from: d */
    public final u49 f110705d;

    /* JADX INFO: renamed from: e */
    public final cb9 f110706e;

    /* JADX INFO: renamed from: f */
    public final c9k f110707f;

    /* JADX INFO: renamed from: g */
    public long f110708g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f110709h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f110710i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f110711j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f110712k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap f110713l = new ConcurrentHashMap();

    public jb9(luk lukVar, y1n y1nVar, xre xreVar, jth jthVar, u49 u49Var, cb9 cb9Var) {
        this.f110702a = y1nVar;
        this.f110703b = xreVar;
        this.f110704c = jthVar;
        this.f110705d = u49Var;
        this.f110706e = cb9Var;
        this.f110707f = kk40.m56661c(cct.m32296A(lukVar, njg1.m64613f()).mo26608y(new uuk("betamax-transcoder-scope")));
    }

    /* JADX INFO: renamed from: a */
    public final void m52877a(long j) {
        long j2;
        String str = (String) this.f110712k.remove(Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        ny81 ny81Var = (ny81) this.f110710i.remove(Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = this.f110709h;
        if (ny81Var != null) {
            a691 a691Var = (a691) ny81Var.m65870b().get();
            if (a691Var != null) {
                a691Var.m24854b();
            }
            tf60 tf60Var = (tf60) ny81Var.m65869a().get();
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
            kb9 kb9Var = (kb9) concurrentHashMap.get(Long.valueOf(j));
            if (kb9Var != null) {
                kb9Var.mo35544c(j, 5, str);
            }
            nua nuaVar = (nua) this.f110711j.remove(Long.valueOf(j));
            if (nuaVar == null) {
                nuaVar = new nua();
            }
            cb9 cb9Var = this.f110706e;
            if (cb9Var != null) {
                j2 = j;
                cb9Var.m32151a(j2, nuaVar.m65686b().get(), nuaVar.m65685a().get());
            } else {
                j2 = j;
            }
            concurrentHashMap.remove(Long.valueOf(j2));
        } else {
            j2 = j;
        }
        tf60 tf60Var2 = (tf60) this.f110713l.remove(Long.valueOf(j2));
        if (tf60Var2 != null) {
            tf60Var2.mo26601e(null);
            kb9 kb9Var2 = (kb9) concurrentHashMap.get(Long.valueOf(j2));
            if (kb9Var2 != null) {
                kb9Var2.mo35544c(j2, 5, str);
            }
        }
    }
}
