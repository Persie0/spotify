package p204p;

import android.net.Uri;
import com.comscore.streaming.ContentType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.contentagnostic.p051v2.Audio;
import com.spotify.contentagnostic.p051v2.Transcript;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iag1 {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f100255a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public static sd40 f100256b;

    /* JADX INFO: renamed from: c */
    public static sd40 f100257c;

    /* JADX INFO: renamed from: a */
    public static final void m50060a(l971 l971Var, eh00 eh00Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(2133523249);
        int i2 = i | (xq00Var.m91766g(l971Var) ? 4 : 2) | (xq00Var.m91762e(R.string.chat_share_with_search_input_placeholder) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192) | 196608;
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = tfe.m80656n(xq00Var);
            }
            voi0 voi0Var = (voi0) objM91750T;
            CharSequence charSequence = l971Var.m58500d().f226935c;
            boolean z = (57344 & i2) == 16384;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new wvy0(gh00Var, l971Var, null, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            hz40.m49237i(charSequence, (th00) objM91750T2, xq00Var);
            String strM54977L = k0e1.m54977L(R.string.chat_share_with_search_input_placeholder, xq00Var);
            xzy xzyVarM92018F = xtf1.m92018F(kf5.f122059e, CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER);
            t0v t0vVar = new t0v(new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896));
            float f = leu.m58816b(xq00Var).f117232d.f137887c;
            cxh0 cxh0Var = cxh0.f43038a;
            wze1.m89429e(l971Var, t0vVar, mi21.m61822f(1.0f, mi21.m61826j(cxh0Var, f, 0.0f, 2)), null, strM54977L, d6h.f45698a, rkk.m75772x(622832701, new xvy0(l971Var, eh00Var, 0), xq00Var), false, xzyVarM92018F, null, null, null, q771.f186043b, voi0Var, null, null, null, 0.0f, xq00Var, i3 | 1769472, 199680, 1006984);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yvy0(l971Var, eh00Var, gh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m50061b(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-709587036);
        int i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2) | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            fxh0 fxh0VarM47247x = hdi.m47247x(mi21.m61822f(1.0f, fxh0Var), false, null, null, null, eh00Var, 15);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM47247x);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            jqu jquVar = jqu.f115003c;
            float f = leu.m58816b(xq00Var).f117235g.f159604b;
            cxh0 cxh0Var = cxh0.f43038a;
            y85.m93057b(jquVar, qgj.f188480a, mi21.m61834r(f, cxh0Var), 0L, 0L, false, xq00Var, jqu.f115004d | 48, 56);
            ahf1.m25932d(k0e1.m54977L(R.string.lossless_streaming_quality_card_settings_title, xq00Var), zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 0.0f, 0.0f, 14), leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(eh00Var, fxh0Var, i, 19);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m50062c(qk51 qk51Var, eh00 eh00Var, fyf fyfVar, fxh0 fxh0Var, fyf fyfVar2, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1870231668);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(qk51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= xq00Var.m91770i(fyfVar2) ? 16384 : 8192;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            y0v.m92603a(2, rkk.m75772x(-1204158080, new s1z0(qk51Var, fyfVar, fyfVar2, eh00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r0r0((Object) qk51Var, (Object) eh00Var, (Object) fyfVar, fxh0Var2, (Object) fyfVar2, i, 23);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m50063d(l971 l971Var, eqz eqzVar, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        l971 l971Var2;
        eqz eqzVar2;
        eh00 eh00Var2;
        xq00Var.m91775k0(1071256495);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(l971Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(eqzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zM91770i = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91770i(l971Var) | ((i2 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                l971Var2 = l971Var;
                eqzVar2 = eqzVar;
                eh00Var2 = eh00Var;
                xvd xvdVar = new xvd(eqzVar2, l971Var2, eh00Var2, (fbk) null, 4);
                xq00Var.m91793t0(xvdVar);
                objM91750T = xvdVar;
            } else {
                l971Var2 = l971Var;
                eqzVar2 = eqzVar;
                eh00Var2 = eh00Var;
            }
            hz40.m49237i(eqzVar2, (th00) objM91750T, xq00Var);
        } else {
            l971Var2 = l971Var;
            eqzVar2 = eqzVar;
            eh00Var2 = eh00Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new hsd((Object) l971Var2, (Object) eqzVar2, (Object) eh00Var2, false, i, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m50064e(qk51 qk51Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(229853546);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(qk51Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = k351.f118775V0;
                xq00Var.m91793t0(objM91750T);
            }
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("streaming-quality-test-tag", zoz0.m96644b(cxh0Var, true, (gh00) objM91750T));
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM39673I);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            ahf1.m25932d(k0e1.m54977L(R.string.lossless_streaming_quality_card_file_quality_header, xq00Var), zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 8), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            int i3 = qk51Var.f189459e;
            ssg1 ssg1Var = qk51Var.f189460f;
            ahf1.m25932d(k0e1.m54977L(i3, xq00Var), zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224758a, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 8), leu.m58818d(xq00Var).f64967c, leu.m58815a(xq00Var).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var.m91788r(true);
            if (ssg1Var instanceof hh9) {
                xq00Var.m91771i0(1390162121);
                ahf1.m25932d(k0e1.m54977L(((hh9) ssg1Var).f91307b, xq00Var), epv0.m39673I("bitrate-test-tag", zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224758a, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 8)), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138759c, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1390580280);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lvs0(qk51Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m50065f(gcr0 gcr0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-1072209479);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(gcr0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            fxh0 fxh0VarM97185e = !((Boolean) kqi0Var.getValue()).booleanValue() ? zxc.m97185e(0.0f, fxh0Var) : fxh0Var;
            Uri uri = Uri.parse(gcr0Var.f78646a);
            xyu xyuVarM55216r = k2z0.m55216r(aru.f19145c, 0L, n6f.f150870j, xq00Var, aru.f19146d | 3456, 18);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = new esc0(kqi0Var, 25);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = new esc0(kqi0Var, 26);
                xq00Var.m91793t0(objM91750T3);
            }
            l0y0.m57824f(vm6.m85986a(uri, null, null, null, null, xyuVarM55216r, true, false, gh00Var, (gh00) objM91750T3, null, 0L, xq00Var, 102957056, 3456, 118430), new rgj(gcr0Var.f78647b), fxh0VarM97185e, null, null, null, r101.f194647O0, null, null, xq00Var, 1797120, 384);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rla0(gcr0Var, fxh0Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m50066g(int i, pqz pqzVar) {
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return !(((hw40) ((jw40) ((iw40) oqg1.m67639h(pqzVar, wsh.f254622m))).f116573a.getValue()).f95856a == 1);
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m50067h(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: i */
    public static final ts6 m50068i(Audio audio) {
        ss6 ss6Var = new ss6(new rfz(audio.m7758o().m7762p().m7856o()));
        Transcript transcriptM7759q = audio.m7759q();
        return new ts6(ss6Var, transcriptM7759q != null ? new wy81(new rfz(transcriptM7759q.m7947p().m7856o())) : null);
    }

    /* JADX INFO: renamed from: j */
    public static final xv41 m50069j(s4s0 s4s0Var) {
        if (s4s0Var instanceof n4s0) {
            return ((n4s0) s4s0Var).f150413a;
        }
        if (s4s0Var instanceof o4s0) {
            return ((o4s0) s4s0Var).f161750a;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static spr m50070k() {
        return new spr(new spr("spotify:internal:iir-qs", 1), 2);
    }

    /* JADX INFO: renamed from: l */
    public static final Next m50071l(wu41 wu41Var, y1x y1xVar) {
        riw0 riw0Var = wu41Var.f255105d;
        if (y1xVar.equals(zxw.f287418a)) {
            return Next.m15606h(wu41.m89013a(wu41Var, vm91.m85987J((vm91) riw0Var, null, qrv0.f191920e, 5)));
        }
        if (y1xVar instanceof ayw) {
            return Next.m15606h(wu41.m89013a(wu41Var, vm91.m85987J((vm91) riw0Var, ((ayw) y1xVar).f21368a, qrv0.f191918c, 4)));
        }
        if (y1xVar.equals(yxw.f277333a)) {
            return Next.m15607i(wu41.m89013a(wu41Var, vm91.m85987J((vm91) riw0Var, null, qrv0.f191919d, 5)), Collections.singleton(new zit(wu41Var.f255102a)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
