package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.facebook.FacebookException;
import com.spotify.music.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ytg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f276124a;

    /* JADX INFO: renamed from: a */
    public static final void m94610a(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        txu txuVar;
        yhh yhhVar;
        vlh vlhVar;
        yhh yhhVar2;
        yhh yhhVar3;
        int i2;
        cxh0 cxh0Var;
        C2087le c2087le;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(767283227);
        ug5 ug5Var = xq00Var2.f264811a;
        int i3 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91770i(eh00Var) ? 32 : 16) | 384;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            txu txuVar2 = leu.m58816b(xq00Var2).f117230b;
            lxu lxuVar = leu.m58816b(xq00Var2).f117233e;
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47247x(mi21.m61822f(1.0f, cxh0Var2), false, null, null, null, eh00Var, 15), lxuVar.f137887c, txuVar2.f224761d);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
            soh.f211194A.getClass();
            C2087le c2087le2 = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le2);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar4 = roh.f201262g;
            zsf1.m96835F(irx0VarM36744a, yhhVar4, xq00Var2);
            yhh yhhVar5 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar5, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar6 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar6, xq00Var2);
            vlh vlhVar2 = roh.f201266k;
            zsf1.m96833D(vlhVar2, xq00Var2);
            yhh yhhVar7 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar7, xq00Var2);
            if (str != null) {
                xq00Var2.m91771i0(811765706);
                vlhVar = vlhVar2;
                yhhVar2 = yhhVar6;
                yhhVar3 = yhhVar7;
                i2 = 0;
                txuVar = txuVar2;
                yhhVar = yhhVar5;
                cxh0Var = cxh0Var2;
                upf.m83687d(vm6.m85986a(Uri.parse(str), null, null, null, null, null, false, false, null, null, null, 0L, xq00Var, 0, 0, 131070), null, r9g1.m75068p(mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159608f, cxh0Var), hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), null, r101.f194644L0, 0.0f, null, xq00Var, 48, 104);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            } else {
                txuVar = txuVar2;
                yhhVar = yhhVar5;
                vlhVar = vlhVar2;
                yhhVar2 = yhhVar6;
                yhhVar3 = yhhVar7;
                i2 = 0;
                cxh0Var = cxh0Var2;
                xq00Var2.m91771i0(812097251);
                xq00Var2.m91788r(false);
            }
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM96830A = zsf1.m96830A(new cr70(1.0f, true), txuVar.f224763f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, i2);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                c2087le = c2087le2;
                xq00Var2.m91776l(c2087le);
            } else {
                c2087le = c2087le2;
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar4, xq00Var2);
            yhh yhhVar8 = yhhVar;
            zsf1.m96835F(wpn0VarM91778m2, yhhVar8, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar2, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar3, xq00Var2);
            C2087le c2087le3 = c2087le;
            cxh0 cxh0Var3 = cxh0Var;
            yhh yhhVar9 = yhhVar2;
            vlh vlhVar3 = vlhVar;
            yhh yhhVar10 = yhhVar3;
            ahf1.m25932d(k0e1.m54977L(R.string.ereader_music_listen_to_audiobook, xq00Var2), null, leu.m58818d(xq00Var2).f64971g, 0L, null, null, 0, false, new ol80(1), 0, null, xq00Var2, 0, 0, 1786);
            ahf1.m25932d(k0e1.m54977L(R.string.ereader_music_listening_closes_reader, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, new ol80(1), 0, null, xq00Var2, 0, 0, 1778);
            xq00Var2.m91788r(true);
            fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(mi21.m61834r(leu.m58816b(xq00Var2).f117232d.f137886b, cxh0Var3), hmx0.f93097a), leu.m58815a(xq00Var2).f112824b.f138759c, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM64246i);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le3);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, yhhVar4, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar8, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar9, xq00Var2, vlhVar3);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar10, xq00Var2);
            y85.m93057b(psu.f180961c, new rgj(k0e1.m54977L(R.string.ereader_music_listen_to_audiobook, xq00Var2)), mi21.m61834r(leu.m58816b(xq00Var2).f117235g.f159612j, cxh0Var3), n6f.f150862b, 0L, false, xq00Var2, psu.f180962d, 48);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var3;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str, eh00Var, fxh0Var2, i, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m94611b(hfp0 hfp0Var, String str, String str2, String str3, String str4, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(335674579);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(hfp0Var) ? 4 : 2) | (xq00Var2.m91766g(str) ? 32 : 16) | (xq00Var2.m91766g(str2) ? 256 : 128) | (xq00Var2.m91766g(str3) ? 2048 : 1024) | (xq00Var2.m91766g(str4) ? 16384 : 8192) | (xq00Var2.m91770i(eh00Var) ? 131072 : 65536) | 1572864;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 599187) != 599186)) {
            txu txuVar = leu.m58816b(xq00Var2).f117230b;
            lxu lxuVar = leu.m58816b(xq00Var2).f117233e;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47247x(mi21.m61822f(1.0f, cxh0Var), false, null, null, null, eh00Var, 15), lxuVar.f137887c, txuVar.f224761d);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96866z);
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
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            mif1.m61869b(hfp0Var, new ffp0(str, str2), null, null, xq00Var2, i2 & 14, 12);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            fxh0 fxh0VarM96830A = zsf1.m96830A(new cr70(1.0f, true), txuVar.f224762e, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(str3, null, leu.m58818d(xq00Var2).f64971g, 0L, null, null, 0, false, new ol80(1), 0, null, xq00Var, (i2 >> 9) & 14, 0, 1786);
            ahf1.m25932d(str4, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, new ol80(1), 0, null, xq00Var, (i2 >> 12) & 14, 0, 1778);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ctu0(hfp0Var, str, str2, str3, str4, eh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m94612c(od7 od7Var, String str, List list, hfp0 hfp0Var, gh00 gh00Var, eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-2109516143);
        int i2 = i | (xq00Var.m91766g(od7Var) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91766g(list) ? 256 : 128) | (xq00Var.m91766g(hfp0Var) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            dgu.m35938b(eh00Var, null, null, false, false, 0.0f, false, Boolean.TRUE, false, false, null, rkk.m75772x(1340369010, new xps0(od7Var, str, list, hfp0Var, gh00Var), xq00Var), xq00Var, ((i2 >> 15) & 14) | 12607488, 48, 1902);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ts40((Object) od7Var, (Object) str, (Object) list, (Object) hfp0Var, gh00Var, (ai00) eh00Var, i, 25);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Exception m94613d(AbstractC1861fi abstractC1861fi, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(str, abstractC1861fi);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(str, abstractC1861fi);
        }
        throw new FrameworkClassParsingException();
    }

    /* JADX INFO: renamed from: e */
    public static final int m94614e(ss10 ss10Var) {
        int iOrdinal = ss10Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.graduation_view_request_page_header_title;
        }
        if (iOrdinal == 1) {
            return R.string.graduation_view_request_page_teen_header_title;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static final void m94615f(c700 c700Var, my8 my8Var) {
        m500 m500VarMo31499Z = c700Var.f34689x.mo31499Z();
        if (m500VarMo31499Z == null) {
            m500VarMo31499Z = null;
        }
        if (m500VarMo31499Z != null) {
            br9 br9Var = new br9(m500VarMo31499Z, 0);
            br9Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            m500VarMo31499Z.addContentView(br9Var, br9Var.getLayoutParams());
            my8Var.f98716q1.mo31986a(new dz2(br9Var, 2));
            br9Var.postDelayed(new n10(br9Var, 18), 1000L);
        }
    }

    /* JADX INFO: renamed from: g */
    public static fem m94616g(int i) {
        if (i != 0) {
            return i != 1 ? new imx0() : new jdm();
        }
        return new imx0();
    }

    /* JADX INFO: renamed from: h */
    public static imx0 m94617h() {
        return new imx0();
    }

    /* JADX INFO: renamed from: i */
    public static crs m94618i() {
        return new crs(0);
    }

    /* JADX INFO: renamed from: j */
    public static GradientDrawable m94619j(Context context, int i) {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ztg1.m96916g(0.4f, i), bug1.m30532u(context, android.R.attr.windowBackground)});
    }

    /* JADX INFO: renamed from: k */
    public static String m94620k(fva fvaVar) {
        StringBuilder sb = new StringBuilder(fvaVar.size());
        for (int i = 0; i < fvaVar.size(); i++) {
            byte bMo30594a = fvaVar.mo30594a(i);
            if (bMo30594a == 34) {
                sb.append("\\\"");
            } else if (bMo30594a == 39) {
                sb.append("\\'");
            } else if (bMo30594a != 92) {
                switch (bMo30594a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo30594a < 32 || bMo30594a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo30594a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo30594a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo30594a & 7) + 48));
                        } else {
                            sb.append((char) bMo30594a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static mv0 m94621l(String str) {
        Object next;
        Iterator it = mv0.f147471l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((mv0) next).f147472a, str));
        mv0 mv0Var = (mv0) next;
        return mv0Var == null ? new mv0(str) : mv0Var;
    }

    /* JADX INFO: renamed from: m */
    public static void m94622m() {
        mv0 mv0Var = mv0.f147461b;
    }

    /* JADX INFO: renamed from: n */
    public static final List m94623n(ofm0 ofm0Var) {
        if (((ka70) ofm0Var.mo15684j0(ka70.class).mo31538a()) != null) {
            return lau.f131415a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final List m94624o(ofm0 ofm0Var) {
        if (((ka70) ofm0Var.mo15684j0(ka70.class).mo31538a()) != null) {
            return lau.f131415a;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final List m94625p(ofm0 ofm0Var) {
        ka70 ka70Var = (ka70) ofm0Var.mo15684j0(ka70.class).mo31538a();
        if (ka70Var != null) {
            return ka70Var.f120815a;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static void m94626q() {
        mv0 mv0Var = mv0.f147461b;
    }

    /* JADX INFO: renamed from: r */
    public static final List m94627r(ofm0 ofm0Var) {
        ka70 ka70Var = (ka70) ofm0Var.mo15684j0(ka70.class).mo31538a();
        if (ka70Var != null) {
            return ka70Var.f120816b;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static void m94628s() {
        mv0 mv0Var = mv0.f147461b;
    }

    /* JADX INFO: renamed from: t */
    public static final t050 m94629t(z8k z8kVar, uik0 uik0Var, djk0 djk0Var) {
        return ((b9k) z8kVar).m28489g("ActiveDeviceIdSaverDaemon", new mii0(21, uik0Var, djk0Var));
    }

    /* JADX INFO: renamed from: u */
    public static final dx10 m94630u(C1893gd c1893gd, Uri uri, gld1 gld1Var) {
        String path = uri.getPath();
        boolean zEqualsIgnoreCase = "file".equalsIgnoreCase(uri.getScheme());
        eh30 eh30Var = eh30.f59474b;
        if (zEqualsIgnoreCase && path != null) {
            bx10 bx10Var = new bx10(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", bx10Var);
            return new dx10(c1893gd, "me/staging_resources", bundle, eh30Var, gld1Var, 32);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        bx10 bx10Var2 = new bx10(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", bx10Var2);
        return new dx10(c1893gd, "me/staging_resources", bundle2, eh30Var, gld1Var, 32);
    }

    /* JADX INFO: renamed from: v */
    public static void m94631v(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof n3d0) {
            ((n3d0) background).m63600k(f);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m94632w(View view, n3d0 n3d0Var) {
        eyt eytVar = n3d0Var.f150021a.f139594b;
        if (eytVar == null || !eytVar.f64161a) {
            return;
        }
        float fM32541e = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = mec1.f142677a;
            fM32541e += cec1.m32541e((View) parent);
        }
        m3d0 m3d0Var = n3d0Var.f150021a;
        if (m3d0Var.f139604l != fM32541e) {
            m3d0Var.f139604l = fM32541e;
            n3d0Var.m63608s();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m94633x(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof n3d0) {
            m94632w(viewGroup, (n3d0) background);
        }
    }

    /* JADX INFO: renamed from: y */
    public static z5x m94634y(int i) {
        if (i == 404) {
            return z5x.NOT_FOUND;
        }
        if (i == 408 || i == 504) {
            return z5x.TIMEOUT;
        }
        if (i >= 500) {
            return z5x.SERVER_ERROR;
        }
        return i >= 400 ? z5x.CLIENT_ERROR : z5x.UNKNOWN;
    }

    /* JADX INFO: renamed from: z */
    public static void m94635z() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
