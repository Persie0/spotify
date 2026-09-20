package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Effects;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widget.widgetpromo.PromoSuccessHandlerService;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import p196j$.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tag1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f218576a;

    /* JADX INFO: renamed from: b */
    public static sd40 f218577b;

    /* JADX INFO: renamed from: a */
    public static final void m80355a(boolean z, fxh0 fxh0Var, AbstractC1895gf abstractC1895gf, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1316066468);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(abstractC1895gf) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                fxh0Var2 = cxh0.f43038a;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
            }
            xq00Var.m91790s();
            String strM54977L = k0e1.m54977L(z ? R.string.curation_button_unfollow_content_description : R.string.curation_button_follow_content_description, xq00Var);
            String strM54977L2 = k0e1.m54977L(z ? R.string.curation_button_following_state_text : R.string.curation_button_follow_state_text, xq00Var);
            boolean z2 = (i3 & 7168) == 2048;
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new yyy(19, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var = (eh00) objM91750T;
            if (wl51.m88460J0(strM54977L)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(strM54977L), eh00Var), abstractC1895gf, epv0.m39673I("curation_button", fxh0Var2), null, vvx.m86517r(xq00Var), null, null, null, null, null, rkk.m75772x(1209728155, new jhw(strM54977L2, 12, (char) 0), xq00Var), xq00Var, (i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND, 48, 2008);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v20(i, 19, fxh0Var2, abstractC1895gf, gh00Var, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m80356b(qe10 qe10Var, m7f m7fVar, xq00 xq00Var, int i) {
        qe10 qe10Var2;
        xq00Var.m91775k0(697236515);
        int i2 = i | 6 | (xq00Var.m91770i(m7fVar) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) xq00Var.m91774k(tsh.f223313b);
            qe10Var2 = oe10.f164317a;
            vgg1.m85462c(new ko4(R.drawable.ic_spotify_logo_text), context.getString(R.string.npv_widget_nonauth_logo_desc), y85.m93071r(qe10Var2, 20).mo66783d(new tud1(qjr.f189295a)), 0, m7fVar, xq00Var, 32768 | ((i2 << 9) & 57344), 8);
        } else {
            xq00Var.m91757b0();
            qe10Var2 = qe10Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ca70(qe10Var2, m7fVar, i, 25);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m80357c(ebg1 ebg1Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, eh00 eh00Var5, eh00 eh00Var6, eh00 eh00Var7, eh00 eh00Var8, eh00 eh00Var9, String str, String str2, String str3, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        boolean z;
        xq00Var.m91775k0(-1343102551);
        int i2 = i | (xq00Var.m91766g(ebg1Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | (xq00Var.m91770i(eh00Var3) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var4) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var5) ? 131072 : 65536) | (xq00Var.m91770i(eh00Var6) ? 1048576 : 524288) | (xq00Var.m91770i(eh00Var7) ? 8388608 : 4194304) | (xq00Var.m91770i(eh00Var8) ? 67108864 : 33554432) | (xq00Var.m91770i(eh00Var9) ? 536870912 : 268435456);
        int i3 = (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91766g(str3) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224761d, mi21.m61822f(1.0f, cxh0Var));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (ebg1Var instanceof dul0) {
                xq00Var.m91771i0(-1961865745);
                dul0 dul0Var = (dul0) ebg1Var;
                qag1.m72439c(dul0Var.f53086h, (i2 >> 15) & 896, eh00Var7, xq00Var, null, dul0Var.f53087i);
                xq00Var.m91788r(false);
                z = true;
            } else {
                if (ebg1Var instanceof eul0) {
                    xq00Var.m91771i0(-688077430);
                    Context context = ((View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f)).getContext();
                    boolean z2 = ((eul0) ebg1Var).f63012h;
                    boolean zM91770i = xq00Var.m91770i(context) | ((i2 & 234881024) == 67108864);
                    Object objM91750T = xq00Var.m91750T();
                    if (zM91770i || objM91750T == t6x0.f217647t) {
                        objM91750T = new ckk0(20, context, eh00Var8);
                        xq00Var.m91793t0(objM91750T);
                    }
                    int i4 = i3 << 9;
                    h1h1.m46433d(z2, eh00Var7, (eh00) objM91750T, str, str2, str3, xq00Var, ((i2 >> 18) & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752));
                    xq00Var.m91788r(false);
                } else if (ebg1Var instanceof jul0) {
                    xq00Var.m91771i0(-1961841263);
                    mag1.m61300j(eh00Var9, eh00Var, eh00Var2, eh00Var3, eh00Var4, eh00Var5, eh00Var6, (jul0) ebg1Var, null, xq00Var, ((i2 >> 27) & 14) | (i2 & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 896) | (i2 & 7168) | (i2 & 57344) | (i2 & 458752) | (3670016 & i2) | ((i2 << 21) & 29360128));
                    xq00Var.m91788r(false);
                } else {
                    if (!ebg1Var.equals(ful0.f73524h)) {
                        throw lq51.m59703i(-1961866669, xq00Var, false);
                    }
                    xq00Var.m91771i0(-686962081);
                    xq00Var.m91788r(false);
                }
                z = true;
            }
            xq00Var.m91788r(z);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aul0(ebg1Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, eh00Var5, eh00Var6, eh00Var7, eh00Var8, eh00Var9, str, str2, str3, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final h1x0 m80358d(PlayerState playerState, boolean z) {
        String str = "";
        if (z) {
            Set set = dd41.f47702f;
            if (r46.m74726U(playerState.contextUri()).f47709c == gn80.ARTIST) {
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                String strM38021r = contextTrack != null ? e72.m38021r(contextTrack) : null;
                return new hl51(strM38021r != null ? strM38021r : "");
            }
        }
        Set set2 = dd41.f47702f;
        if (r46.m74723R(rkk.m75748F(playerState))) {
            String strM75748F = rkk.m75748F(playerState);
            try {
                String strDecode = URLDecoder.decode(bm51.m29801l0(strM75748F, "spotify:search:", ""), vuc.f244913a.toString());
                wj50.m88279p(strDecode);
                str = strDecode;
            } catch (UnsupportedEncodingException unused) {
                Set set3 = dd41.f47702f;
                String strM35712j = r46.m74726U(strM75748F).m35712j();
                if (strM35712j != null) {
                    str = strM35712j;
                }
            }
        }
        return (str.length() == 0 || wj50.m88271j(rkk.m75748F(playerState), "spotify:search")) ? new j1x0(R.string.player_title_recent_search) : new e400(R.string.player_title_search_for, str);
    }

    /* JADX INFO: renamed from: e */
    public static final void m80359e(StringBuilder sb, boolean z, CharSequence charSequence) {
        if (!z || charSequence == null || charSequence.length() == 0) {
            return;
        }
        sb.append(charSequence);
        sb.append(", ");
    }

    /* JADX INFO: renamed from: f */
    public static PendingIntent m80360f(Context context, zas0 zas0Var) {
        return PendingIntent.getService(context, 0, m6b.m60990e(context, PromoSuccessHandlerService.class, "com.spotify.widget.widgetpromo.EXTRA_SOURCE", zas0Var.f281121a), 67108864);
    }

    /* JADX INFO: renamed from: h */
    public static final HashSet m80361h(t17 t17Var, qag1 qag1Var) {
        return (((t17Var.f216167g > 0L ? 1 : (t17Var.f216167g == 0L ? 0 : -1)) > 0) || t17Var.f216164d || !t17Var.f216165e) ? Effects.m15571a(new qag1[0]) : Effects.m15571a(qag1Var);
    }

    /* JADX INFO: renamed from: j */
    public static final goi0 m80362j(y400 y400Var, up60 up60Var) {
        return new goi0(up60Var, y400Var.f269048a.f279080a, new hoi0(up60Var, y400Var), new hoi0(y400Var, up60Var));
    }

    /* JADX INFO: renamed from: l */
    public static final oko m80363l(mko mkoVar) {
        return new oko(peo0.f176810X0, mkoVar);
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo63240g(int i, byte[] bArr, int i2);

    /* JADX INFO: renamed from: i */
    public abstract int mo63241i(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: k */
    public boolean m80364k(int i, byte[] bArr, int i2) {
        return mo63242m(i, bArr, i2) == 0;
    }

    /* JADX INFO: renamed from: m */
    public abstract int mo63242m(int i, byte[] bArr, int i2);
}
