package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hqg1 implements fi00 {

    /* JADX INFO: renamed from: a */
    public static sd40 f94180a;

    /* JADX INFO: renamed from: b */
    public static sd40 f94181b;

    /* JADX INFO: renamed from: a */
    public static final void m48268a(t30 t30Var, y3m y3mVar, ofo0 ofo0Var, j5s0 j5s0Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-905881086);
        int i2 = i | (xq00Var.m91766g(t30Var) ? 4 : 2) | (xq00Var.m91770i(y3mVar) ? 32 : 16) | (xq00Var.m91770i(ofo0Var) ? 256 : 128) | (xq00Var.m91770i(j5s0Var) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192) | 196608;
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            float f = m30.f139492a;
            y0v.m92603a(2, rkk.m75772x(-1815968370, new z30(t30Var, ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).screenWidthDp, 272, gh00Var, y3mVar, ofo0Var, j5s0Var, 32), xq00Var), xq00Var, 390, 2);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a40(t30Var, y3mVar, ofo0Var, j5s0Var, gh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m48269b(rha rhaVar, j15 j15Var, wrm0 wrm0Var, em51 em51Var, h171 h171Var, int i, boolean z, gh00 gh00Var, xq00 xq00Var, int i2, int i3) {
        rha rhaVar2;
        int i4;
        j15 j15Var2;
        int i5;
        h171 h171Var2;
        gh00 gh00Var2;
        em51 em51Var2;
        rx7 qx7Var;
        em51 em51Var3 = em51Var;
        xq00Var.m91775k0(1705956742);
        if ((i2 & 6) == 0) {
            rhaVar2 = rhaVar;
            i4 = (xq00Var.m91770i(rhaVar2) ? 4 : 2) | i2;
        } else {
            rhaVar2 = rhaVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j15Var2 = j15Var;
            i4 |= xq00Var.m91770i(j15Var2) ? 32 : 16;
        } else {
            j15Var2 = j15Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= xq00Var.m91770i(wrm0Var) ? 256 : 128;
        }
        int i6 = i2 & 3072;
        int i7 = i4;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i6 == 0) {
            i5 = (xq00Var.m91770i(cxh0Var) ? 2048 : 1024) | i7;
        } else {
            i5 = i7;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= (32768 & i2) == 0 ? xq00Var.m91766g(em51Var3) : xq00Var.m91770i(em51Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            h171Var2 = h171Var;
            i5 |= xq00Var.m91766g(h171Var2) ? 131072 : 65536;
        } else {
            h171Var2 = h171Var;
        }
        if ((1572864 & i2) == 0) {
            i5 |= xq00Var.m91762e(i) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= xq00Var.m91768h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            gh00Var2 = gh00Var;
            i5 |= xq00Var.m91770i(gh00Var2) ? 67108864 : 33554432;
        } else {
            gh00Var2 = gh00Var;
        }
        if (xq00Var.m91752Y(i5 & 1, (38347923 & i5) != 38347922)) {
            xq00Var.m91761d0();
            if ((i2 & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            } else if (i8 != 0) {
                em51Var3 = null;
            }
            em51 em51Var4 = em51Var3;
            xq00Var.m91790s();
            hsm0 hsm0Var = wrm0Var.f254391c;
            if71 if71Var = wrm0Var.f254390b;
            if71 if71VarM50418a = if71.m50418a(if71Var, 0L, 0L, null, null, null, null, null, hsm0Var instanceof gsm0 ? epv0.m39669E(8589934592L, ((gsm0) hsm0Var).f83990e) : if71Var.f101704a.f63417h, null, 0L, null, null, em51Var4, 0, 0L, null, null, null, xj80.f262066b, 14663551);
            long j = em51Var4 != null ? hsm0Var.mo42568d().f30357b : wrm0Var.f254392d;
            pl80 pl80VarMo42567c = hsm0Var.mo42567c();
            esm0 esm0VarMo42565a = hsm0Var.mo42565a();
            float fM75510d = rhaVar2.m75510d();
            if (wj50.m88271j(esm0VarMo42565a, csm0.f41656a)) {
                qx7Var = px7.f182224a;
            } else {
                if (!(esm0VarMo42565a instanceof dsm0)) {
                    throw new NoWhenBranchMatchedException();
                }
                dsm0 dsm0Var = (dsm0) esm0VarMo42565a;
                float f = (int) fM75510d;
                qx7Var = new qx7(epv0.m39669E(4294967296L, dsm0Var.f52600a * f), epv0.m39669E(4294967296L, dsm0Var.f52601b * f), dsm0Var.f52602c, new nx7(1));
            }
            int i9 = i5 >> 3;
            ahf1.m25933e(j15Var2, cxh0Var, if71VarM50418a, j, h171Var2, gh00Var2, i, z, pl80VarMo42567c, 0, qx7Var, null, xq00Var, (i9 & 57344) | (i9 & 14) | ((i5 >> 6) & ContentType.LONG_FORM_ON_DEMAND) | ((i5 >> 9) & 458752) | (3670016 & i5) | (29360128 & i5), 0, 2560);
            em51Var2 = em51Var4;
        } else {
            xq00Var.m91757b0();
            em51Var2 = em51Var3;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cwj(rhaVar, j15Var, wrm0Var, em51Var2, h171Var, i, z, gh00Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m48270c(n30 n30Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1895528458);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(n30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = n30Var != null ? n30Var.f149887a : 0;
            int i4 = i3 == 0 ? -1 : b40.f23155a[edb.m38547C(i3)];
            if (i4 == -1) {
                xq00Var.m91771i0(542128266);
                xq00Var.m91788r(false);
            } else if (i4 == 1) {
                xq00Var.m91771i0(-536708129);
                y0h1.m92565c(2, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 6, 0, xq00Var, fxh0Var);
                xq00Var.m91788r(false);
            } else {
                if (i4 != 2) {
                    throw lq51.m59703i(-536710616, xq00Var, false);
                }
                xq00Var.m91771i0(-536704063);
                y0h1.m92565c(1, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 6, 0, xq00Var, fxh0Var);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2314qu(n30Var, fxh0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static owt0 m48271d(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrM48284q = m48284q(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrM48284q2 = m48284q(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        vie1.m85624f("QuirkSettingsLoader");
        vie1.m85624f("QuirkSettingsLoader");
        Arrays.toString(strArrM48284q);
        vie1.m85624f("QuirkSettingsLoader");
        Arrays.toString(strArrM48284q2);
        vie1.m85624f("QuirkSettingsLoader");
        return new owt0(z, new HashSet(m48287t(strArrM48284q)), new HashSet(m48287t(strArrM48284q2)));
    }

    /* JADX INFO: renamed from: e */
    public static fxh0 m48272e(fxh0 fxh0Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, h2b0 h2b0Var, int i) {
        if ((i & 1) != 0) {
            eh00Var = null;
        }
        if ((i & 16) != 0) {
            h2b0Var = null;
        }
        h2b0 h2b0Var2 = h2b0Var;
        return pb61.m69516a(fxh0Var, h2b0Var2, new i510(eh00Var2, h2b0Var2, eh00Var3, eh00Var4, eh00Var));
    }

    /* JADX INFO: renamed from: f */
    public static final fxh0 m48273f(fxh0 fxh0Var, vh00 vh00Var) {
        return fxh0Var.mo34315F(new oph(vh00Var));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m48275h(PlayerState playerState) {
        xf40 xf40VarMetadata;
        if (playerState.signals().contains("switch-to-video")) {
            return true;
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        return wj50.m88271j((contextTrack == null || (xf40VarMetadata = contextTrack.metadata()) == null) ? null : (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_TRACK_PLAYER), "video");
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m48276i(PlayerState playerState) {
        return !playerState.isPaused() && playerState.isPlaying();
    }

    /* JADX INFO: renamed from: j */
    public static final String m48277j(PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        if (contextTrack == null) {
            return "UNKNOWN";
        }
        if (e72.m37978L(contextTrack)) {
            return "AUDIOBOOK";
        }
        if (bm51.m29803n0(contextTrack.uri(), "spotify:episode:", false)) {
            return "PODCAST";
        }
        return bm51.m29803n0(contextTrack.uri(), "spotify:track:", false) ? "MUSIC" : "UNKNOWN";
    }

    /* JADX INFO: renamed from: k */
    public static final uut m48278k(e60 e60Var, t4w0 t4w0Var, boolean z, q5w0 q5w0Var, g5w0 g5w0Var, xv41 xv41Var) {
        ck90 ck90Var = (ck90) e60Var.f56506c;
        Object obj = e60Var.f56505b;
        zn91.m96579u(3, obj);
        vh00 vh00Var = (vh00) obj;
        vh00 vh00Var2 = (vh00) e60Var.f56512i;
        zn91.m96579u(3, vh00Var2);
        th00 th00Var = (th00) e60Var.f56513t;
        zn91.m96579u(2, th00Var);
        return sli0.m78482i(new fi50(ck90Var, (th00) e60Var.f56507d, vh00Var2, (gh00) e60Var.f56509f, (gh00) e60Var.f56508e, (gh00) e60Var.f56511h, (gh00) e60Var.f56510g, th00Var, xv41Var, vh00Var, 2), qzv0.f194318f, new u20(g5w0Var, z, q5w0Var, 25), 4);
    }

    /* JADX INFO: renamed from: l */
    public static final fiz m48279l(zux zuxVar) {
        return mvl0.m62953p(new jd1(zuxVar, 3));
    }

    /* JADX INFO: renamed from: m */
    public static Shadow m48280m() {
        return Shadow.f496d;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m48281n(e6q0 e6q0Var) {
        return e6q0Var.f56706c == 2;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m48282o(a7c1 a7c1Var, String str) {
        if (a7c1Var.equals(y6c1.f269730a)) {
            return false;
        }
        if (a7c1Var.equals(x6c1.f258638a)) {
            return true;
        }
        if (a7c1Var instanceof z6c1) {
            return ((z6c1) a7c1Var).f279828a.contains(str);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public static final Object m48283p(Flowable flowable, ibk ibkVar) {
        sar sarVar;
        if (ibkVar instanceof sar) {
            sarVar = (sar) ibkVar;
            int i = sarVar.f207269b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sarVar.f207269b = i - Integer.MIN_VALUE;
            } else {
                sarVar = new sar(ibkVar);
            }
        } else {
            sarVar = new sar(ibkVar);
        }
        Object obj = sarVar.f207268a;
        int i2 = sarVar.f207269b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        an2 an2Var = new an2(flowable, null, 1);
        sarVar.f207269b = 1;
        Object objM76978s = s1h1.m76978s(500L, an2Var, sarVar);
        yuk yukVar = yuk.f276404a;
        return objM76978s == yukVar ? yukVar : objM76978s;
    }

    /* JADX INFO: renamed from: q */
    public static String[] m48284q(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            vie1.m85617F("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            vie1.m85618G("QuirkSettingsLoader");
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: r */
    public static final fxh0 m48285r(xq00 xq00Var, fxh0 fxh0Var) {
        if (fxh0Var.mo34317k(C2054kj.f123168V0)) {
            return fxh0Var;
        }
        xq00Var.m91773j0(1219399079);
        fxh0 fxh0Var2 = (fxh0) fxh0Var.mo34316a(cxh0.f43038a, new ksg(xq00Var, 20));
        xq00Var.m91788r(false);
        return fxh0Var2;
    }

    /* JADX INFO: renamed from: s */
    public static final fxh0 m48286s(xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91771i0(439770924);
        fxh0 fxh0VarM48285r = m48285r(xq00Var, fxh0Var);
        xq00Var.m91788r(false);
        return fxh0VarM48285r;
    }

    /* JADX INFO: renamed from: t */
    public static HashSet m48287t(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!nwt0.class.isAssignableFrom(cls)) {
                    vie1.m85617F("QuirkSettingsLoader");
                    cls = null;
                }
            } catch (ClassNotFoundException unused) {
                vie1.m85618G("QuirkSettingsLoader");
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: u */
    public static final fiz m48288u(pri priVar, boolean z) {
        return mvl0.m62953p(new g7p(((tri) priVar).m81356g(z), 13));
    }
}
