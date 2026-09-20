package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class cb8 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36043b = AtomicIntegerFieldUpdater.newUpdater(cb8.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final ojq[] f36044a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public cb8(ojq[] ojqVarArr) {
        this.f36044a = ojqVarArr;
        this.notCompletedCount$volatile = ojqVarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final Object m32149a(fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        ojq[] ojqVarArr = this.f36044a;
        int length = ojqVarArr.length;
        ab8[] ab8VarArr = new ab8[length];
        for (int i = 0; i < length; i++) {
            ojq ojqVar = ojqVarArr[i];
            ojqVar.start();
            ab8 ab8Var = new ab8(this, hqbVar);
            ab8Var.f14041f = qlg1.m73190F(ojqVar, ab8Var);
            ab8VarArr[i] = ab8Var;
        }
        bb8 bb8Var = new bb8(ab8VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ab8 ab8Var2 = ab8VarArr[i2];
            ab8Var2.getClass();
            ab8.f14039h.set(ab8Var2, bb8Var);
        }
        if (hqbVar.m48225u()) {
            bb8Var.m28627b();
        } else {
            gga.m44674m(hqbVar, bb8Var);
        }
        return hqbVar.m48221p();
    }
}
