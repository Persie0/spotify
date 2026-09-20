package p204p;

import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zxc {

    /* JADX INFO: renamed from: a */
    public static sd40 f287281a;

    /* JADX INFO: renamed from: a */
    public static final ky3 m97181a(q94 q94Var) {
        Canvas canvas = ly3.f137948a;
        ky3 ky3Var = new ky3();
        ky3Var.f127640a = new Canvas(fz6.m43159o(q94Var));
        return ky3Var;
    }

    /* JADX INFO: renamed from: b */
    public static final void m97182b(pla1 pla1Var, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        Uri uri;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-529046278);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(pla1Var) ? 4 : 2) | (xq00Var2.m91766g(fxh0Var) ? 32 : 16) | (xq00Var2.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var2.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            fbk fbkVar = null;
            rv41 rv41VarM79506b = sw4.m79506b(((Boolean) kqi0Var.getValue()).booleanValue() ? 1.0f : 0.0f, jg31.m53259E(300, 0, null, 6), "scale_animation", null, xq00Var2, 3120, 20);
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = new vi1(6, fbkVar, kqi0Var);
                xq00Var2.m91793t0(objM91750T2);
            }
            hz40.m49237i(w2a1.f247311a, (th00) objM91750T2, xq00Var2);
            tfu tfuVar = tfu.f220051d;
            fxh0 fxh0VarM61840x = mi21.m61840x(fxh0Var, 0.0f, tfuVar.m80707a(xq00Var2), 1);
            float fFloatValue = ((Number) rv41VarM79506b.getValue()).floatValue();
            fxh0 fxh0VarM92179r = xuf1.m92179r(fxh0VarM61840x, fFloatValue, fFloatValue);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM92179r);
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
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, cxh0Var);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            String str = pla1Var.f178683c;
            if (str == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            wj50.m88279p(uri);
            kgg1.m56339b(uri, null, tfuVar, pla1Var.f178681a, pla1Var.f178682b, srz.m79125B(pla1Var.f178684d), 0L, false, xq00Var, 384, 194);
            fxh0 fxh0VarMo66945a = pha.f177517a.mo66945a(cxh0Var, d7f0.f46170g);
            float f = 1;
            long j = leu.m58815a(xq00Var).f112823a.f229874a.f123093a;
            fmx0 fmx0Var = hmx0.f93097a;
            fxh0 fxh0VarM64246i = nec.m64246i(mwg1.m63030j(f, j, fxh0VarMo66945a, fmx0Var), leu.m58815a(xq00Var).f112823a.f229874a.f123093a, fmx0Var);
            boolean z = (i2 & 896) == 256;
            Object objM91750T3 = xq00Var.m91750T();
            if (z || objM91750T3 == ia7Var) {
                objM91750T3 = new v7h(25, eh00Var);
                xq00Var.m91793t0(objM91750T3);
            }
            fxh0 fxh0VarM47247x = hdi.m47247x(fxh0VarM64246i, false, null, null, null, (eh00) objM91750T3, 15);
            m6d0 m6d0VarM36007d2 = dha.m36007d(wb9Var, false);
            int iHashCode3 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, fxh0VarM47247x);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar4, xq00Var);
            y85.m93057b(vwu.f245554c, qgj.f188480a, zsf1.m96865y(f, mi21.m61834r(16, cxh0Var)), 0L, 0L, true, xq00Var, vwu.f245555d | 197040, 24);
            xq00Var.m91788r(true);
            xq00Var.m91788r(true);
            ahf1.m25932d(pla1Var.f178682b, tfe.m80655m(d7f0.f46145P0, zsf1.m96832C(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 0.0f, 13)), leu.m58818d(xq00Var).f64977m, 0L, new h171(3), null, 2, false, new ol80(2), 0, null, xq00Var, 1572864, 0, 1704);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z1i((Object) pla1Var, fxh0Var, (ai00) eh00Var, i, 14);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m97183c(kbu kbuVar, eh00 eh00Var, xq00 xq00Var, int i) {
        eh00 eh00Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1436959331);
        int i2 = (xq00Var.m91766g(kbuVar) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            jq60.m54056b(rkk.m75772x(557755006, new hbu(kbuVar, 0), xq00Var), rkk.m75772x(1319636317, new hbu(kbuVar, 1), xq00Var), rkk.m75772x(2081517628, new ibu(eh00Var, kbuVar), xq00Var), eh00Var2, xq00Var2, ((i2 << 9) & 57344) | 438);
        } else {
            eh00Var2 = eh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ibu(kbuVar, eh00Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m97184d(String str, gky gkyVar, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(1150255828);
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91770i(gkyVar) ? 32 : 16) | (xq00Var2.m91770i(eh00Var) ? 256 : 128) | (xq00Var2.m91770i(eh00Var2) ? 2048 : 1024) | (xq00Var2.m91770i(eh00Var3) ? 16384 : 8192) | (xq00Var2.m91770i(fxh0Var) ? 131072 : 65536);
        if (xq00Var2.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            boolean z = (i2 & 896) == 256;
            Object objM91750T = xq00Var2.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new ljb1(25, eh00Var);
                xq00Var2.m91793t0(objM91750T);
            }
            u40 u40Var = u40.f226523c;
            peu peuVar = new peu(u40Var, (eh00) objM91750T);
            Object objM91750T2 = xq00Var2.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = fad1.f67524U0;
                xq00Var2.m91793t0(objM91750T2);
            }
            dyu.m37371c(peuVar, new sgu(0, null, (th00) objM91750T2, null, hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.f148188d), 11), null, null, vvx.m86517r(xq00Var), null, null, null, null, null, vhh.f241519a, xq00Var, 0, 48, 2012);
            riw0.m75615i(xq00Var, mi21.m61838v(8, cxh0.f43038a));
            mif1.m61869b(gkyVar, new zjy(str, (String) null, true, Mode.PROMPTABLE_SECTION, (String) null, false, Error.INVALID_COUNTRY_FIELD_NUMBER), null, null, xq00Var, (i2 >> 3) & 14, 12);
            boolean z2 = (i2 & 7168) == 2048;
            Object objM91750T3 = xq00Var.m91750T();
            if (z2 || objM91750T3 == ia7Var) {
                objM91750T3 = new ljb1(26, eh00Var2);
                xq00Var.m91793t0(objM91750T3);
            }
            peu peuVar2 = new peu(u40Var, (eh00) objM91750T3);
            wgu wguVar = wgu.f251150c;
            dyu.m37371c(peuVar2, wguVar, null, null, vvx.m86517r(xq00Var), null, null, null, null, null, vhh.f241520b, xq00Var, 0, 48, 2012);
            boolean z3 = (i2 & 57344) == 16384;
            Object objM91750T4 = xq00Var.m91750T();
            if (z3 || objM91750T4 == ia7Var) {
                objM91750T4 = new ljb1(27, eh00Var3);
                xq00Var.m91793t0(objM91750T4);
            }
            dyu.m37371c(new peu(u40Var, (eh00) objM91750T4), wguVar, null, null, vvx.m86517r(xq00Var), null, null, null, null, null, vhh.f241521c, xq00Var, 0, 48, 2012);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new la11(str, gkyVar, eh00Var, eh00Var2, eh00Var3, fxh0Var, i, 12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final fxh0 m97185e(float f, fxh0 fxh0Var) {
        return f == 1.0f ? fxh0Var : l0y0.m57833o(fxh0Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0, null, 520187);
    }

    /* JADX INFO: renamed from: f */
    public static fxh0 m97186f(int i, fxh0 fxh0Var) {
        int i2;
        if ((i & 1) != 0) {
            xba0 xba0Var = eoc0.f61387a;
            i2 = 3;
        } else {
            i2 = Alert.DURATION_SHOW_INDEFINITELY;
        }
        return fxh0Var.mo34315F(new hoc0(i2, 0, 1200, eoc0.f61387a, eoc0.f61388b));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m97187g(PlayerState playerState, qsb qsbVar, r741 r741Var, gzb gzbVar, ibk ibkVar) {
        ccp0 ccp0Var;
        ContextTrack contextTrack;
        LinkedHashSet linkedHashSet;
        ContextTrack contextTrack2;
        LinkedHashSet linkedHashSet2;
        if (ibkVar instanceof ccp0) {
            ccp0Var = (ccp0) ibkVar;
            int i = ccp0Var.f36589d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ccp0Var.f36589d = i - Integer.MIN_VALUE;
            } else {
                ccp0Var = new ccp0(ibkVar);
            }
        } else {
            ccp0Var = new ccp0(ibkVar);
        }
        Object obj = ccp0Var.f36588c;
        int i2 = ccp0Var.f36589d;
        if (i2 == 0) {
            bga.m29073P(obj);
            contextTrack = (ContextTrack) playerState.track().mo49283h();
            if (contextTrack == null) {
                return lyt.f138114a;
            }
            linkedHashSet = new LinkedHashSet();
            String strContextUri = playerState.contextUri();
            if (strContextUri == null) {
                strContextUri = "";
            }
            if (r741Var.m74888c(strContextUri)) {
                linkedHashSet.add(gyt.CONTEXT_IS_SPONSORED);
            }
            if (((hzb) gzbVar).m49260a()) {
                linkedHashSet.add(gyt.CAR_CONNECTED);
            }
            if (e72.m37976J(contextTrack)) {
                linkedHashSet.add(gyt.TRACK_IS_AD);
            } else if (e72.m37986T(contextTrack)) {
                linkedHashSet.add(gyt.TRACK_IS_PODCAST);
            } else if (e72.m37996b0(contextTrack)) {
                linkedHashSet.add(gyt.TRACK_IS_MUSIC_VIDEO);
            } else {
                fiz fizVarMo24819a = qsbVar.mo24819a(contextTrack);
                ccp0Var.f36586a = contextTrack;
                ccp0Var.f36587b = linkedHashSet;
                ccp0Var.f36589d = 1;
                Object objM86755t = vyf1.m86755t(fizVarMo24819a, ccp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
                contextTrack2 = contextTrack;
                obj = objM86755t;
                linkedHashSet2 = linkedHashSet;
            }
            return linkedHashSet.isEmpty() ? new kyt(contextTrack.uri()) : new jyt(contextTrack.uri(), linkedHashSet);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        linkedHashSet2 = ccp0Var.f36587b;
        contextTrack2 = ccp0Var.f36586a;
        bga.m29073P(obj);
        if (((Boolean) obj).booleanValue()) {
            linkedHashSet2.add(gyt.TRACK_IS_CANVAS);
        }
        linkedHashSet = linkedHashSet2;
        contextTrack = contextTrack2;
        if (linkedHashSet.isEmpty()) {
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m97188h(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof RecyclerView) {
                    ((RecyclerView) childAt).setNestedScrollingEnabled(false);
                }
                wj50.m88279p(childAt);
                m97188h(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final int m97189i(PlayerState playerState) {
        if (playerState.options().repeatingTrack()) {
            return 3;
        }
        return playerState.options().repeatingContext() ? 2 : 1;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m97190j(as81 as81Var) {
        if (as81Var.equals(ur81.f233277a) || as81Var.equals(yr81.f275423a) || as81Var.equals(zr81.f285582a)) {
            return true;
        }
        if (as81Var.equals(tr81.f223009a) || as81Var.equals(xr81.f265291a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static final Long m97191k(adf0 adf0Var) {
        if (adf0Var instanceof ycf0) {
            return Long.valueOf(((ycf0) adf0Var).f271483a);
        }
        if (adf0Var instanceof zcf0) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m97192l(rbf0 rbf0Var) {
        return rbf0Var.f197587b instanceof mcf0;
    }

    /* JADX INFO: renamed from: m */
    public static final String m97193m(rbf0 rbf0Var) {
        qcf0 qcf0Var = rbf0Var.f197587b;
        if (wj50.m88271j(qcf0Var, pcf0.f176071a)) {
            return "sum";
        }
        if (wj50.m88271j(qcf0Var, ocf0.f163920a)) {
            return "last_value";
        }
        if (wj50.m88271j(qcf0Var, mcf0.f142147a)) {
            return "delta";
        }
        if (qcf0Var instanceof ncf0) {
            return "histogram";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m97194n(rbf0 rbf0Var) {
        return rbf0Var.f197588c != null;
    }

    /* JADX INFO: renamed from: o */
    public static final int m97195o(int i, Restrictions restrictions) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            if (restrictions.disallowTogglingRepeatContextReasons().isEmpty()) {
                return 2;
            }
            return m97195o(2, restrictions);
        }
        if (iM38547C != 1) {
            return 1;
        }
        if (restrictions.disallowTogglingRepeatTrackReasons().isEmpty()) {
            return 3;
        }
        return m97195o(3, restrictions);
    }
}
