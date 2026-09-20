package p204p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class xv5 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final x5a0 f266276a;

    /* JADX INFO: renamed from: b */
    public final cw5 f266277b;

    /* JADX INFO: renamed from: c */
    public final qjm f266278c;

    /* JADX INFO: renamed from: d */
    public final sv5 f266279d;

    /* JADX INFO: renamed from: e */
    public final vbu0 f266280e;

    /* JADX INFO: renamed from: f */
    public final az1 f266281f;

    /* JADX INFO: renamed from: g */
    public final cl8 f266282g;

    /* JADX INFO: renamed from: h */
    public final epx f266283h;

    /* JADX INFO: renamed from: i */
    public final pfm0 f266284i;

    public xv5(x5a0 x5a0Var, cw5 cw5Var, qjm qjmVar, sv5 sv5Var, vbu0 vbu0Var, t46 t46Var, az1 az1Var, cl8 cl8Var, epx epxVar) {
        this.f266276a = x5a0Var;
        this.f266277b = cw5Var;
        this.f266278c = qjmVar;
        this.f266279d = sv5Var;
        this.f266280e = vbu0Var;
        this.f266281f = az1Var;
        this.f266282g = cl8Var;
        this.f266283h = epxVar;
        pw71 pw71Var = new pw71(new sl51(cw5Var.m34090c()));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90724W0 = xgg1.m90724W0();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f266284i = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90724W0, mug1.m62869n(t46.m80045q(cw5Var.m34091g())), null), new cs61("Artist Tour page"), w76.f248571b, new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m92216c(xv5 xv5Var, String str, ibk ibkVar) {
        wv5 wv5Var;
        Object c6x0Var;
        cw5 cw5Var = xv5Var.f266277b;
        if (ibkVar instanceof wv5) {
            wv5Var = (wv5) ibkVar;
            int i = wv5Var.f255407d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv5Var.f255407d = i - Integer.MIN_VALUE;
            } else {
                wv5Var = new wv5(xv5Var, ibkVar);
            }
        } else {
            wv5Var = new wv5(xv5Var, ibkVar);
        }
        Object objM86756u = wv5Var.f255405b;
        int i2 = wv5Var.f255407d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                if (!wl51.m88460J0(cw5Var.m34090c())) {
                    return cw5Var.m34090c();
                }
                yab yabVarM54985d = k0e1.m54985d(((jpx) xv5Var.f266283h).m53978b(new C1668ai("artist-concerts-page", false, (gh00) new zz4(str, 6))));
                C2559x4 c2559x4 = new C2559x4(7);
                wv5Var.f255404a = str;
                wv5Var.f255407d = 1;
                objM86756u = vyf1.m86756u(yabVarM54985d, c2559x4, wv5Var);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = wv5Var.f255404a;
                bga.m29073P(objM86756u);
            }
            v140 v140Var = (v140) ((gqx) objM86756u).mo45449a(v140.class, str).f72301b;
            c6x0Var = v140Var != null ? v140Var.f236243a : null;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        String str2 = (String) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        return str2 == null ? "" : str2;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f266284i;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        u4a0 u4a0VarM81027c = tky.m81027c(new v4a0[0], new mr0(this, null, 8));
        sr5 sr5Var = new sr5(this, 3);
        u5a0 u5a0Var = new u5a0(new vv5(this), lu4.f136968N0, v4g1.f237173g, pu5.f181366t);
        cj21 cj21Var = rj21.f199696X;
        return this.f266276a.m89981a(u4a0VarM81027c, sr5Var, u5a0Var, new hcm0(p711.m69218A(rj21.f199704f, rj21.f199706h, cj21Var, cj21Var), null, null, false, false, 126));
    }
}
