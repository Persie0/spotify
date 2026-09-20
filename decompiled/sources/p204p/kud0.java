package p204p;

import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class kud0 {

    /* JADX INFO: renamed from: a */
    public final ocz0 f126519a;

    /* JADX INFO: renamed from: b */
    public final fbk0 f126520b;

    /* JADX INFO: renamed from: c */
    public final ycc f126521c;

    /* JADX INFO: renamed from: d */
    public long f126522d;

    public kud0(oge0 oge0Var, ocz0 ocz0Var, g6n g6nVar, fbk0 fbk0Var, xre xreVar, luk lukVar) {
        this.f126519a = ocz0Var;
        this.f126520b = fbk0Var;
        n06 n06Var = (n06) g6nVar.f77071a.f56430c;
        luk lukVar2 = (luk) ((ewd0) n06Var.f148907b).f63513h.get();
        jg31.m53271i(lukVar2);
        aud0 aud0Var = (aud0) ((h4t0) n06Var.f148913h).get();
        lwd0 lwd0Var = (lwd0) ((ewd0) n06Var.f148907b).f63506a.get();
        jg31.m53271i(lwd0Var);
        this.f126521c = new ycc(oge0Var, lukVar2, aud0Var, lwd0Var, 5);
        this.f126522d = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m57386a(kud0 kud0Var, ibk ibkVar) {
        dud0 dud0Var;
        if (ibkVar instanceof dud0) {
            dud0Var = (dud0) ibkVar;
            int i = dud0Var.f53039c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dud0Var.f53039c = i - Integer.MIN_VALUE;
            } else {
                dud0Var = new dud0(kud0Var, ibkVar);
            }
        } else {
            dud0Var = new dud0(kud0Var, ibkVar);
        }
        Object obj = dud0Var.f53037a;
        int i2 = dud0Var.f53039c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (kud0Var.f126522d != -1) {
                long jCurrentTimeMillis = System.currentTimeMillis() - kud0Var.f126522d;
                if (jCurrentTimeMillis < 50) {
                    dud0Var.f53039c = 1;
                    Object objM64619l = njg1.m64619l(50 - jCurrentTimeMillis, dud0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM64619l == yukVar) {
                        return yukVar;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        kud0Var.f126522d = System.currentTimeMillis();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m57387b(kud0 kud0Var, long j, ibk ibkVar) {
        jud0 jud0Var;
        if (ibkVar instanceof jud0) {
            jud0Var = (jud0) ibkVar;
            int i = jud0Var.f116100d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jud0Var.f116100d = i - Integer.MIN_VALUE;
            } else {
                jud0Var = new jud0(kud0Var, ibkVar);
            }
        } else {
            jud0Var = new jud0(kud0Var, ibkVar);
        }
        Object objM96567o = jud0Var.f116098b;
        int i2 = jud0Var.f116100d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                ocz0 ocz0Var = kud0Var.f126519a;
                if (ocz0Var == null) {
                    return new sud0(null);
                }
                ncz0 ncz0VarMo66728a = ocz0Var.mo66728a(640, j, 360);
                if (ncz0VarMo66728a == null) {
                    return new sud0(null);
                }
                lxe lxeVar = ncz0VarMo66728a.f152618b;
                lxeVar.f137801g = false;
                Single singleM60183i = lxeVar.m60183i();
                jud0Var.f116097a = j;
                jud0Var.f116100d = 1;
                objM96567o = zn91.m96567o(singleM60183i, jud0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = jud0Var.f116097a;
                bga.m29073P(objM96567o);
            }
            return new sud0((Bitmap) objM96567o);
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38561j(j, "Failed to load drag preview frame at "), new Object[0]);
            return new sud0(null);
        }
    }
}
