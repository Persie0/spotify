package p204p;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class qr81 implements mu01 {

    /* JADX INFO: renamed from: l */
    public static final Set f191763l = bk5.m29624m1(new fq01[]{xp01.f264405d, eq01.f61756d, zp01.f284897d, aq01.f18050d, mp01.f145818d});

    /* JADX INFO: renamed from: a */
    public final Context f191764a;

    /* JADX INFO: renamed from: b */
    public final ak81 f191765b;

    /* JADX INFO: renamed from: c */
    public final da80 f191766c;

    /* JADX INFO: renamed from: d */
    public final pcb f191767d;

    /* JADX INFO: renamed from: e */
    public final dg10 f191768e;

    /* JADX INFO: renamed from: f */
    public final sk81 f191769f;

    /* JADX INFO: renamed from: g */
    public final luk f191770g;

    /* JADX INFO: renamed from: h */
    public final el6 f191771h;

    /* JADX INFO: renamed from: i */
    public final fus0 f191772i;

    /* JADX INFO: renamed from: j */
    public final boolean f191773j;

    /* JADX INFO: renamed from: k */
    public final boolean f191774k;

    public qr81(Context context, ak81 ak81Var, da80 da80Var, pcb pcbVar, dg10 dg10Var, sk81 sk81Var, luk lukVar, og6 og6Var, el6 el6Var, fus0 fus0Var, boolean z, boolean z2) {
        this.f191764a = context;
        this.f191765b = ak81Var;
        this.f191766c = da80Var;
        this.f191767d = pcbVar;
        this.f191768e = dg10Var;
        this.f191769f = sk81Var;
        this.f191770g = lukVar;
        this.f191771h = el6Var;
        this.f191772i = fus0Var;
        this.f191773j = z;
        this.f191774k = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Serializable m73606c(qr81 qr81Var, String str, ibk ibkVar) {
        kr81 kr81Var;
        Serializable c6x0Var;
        if (ibkVar instanceof kr81) {
            kr81Var = (kr81) ibkVar;
            int i = kr81Var.f125582c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kr81Var.f125582c = i - Integer.MIN_VALUE;
            } else {
                kr81Var = new kr81(qr81Var, ibkVar);
            }
        } else {
            kr81Var = new kr81(qr81Var, ibkVar);
        }
        Object objM35912b = kr81Var.f125580a;
        int i2 = kr81Var.f125582c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM35912b);
                dg10 dg10Var = qr81Var.f191768e;
                kr81Var.f125582c = 1;
                objM35912b = dg10Var.m35912b(str, kr81Var);
                yuk yukVar = yuk.f276404a;
                if (objM35912b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM35912b);
            }
            c6x0Var = (String) objM35912b;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        if (c6x0Var instanceof c6x0) {
            return null;
        }
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m73607d(qr81 qr81Var, String str, ibk ibkVar) {
        lr81 lr81Var;
        Object c6x0Var;
        if (ibkVar instanceof lr81) {
            lr81Var = (lr81) ibkVar;
            int i = lr81Var.f136242c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lr81Var.f136242c = i - Integer.MIN_VALUE;
            } else {
                lr81Var = new lr81(qr81Var, ibkVar);
            }
        } else {
            lr81Var = new lr81(qr81Var, ibkVar);
        }
        Object objM96567o = lr81Var.f136240a;
        int i2 = lr81Var.f136242c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM26202a = qr81Var.f191765b.m26202a(Collections.singletonList(str));
                lr81Var.f136242c = 1;
                objM96567o = zn91.m96567o(singleM26202a, lr81Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            c6x0Var = (hwl0) objM96567o;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || (thM77348a instanceof TimeoutCancellationException) || !(thM77348a instanceof CancellationException)) {
            return c6x0Var instanceof c6x0 ? new hwl0(lau.f131415a) : c6x0Var;
        }
        throw thM77348a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Serializable m73608e(qr81 qr81Var, String str, ibk ibkVar) {
        mr81 mr81Var;
        Serializable c6x0Var;
        if (ibkVar instanceof mr81) {
            mr81Var = (mr81) ibkVar;
            int i = mr81Var.f146451c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mr81Var.f146451c = i - Integer.MIN_VALUE;
            } else {
                mr81Var = new mr81(qr81Var, ibkVar);
            }
        } else {
            mr81Var = new mr81(qr81Var, ibkVar);
        }
        Object objM78367a = mr81Var.f146449a;
        int i2 = mr81Var.f146451c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM78367a);
                sk81 sk81Var = qr81Var.f191769f;
                mr81Var.f146451c = 1;
                objM78367a = sk81Var.m78367a(str, mr81Var);
                yuk yukVar = yuk.f276404a;
                if (objM78367a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM78367a);
            }
            c6x0Var = (String) objM78367a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        if (c6x0Var instanceof c6x0) {
            return null;
        }
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public static final int m73609f(qr81 qr81Var, List list, xr01 xr01Var) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (wj50.m88271j(((sr01) it.next()).f213201a.f201919b, xr01Var)) {
                if (i < 0) {
                    return 0;
                }
                return i;
            }
            i++;
        }
        i = -1;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m73610g(qr81 qr81Var, String str, ibk ibkVar) throws Throwable {
        pr81 pr81Var;
        Object c6x0Var;
        if (ibkVar instanceof pr81) {
            pr81Var = (pr81) ibkVar;
            int i = pr81Var.f180531c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pr81Var.f180531c = i - Integer.MIN_VALUE;
            } else {
                pr81Var = new pr81(qr81Var, ibkVar);
            }
        } else {
            pr81Var = new pr81(qr81Var, ibkVar);
        }
        Object objM76978s = pr81Var.f180529a;
        int i2 = pr81Var.f180531c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76978s);
                nr81 nr81Var = new nr81(qr81Var, str, null, 3);
                pr81Var.f180531c = 1;
                objM76978s = s1h1.m76978s(5000L, nr81Var, pr81Var);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76978s);
            }
            c6x0Var = (List) objM76978s;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof TimeoutCancellationException) && (thM77348a instanceof CancellationException)) {
            throw thM77348a;
        }
        Throwable thM77348a2 = s6x0.m77348a(c6x0Var);
        if (thM77348a2 != null) {
            if (thM77348a2 instanceof TimeoutCancellationException) {
                y85.m93049F(thM77348a2);
            } else {
                y85.m93049F(thM77348a2);
            }
        }
        return c6x0Var instanceof c6x0 ? lau.f131415a : c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: h */
    public final Object m73611h(lu01 lu01Var, xr01 xr01Var, ibk ibkVar) {
        jr81 jr81Var;
        xr01 xr01Var2;
        lu01 lu01Var2 = lu01Var;
        if (ibkVar instanceof jr81) {
            jr81Var = (jr81) ibkVar;
            int i = jr81Var.f115111e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jr81Var.f115111e = i - Integer.MIN_VALUE;
            } else {
                jr81Var = new jr81(this, ibkVar);
            }
        } else {
            jr81Var = new jr81(this, ibkVar);
        }
        Object objM39353a = jr81Var.f115109c;
        int i2 = jr81Var.f115111e;
        if (i2 == 0) {
            bga.m29073P(objM39353a);
            String str = lu01Var2.f136946a;
            jr81Var.f115107a = lu01Var2;
            xr01Var2 = xr01Var;
            jr81Var.f115108b = xr01Var2;
            jr81Var.f115111e = 1;
            objM39353a = this.f191771h.m39353a(str, jr81Var);
            yuk yukVar = yuk.f276404a;
            if (objM39353a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xr01 xr01Var3 = jr81Var.f115108b;
            lu01 lu01Var3 = jr81Var.f115107a;
            bga.m29073P(objM39353a);
            xr01Var2 = xr01Var3;
            lu01Var2 = lu01Var3;
        }
        uni0 uni0Var = (uni0) objM39353a;
        rr01 rr01Var = new rr01(lu01Var2, xr01Var2);
        um01 um01Var = new um01(qpv0.f191387a.mo54112b(le00.class));
        gcr0 gcr0Var = uni0Var.f232176a;
        gcr0 gcr0Var2 = uni0Var.f232177b;
        int i3 = uni0Var.f232178c;
        int i4 = uni0Var.f232179d;
        String str2 = uni0Var.f232180e;
        String str3 = uni0Var.f232181f;
        mwu mwuVar = mwu.f147884c;
        Object[] objArr = {this.f191772i.m42747d(uni0Var.f232182g)};
        Context context = this.f191764a;
        return new sr01(rr01Var, new nk01(um01Var, new we00(gcr0Var, gcr0Var2, i3, i4, str2, str3, new om01(context.getString(R.string.track_share_card_music_video_info, objArr), mwuVar)), k5j.f119531a, false), new q111(null, f191763l, false, context.getString(R.string.track_share_card_music_video_tab_title), 1));
    }
}
