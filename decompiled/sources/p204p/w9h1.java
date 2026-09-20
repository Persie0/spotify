package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.music.R;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.p126ai.creation.p127v2.Playlist;
import com.spotify.playlist.p126ai.creation.p127v2.Status;
import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w9h1 {

    /* JADX INFO: renamed from: a */
    public static epg1 f249180a;

    /* JADX INFO: renamed from: b */
    public static sd40 f249181b;

    /* JADX INFO: renamed from: a */
    public static final void m87499a(jt20 jt20Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        jt20 jt20Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(997765284);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(jt20Var) : xq00Var.m91770i(jt20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            jt20Var2 = jt20Var;
            xq00Var2 = xq00Var;
            vt20.m86368a(jt20Var2, "HighlightStacked2Card", null, rkk.m75772x(-188589151, new ru20(jt20Var, 3), xq00Var), xq00Var2, (i3 & 14) | 24624 | ((i3 << 3) & 896), 8);
            fxh0Var = cxh0.f43038a;
        } else {
            jt20Var2 = jt20Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new su20(jt20Var2, fxh0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m87500b(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1646555525);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            m87502d((View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f), (yqq) xq00Var.m91774k(wsh.f254617h), eh00Var, xq00Var, (i2 << 6) & 896);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new box(eh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87501c(int i, xq00 xq00Var) {
        xq00 xq00Var2;
        xq00Var.m91775k0(658754742);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            xq00Var2 = xq00Var;
            grl0.m45534g(y85.m93066k(oe10.f164317a), 1, rkk.m75772x(-1236377574, new oq5(bcs.m28782b(((bcs) xq00Var.m91774k(tsh.f223312a)).f25936a), (Context) xq00Var.m91774k(tsh.f223313b), 9), xq00Var), xq00Var2, 3072, 2);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y7u0(i, 17);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m87502d(View view, yqq yqqVar, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1319522472);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(yqqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zM91770i = xq00Var.m91770i(view) | ((i2 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new C1926h6(18, view, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            hz40.m49232d(view, yqqVar, (gh00) objM91750T, xq00Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oo4(view, yqqVar, eh00Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m87503e(List list, e940 e940Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-2006646840);
        int i2 = (xq00Var.m91766g(list) ? 4 : 2) | i | (xq00Var.m91770i(e940Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            qqg1.m73532b(vm6.f242710a.mo30068a(e940Var), rkk.m75772x(1994937096, new d361(list, gh00Var), xq00Var), xq00Var, 56);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rd71(list, e940Var, gh00Var, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m87504f(x581 x581Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        String strM54978M;
        String strM54971F;
        xq00Var.m91775k0(955400259);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(x581Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            gkk gkkVar = x581Var.f258332e;
            int i4 = gkkVar == null ? -1 : d681.f45623a[gkkVar.ordinal()];
            fyf fyfVarM75772x = null;
            if (i4 == -1) {
                xq00Var.m91771i0(-1360321590);
                xq00Var.m91788r(false);
                strM54978M = null;
            } else if (i4 == 1 || i4 == 2) {
                xq00Var.m91771i0(648850910);
                strM54978M = scg1.m77784f(x581Var.f258332e, xq00Var);
                xq00Var.m91788r(false);
            } else {
                if (i4 != 3 && i4 != 4) {
                    throw lq51.m59703i(648847668, xq00Var, false);
                }
                xq00Var.m91771i0(-1360321590);
                xq00Var.m91788r(false);
                strM54978M = null;
            }
            Integer num = x581Var.f258333f;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            if (num == null) {
                xq00Var.m91771i0(-1360245051);
                xq00Var.m91788r(false);
                strM54971F = null;
            } else {
                xq00Var.m91771i0(-1360245050);
                int iIntValue = num.intValue();
                strM54971F = k0e1.m54971F(R.plurals.contributor_sheet_songs_together, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, xq00Var);
                xq00Var.m91788r(false);
            }
            if (strM54978M != null && strM54971F != null) {
                xq00Var.m91771i0(648861158);
                strM54978M = k0e1.m54978M(R.string.contributor_sheet_relationship_with_songs_together, new Object[]{strM54978M, strM54971F}, xq00Var);
                xq00Var.m91788r(false);
            } else if (strM54978M != null) {
                xq00Var.m91771i0(648863448);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(648864032);
                xq00Var.m91788r(false);
                strM54978M = strM54971F;
            }
            String strM43753y0 = g6f.m43753y0(bk5.m29582E0(new String[]{x581Var.f258330c, strM54978M}), ", ", null, null, null, 62);
            float f = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).screenWidthDp;
            float fMo24617W0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo24617W0();
            if (fMo24617W0 < 1.0f) {
                fMo24617W0 = 1.0f;
            }
            float fMin = Math.min(f * 0.4f, 200) * fMo24617W0;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61838v = mi21.m61838v(fMin, cxh0Var);
            boolean zM91766g = xq00Var.m91766g(strM43753y0);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new e151(strM43753y0, 22);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM61838v, true, (gh00) objM91750T);
            float f2 = 0;
            nhu nhuVar = new nhu(leu.m58816b(xq00Var).f117230b.f224759b, leu.m58816b(xq00Var).f117230b.f224762e, leu.m58816b(xq00Var).f117230b.f224761d, new j4m0(f2, f2, f2, f2));
            zbp zbpVar = zbp.f281359f;
            peu peuVar = new peu(u40.f226523c, eh00Var);
            fyf fyfVarM75772x2 = rkk.m75772x(644753086, new oq5(fMin, x581Var, 11), xq00Var);
            if (strM54978M == null) {
                xq00Var.m91771i0(-417825628);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-417825627);
                fyfVarM75772x = rkk.m75772x(1928783632, new re01(strM54978M, 16), xq00Var);
                xq00Var.m91788r(false);
            }
            s800.m77433g(fxh0VarM96644b, null, nhuVar, null, null, null, zbpVar, peuVar, null, fyfVarM75772x2, null, null, fyfVarM75772x, null, null, null, rkk.m75772x(1626558840, new k361(x581Var, 13), xq00Var), xq00Var, 805306880, 1572864, 60730);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lz11(x581Var, eh00Var, fxh0Var2, i, 23);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m87505g(zs20 zs20Var, long j, yv20 yv20Var, xq00 xq00Var, int i) {
        int i2;
        long j2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(693225197);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var2.m91766g(zs20Var) : xq00Var2.m91770i(zs20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91764f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91770i(yv20Var) ? 256 : 128;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            txu txuVar = leu.m58816b(xq00Var2).f117230b;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96832C = zsf1.m96832C(mi21.m61820d(1.0f, cxh0Var), 0.0f, yv20Var.f276544b, 0.0f, 0.0f, 13);
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(bj5.f27616g, ub9Var, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96832C);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            yt20.m94582a(zs20Var.f285827a, j, yv20Var.f276549g, zsf1.m96864x(mi21.m61822f(1.0f, cxh0Var), yv20Var.f276545c), yv20Var.f276543a, 0, xq00Var, i3 & ContentType.LONG_FORM_ON_DEMAND, 32);
            j2 = j;
            x2h1.m89747i(zs20Var.f285830d, zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), txuVar.f224765h, 0.0f, 2).mo34315F(vt20.m86369b(1, xq00Var)), xq00Var, 0);
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            aaf aafVarM87496a2 = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            wv20.m89075a(zs20Var.f285828b, null, null, null, yv20Var.f276546d, xq00Var, 8, 14);
            xq00Var2 = xq00Var;
            wv20.m89075a(zs20Var.f285829c, null, new n6f(j2), null, yv20Var.f276547e, xq00Var2, 8 | ((i3 << 3) & 896), 10);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            j2 = j;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r43(zs20Var, j2, yv20Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: h */
    public static uwt m87506h(ViewGroup.LayoutParams layoutParams, fyf fyfVar, int i) {
        if ((i & 1) != 0) {
            layoutParams = null;
        }
        return m87518z(new cph(fyfVar, 4), layoutParams, (i & 2) == 0 ? "paidPodcastBanner" : null);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m87507i(Context context, gcb gcbVar) {
        Intent intent = new Intent(context, (Class<?>) CallingCodePickerActivity.class);
        intent.putExtra("selected-country-code", gcbVar != null ? gcbVar.f78530a : null);
        return intent;
    }

    /* JADX INFO: renamed from: j */
    public static oc80 m87508j(h8y0 h8y0Var) {
        return new oc80(h8y0Var, false);
    }

    /* JADX INFO: renamed from: k */
    public static ExternalAccessoryDescription m87509k(qko0 qko0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        qko0 qko0Var2 = qko0Var;
        if (!(qko0Var2 instanceof qko0)) {
            qko0Var2 = null;
        }
        qko0 qko0Var3 = qko0Var2 != null ? qko0Var2 : null;
        if (qko0Var3 != null) {
            str = qko0Var3.f189626a.equals("e11b1a8713164f739d2a9d9fed5a4c01") ? "speaker" : "headphones";
        } else {
            str = "";
        }
        return new ExternalAccessoryDescription("spotify_one_touch", (qko0Var3 == null || (str5 = qko0Var3.f189626a) == null) ? "" : str5, (qko0Var3 == null || (str2 = qko0Var3.f189629d) == null) ? "" : str2, "bluetooth", null, str, (qko0Var3 == null || (str4 = qko0Var3.f189628c) == null) ? "" : str4, (qko0Var3 == null || (str3 = qko0Var3.f189627b) == null) ? "" : str3, null, "spotify_go", null, 1296, null);
    }

    /* JADX INFO: renamed from: q */
    public static int m87510q(int i) {
        return i >>> 3;
    }

    /* JADX INFO: renamed from: r */
    public static int m87511r(int i) {
        return i & 7;
    }

    /* JADX INFO: renamed from: t */
    public static final t050 m87512t(z8k z8kVar, njk0 njk0Var, njk0 njk0Var2, njk0 njk0Var3) {
        return ((b9k) z8kVar).m28489g("OnDemandTrialsDaemon", new qik0(njk0Var, njk0Var2, njk0Var3, 17));
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m87513u(ContextTrack contextTrack) {
        return e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_POINTER_URI) != null && e72.m37990X(contextTrack);
    }

    /* JADX INFO: renamed from: v */
    public static int m87514v(int i, int i2) {
        return (i << 3) | i2;
    }

    /* JADX INFO: renamed from: w */
    public static fb80 m87515w(fb80 fb80Var, fb80 fb80Var2) {
        return (fb80Var2 == null || fb80Var2.compareTo(fb80Var) >= 0) ? fb80Var : fb80Var2;
    }

    /* JADX INFO: renamed from: x */
    public static final ko70 m87516x(boolean z, xq00 xq00Var) {
        Object objM91750T = xq00Var.m91750T();
        if (objM91750T == t6x0.f217647t) {
            objM91750T = sam.m77674m(new wih(z, 3));
            xq00Var.m91793t0(objM91750T);
        }
        return (ko70) ((rv41) objM91750T).getValue();
    }

    /* JADX INFO: renamed from: y */
    public static rxt m87517y(ry8 ry8Var, ViewGroup.LayoutParams layoutParams, ScrollCardType scrollCardType, int i) {
        if ((i & 1) != 0) {
            layoutParams = null;
        }
        if ((i & 2) != 0) {
            scrollCardType = null;
        }
        return new rxt(ry8Var, layoutParams, scrollCardType);
    }

    /* JADX INFO: renamed from: z */
    public static final uwt m87518z(pwt pwtVar, ViewGroup.LayoutParams layoutParams, Object obj) {
        return new uwt(new cj0(pwtVar, layoutParams, obj, 8));
    }

    /* JADX INFO: renamed from: l */
    public abstract String mo36793l();

    /* JADX INFO: renamed from: m */
    public abstract mke0 mo36794m();

    /* JADX INFO: renamed from: n */
    public abstract Playlist mo36795n();

    /* JADX INFO: renamed from: o */
    public abstract Status mo36796o();

    /* JADX INFO: renamed from: p */
    public abstract long mo36797p();

    /* JADX INFO: renamed from: s */
    public abstract long mo36798s();
}
