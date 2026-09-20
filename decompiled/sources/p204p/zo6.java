package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import p000.C0112c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zo6 {

    /* JADX INFO: renamed from: f */
    public static final float f284703f;

    /* JADX INFO: renamed from: h */
    public static final float f284705h;

    /* JADX INFO: renamed from: a */
    public static final float f284698a = 166;

    /* JADX INFO: renamed from: b */
    public static final float f284699b = 280;

    /* JADX INFO: renamed from: c */
    public static final float f284700c = 44;

    /* JADX INFO: renamed from: d */
    public static final float f284701d = 24;

    /* JADX INFO: renamed from: e */
    public static final float f284702e = 18;

    /* JADX INFO: renamed from: g */
    public static final float f284704g = 8;

    static {
        float f = 16;
        f284703f = f;
        f284705h = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m96607a(qf40 qf40Var, int i, boolean z, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        xq00 xq00Var2;
        long j;
        int i3;
        xq00 xq00Var3 = xq00Var;
        Object obj = t6x0.f217647t;
        xq00Var3.m91775k0(-2091754170);
        int i4 = 2;
        int i5 = i2 | (xq00Var3.m91766g(qf40Var) ? 4 : 2) | (xq00Var3.m91762e(edb.m38547C(i)) ? 32 : 16) | (xq00Var3.m91768h(z) ? 256 : 128) | (xq00Var3.m91770i(gh00Var) ? 2048 : 1024) | 24576;
        boolean z2 = false;
        int i6 = 1;
        if (xq00Var3.m91752Y(i5 & 1, (i5 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(nec.m64246i(mi21.m61839w(p271.m68893C(2, cxh0Var), f284698a, f284699b), leu.m58815a(xq00Var3).f112823a.f229874a.f123094b, hmx0.m47993b(leu.m58816b(xq00Var3).f117234f.f148189e)), 0.0f, leu.m58816b(xq00Var3).f117230b.f224760c, 1);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var3, 0);
            int iHashCode = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var3, fxh0VarM96830A);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var3.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(eh00Var);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var3);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var3);
            zsf1.m96833D(roh.f201266k, xq00Var3);
            Iterator itM42470n = fr0.m42470n(xq00Var3, fxh0VarM48286s, roh.f201259d, -627373164, qf40Var);
            xq00 xq00Var4 = xq00Var3;
            while (itM42470n.hasNext()) {
                lcd lcdVar = (lcd) itM42470n.next();
                boolean z3 = (lcdVar != lcd.f131902b || i == i4) ? i6 : z2;
                if (z3 != 0) {
                    xq00Var4.m91771i0(-921119296);
                    j = leu.m58815a(xq00Var4).f112824b.f138757a;
                } else {
                    xq00Var4.m91771i0(-921118141);
                    j = leu.m58815a(xq00Var4).f112825c.f221219b;
                }
                xq00Var4.m91788r(z2);
                int iOrdinal = lcdVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = R.string.chat_attachment_menu_songs_and_more;
                } else if (iOrdinal == i6) {
                    i3 = z ? R.string.chat_attachment_menu_photos_and_videos : R.string.chat_attachment_menu_photos;
                } else if (iOrdinal == i4) {
                    i3 = R.string.chat_attachment_menu_lyrics_stickers;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R.string.chat_attachment_menu_gifs;
                }
                String strM54977L = k0e1.m54977L(i3, xq00Var4);
                kyu kyuVar = new kyu(null, 1, null, null, 27);
                fxh0 fxh0VarM61818b = mi21.m61818b(mi21.m61822f(1.0f, cxh0Var), 0.0f, f284700c, i6);
                boolean zM91768h = xq00Var4.m91768h(z3);
                Object objM91750T = xq00Var4.m91750T();
                Object obj2 = objM91750T;
                if (zM91768h || objM91750T == obj) {
                    Object c1758cy = new C1758cy(z3, 1);
                    xq00Var4.m91793t0(c1758cy);
                    obj2 = c1758cy;
                }
                fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM61818b, false, (gh00) obj2);
                int i7 = ((i5 & 7168) == 2048 ? i6 : 0) | (xq00Var4.m91762e(lcdVar.ordinal()) ? 1 : 0);
                Object objM91750T2 = xq00Var4.m91750T();
                Object obj3 = objM91750T2;
                if (i7 != 0 || objM91750T2 == obj) {
                    Object zq2Var = new zq2(27, gh00Var, lcdVar);
                    xq00Var4.m91793t0(zq2Var);
                    obj3 = zq2Var;
                }
                eh00 eh00Var2 = (eh00) obj3;
                if (wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                xq00 xq00Var5 = xq00Var4;
                p711.m69222a(fxh0VarM96644b, kyuVar, null, false, null, null, new peu(new t40(strM54977L), eh00Var2), null, rkk.m75772x(-1064770042, new uo6(lcdVar, j, 0), xq00Var4), null, null, null, null, null, null, rkk.m75772x(-1347047744, new g90(j, 1, strM54977L), xq00Var4), xq00Var5, 100663360, 196608, 32444);
                i5 = i5;
                z2 = false;
                xq00Var4 = xq00Var5;
                i4 = 2;
                cxh0Var = cxh0Var;
                i6 = 1;
            }
            xq00 xq00Var6 = xq00Var4;
            fxh0Var2 = cxh0Var;
            xq00Var6.m91788r(z2);
            xq00Var6.m91788r(true);
            xq00Var2 = xq00Var6;
        } else {
            xq00 xq00Var7 = xq00Var3;
            xq00Var7.m91757b0();
            fxh0Var2 = fxh0Var;
            xq00Var2 = xq00Var7;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vo6(qf40Var, i, z, gh00Var, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m96608b(qf40 qf40Var, int i, boolean z, gh00 gh00Var, eh00 eh00Var, xq00 xq00Var, int i2) {
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(2032340017);
        int i3 = i2 | (xq00Var.m91766g(qf40Var) ? 4 : 2) | (xq00Var.m91762e(edb.m38547C(i)) ? 32 : 16) | (xq00Var.m91768h(z) ? 256 : 128) | (xq00Var.m91770i(gh00Var) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var) ? 16384 : 8192);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            boolean zM91766g = xq00Var.m91766g(yqqVar);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = new ap6(yqqVar);
                xq00Var.m91793t0(objM91750T);
            }
            ap6 ap6Var = (ap6) objM91750T;
            xq00Var.m91771i0(-1131350578);
            int iMo35990l0 = yqqVar.mo35990l0(leu.m58816b(xq00Var).f117230b.f224763f);
            xq00Var.m91788r(false);
            Object objM91750T2 = xq00Var.m91750T();
            Object obj2 = objM91750T2;
            if (objM91750T2 == obj) {
                oqi0 oqi0Var = new oqi0(Boolean.FALSE);
                oqi0Var.m67648F1(Boolean.TRUE);
                xq00Var.m91793t0(oqi0Var);
                obj2 = oqi0Var;
            }
            sm4.m78514a(ap6Var, eh00Var, new raq0(24, true, true, true), rkk.m75772x(-1962439981, new yo6((oqi0) obj2, iMo35990l0, qf40Var, i, z, gh00Var), xq00Var), xq00Var, ((i3 >> 9) & ContentType.LONG_FORM_ON_DEMAND) | 3456, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v20(qf40Var, i, z, gh00Var, eh00Var, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m96609c(lcd lcdVar, long j, xq00 xq00Var, int i) {
        int i2;
        wwu wwuVar;
        xq00Var.m91775k0(97196354);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91762e(lcdVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91764f(j) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            float f = f284701d;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61834r = mi21.m61834r(f, cxh0Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61834r);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            fbk fbkVar = null;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fxh0 fxh0VarM61834r2 = mi21.m61834r(f284702e, cxh0Var);
            lcd lcdVar2 = lcd.f131903c;
            qgj qgjVar = qgj.f188480a;
            if (lcdVar == lcdVar2) {
                xq00Var.m91771i0(-589432903);
                Object objM91750T = xq00Var.m91750T();
                Object obj = t6x0.f217647t;
                if (objM91750T == obj) {
                    objM91750T = s95.m77551a(0.0f);
                    xq00Var.m91793t0(objM91750T);
                }
                gw4 gw4Var = (gw4) objM91750T;
                boolean zM91770i = xq00Var.m91770i(gw4Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i || objM91750T2 == obj) {
                    objM91750T2 = new C0112c(gw4Var, fbkVar, 1);
                    xq00Var.m91793t0(objM91750T2);
                }
                hz40.m49237i(w2a1.f247311a, (th00) objM91750T2, xq00Var);
                float fFloatValue = ((Number) gw4Var.m45912e()).floatValue();
                boolean zM91760d = xq00Var.m91760d(fFloatValue);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91760d || objM91750T3 == obj) {
                    objM91750T3 = new ry4(fFloatValue, 2);
                    xq00Var.m91793t0(objM91750T3);
                }
                y85.m93057b(pvu.f181832c, qgjVar, l0y0.m57831m(fxh0VarM61834r2, (gh00) objM91750T3), j, 0L, true, xq00Var, 196656 | pvu.f181833d | ((i2 << 6) & 7168), 16);
                xq00Var.m91788r(false);
            } else {
                int i3 = i2;
                xq00Var.m91771i0(-589136326);
                int iOrdinal = lcdVar.ordinal();
                if (iOrdinal == 0) {
                    wwuVar = ytu.f276219c;
                } else if (iOrdinal == 1) {
                    wwuVar = aru.f19145c;
                } else if (iOrdinal == 2) {
                    wwuVar = pvu.f181832c;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wwuVar = kqu.f125437c;
                }
                y85.m93057b(wwuVar, qgjVar, fxh0VarM61834r2, j, 0L, false, xq00Var, 440 | ((i3 << 6) & 7168), 48);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wo6(lcdVar, j, i, 0);
        }
    }
}
