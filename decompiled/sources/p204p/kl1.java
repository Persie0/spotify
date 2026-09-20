package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kl1 {

    /* JADX INFO: renamed from: a */
    public final lr1 f123767a;

    /* JADX INFO: renamed from: b */
    public final twy f123768b;

    /* JADX INFO: renamed from: c */
    public final lc1 f123769c;

    /* JADX INFO: renamed from: d */
    public final g2q f123770d;

    /* JADX INFO: renamed from: e */
    public final sdo f123771e;

    /* JADX INFO: renamed from: f */
    public final s1e1 f123772f;

    /* JADX INFO: renamed from: g */
    public Uri f123773g;

    public kl1(lr1 lr1Var, twy twyVar, lc1 lc1Var, g2q g2qVar, sdo sdoVar, s1e1 s1e1Var) {
        this.f123767a = lr1Var;
        this.f123768b = twyVar;
        this.f123769c = lc1Var;
        this.f123770d = g2qVar;
        this.f123771e = sdoVar;
        this.f123772f = s1e1Var;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m56794b(Uri uri) {
        String query = uri.getQuery();
        return query != null && wl51.m88477a1(query, new String[]{"&"}, 0, 6).contains("intent=1");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m56795a(String str, ibk ibkVar) throws Throwable {
        hl1 hl1Var;
        String strM35694A;
        String str2;
        String str3;
        Serializable c6x0Var;
        String str4;
        Serializable serializable;
        Throwable thM77348a;
        if (ibkVar instanceof hl1) {
            hl1Var = (hl1) ibkVar;
            int i = hl1Var.f92581f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hl1Var.f92581f = i - Integer.MIN_VALUE;
            } else {
                hl1Var = new hl1(this, ibkVar);
            }
        } else {
            hl1Var = new hl1(this, ibkVar);
        }
        hl1 hl1Var2 = hl1Var;
        Object objM96567o = hl1Var2.f92579d;
        int i2 = hl1Var2.f92581f;
        yuk yukVar = yuk.f276404a;
        int i3 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Set set = dd41.f47702f;
            strM35694A = r46.m74726U(str).m35694A();
            if (strM35694A != null) {
                try {
                    SingleSource singleSource = (SingleSource) this.f123769c.invoke(strM35694A);
                    hl1Var2.f92576a = str;
                    hl1Var2.f92577b = strM35694A;
                    hl1Var2.f92578c = null;
                    hl1Var2.f92581f = 1;
                    objM96567o = zn91.m96567o(singleSource, hl1Var2);
                    if (objM96567o != yukVar) {
                        str3 = str;
                    }
                } catch (Throwable th) {
                    th = th;
                    str2 = str;
                    c6x0Var = new c6x0(th);
                    str3 = str2;
                }
                return yukVar;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            strM35694A = hl1Var2.f92577b;
            str3 = hl1Var2.f92576a;
            try {
                bga.m29073P(objM96567o);
            } catch (Throwable th2) {
                th = th2;
                str2 = str3;
                c6x0Var = new c6x0(th);
                str3 = str2;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serializable = hl1Var2.f92578c;
            str4 = hl1Var2.f92577b;
            bga.m29073P(objM96567o);
        }
        this.f123773g = null;
        c6x0Var = serializable;
        strM35694A = str4;
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, s571.m77251j("Add to library failed for Uri: ", strM35694A, "."), new Object[0]);
        }
        return w2a1Var;
        c6x0Var = (Boolean) objM96567o;
        if (!(c6x0Var instanceof c6x0)) {
            Boolean bool = (Boolean) c6x0Var;
            wj50.m88279p(bool);
            boolean zBooleanValue = bool.booleanValue();
            hl1Var2.f92576a = null;
            hl1Var2.f92577b = strM35694A;
            hl1Var2.f92578c = c6x0Var;
            hl1Var2.f92581f = 2;
            Object objCollect = oyf1.m68486s(k0e1.m54985d(this.f123771e.m77865p(strM35694A)), new il1(strM35694A, fbkVar, i3)).collect(new jl1(this, strM35694A, str3, zBooleanValue, 0), hl1Var2);
            if (objCollect != yukVar) {
                objCollect = w2a1Var;
            }
            if (objCollect != yukVar) {
                str4 = strM35694A;
                serializable = c6x0Var;
                this.f123773g = null;
                c6x0Var = serializable;
                strM35694A = str4;
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a != null) {
                    Logger.m3967c(thM77348a, s571.m77251j("Add to library failed for Uri: ", strM35694A, "."), new Object[0]);
                }
            }
            return yukVar;
        }
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, s571.m77251j("Add to library failed for Uri: ", strM35694A, "."), new Object[0]);
        }
        return w2a1Var;
    }
}
