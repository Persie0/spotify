package p204p;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import com.comscore.streaming.ContentType;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p000.C1636o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g3h1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f76218a;

    /* JADX INFO: renamed from: a */
    public static final void m43490a(String str, peu peuVar, fxh0 fxh0Var, wwu wwuVar, c5k c5kVar, String str2, List list, udu uduVar, long j, long j2, boolean z, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        int i2;
        boolean z2;
        fyf fyfVarM75772x;
        xq00Var.m91775k0(1042935816);
        int i3 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(peuVar) ? 32 : 16) | 3456 | (xq00Var.m91770i(wwuVar) ? 16384 : 8192) | (xq00Var.m91766g(c5kVar) ? 131072 : 65536) | (xq00Var.m91766g(str2) ? 1048576 : 524288) | 104857600 | (xq00Var.m91770i(list) ? 536870912 : 268435456);
        int i4 = (xq00Var.m91768h(z) ? 2048 : 1024) | (xq00Var.m91766g(uduVar) ? 4 : 2) | (xq00Var.m91764f(j) ? 32 : 16) | (xq00Var.m91764f(j2) ? 256 : 128);
        if (xq00Var.m91752Y(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            xq00Var.m91761d0();
            int i5 = i & 1;
            cxh0 cxh0Var = cxh0.f43038a;
            if (i5 == 0 || xq00Var.m91735E()) {
                i2 = i3 & (-29360129);
                fxh0Var2 = cxh0Var;
            } else {
                xq00Var.m91757b0();
                i2 = i3 & (-29360129);
                fxh0Var2 = fxh0Var;
            }
            xq00Var.m91790s();
            boolean zM96337a = zkq0.m96337a(1, list);
            boolean zM50366a = AbstractC2124me.m61533b(xq00Var).m50366a();
            xq00Var.m91771i0(308268917);
            xq00Var.m91788r(false);
            fxh0 fxh0VarM39673I = epv0.m39673I("ContextMenuItem", cxh0Var);
            fyf fyfVar = null;
            boolean zM91766g = ((((i2 & 3670016) ^ 1572864) > 1048576 && xq00Var.m91766g(str2)) || (i2 & 1572864) == 1048576) | xq00Var.m91766g(null);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new ivg(str2, 22);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarMo34315F = zoz0.m96644b(fxh0VarM39673I, true, (gh00) objM91750T).mo34315F(fxh0Var2);
            fyf fyfVar2 = zkq0.m96337a(2, list) ? v9g.f238941a : null;
            fyf fyfVar3 = (zM50366a && zM96337a) ? v9g.f238942b : null;
            if (wwuVar == null) {
                xq00Var.m91771i0(309964183);
                z2 = false;
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            } else {
                z2 = false;
                xq00Var.m91771i0(309964184);
                fyfVarM75772x = rkk.m75772x(1984247505, new sqc(wwuVar, j2, z), xq00Var);
                xq00Var.m91788r(false);
            }
            if (fyfVarM75772x == null) {
                xq00Var.m91771i0(310229327);
                if (c5kVar == null) {
                    xq00Var.m91771i0(310229326);
                    xq00Var.m91788r(z2);
                    fyfVarM75772x = null;
                } else {
                    xq00Var.m91771i0(310229327);
                    fyfVarM75772x = rkk.m75772x(-570774401, new xgg(c5kVar, 21), xq00Var);
                    xq00Var.m91788r(z2);
                }
            } else {
                xq00Var.m91771i0(1534019371);
            }
            xq00Var.m91788r(z2);
            fyf fyfVar4 = fyfVarM75772x;
            if (zM96337a && !zM50366a) {
                fyfVar = v9g.f238943c;
            }
            p711.m69222a(fxh0VarMo34315F, null, uduVar, false, null, null, peuVar, null, fyfVar4, null, fyfVar2, fyfVar3, fyfVar, null, null, rkk.m75772x(971829324, new p5k(str, j, zM96337a, list), xq00Var), xq00Var, ((i4 << 6) & 896) | ((i2 << 15) & 3670016), 196608, 17082);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new q5k(str, peuVar, fxh0Var2, wwuVar, c5kVar, str2, list, uduVar, j, j2, z, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43491b(ArrayList arrayList, e2r e2rVar, String str, String str2, d1n d1nVar, e1n e1nVar, fxh0 fxh0Var, th00 th00Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1514290159);
        int i2 = i | (xq00Var.m91770i(arrayList) ? 4 : 2) | (xq00Var.m91770i(e2rVar) ? 32 : 16) | (xq00Var.m91766g(str) ? 256 : 128) | (xq00Var.m91766g(str2) ? 2048 : 1024) | (xq00Var.m91770i(d1nVar) ? 16384 : 8192) | (xq00Var.m91770i(e1nVar) ? 131072 : 65536) | 1572864 | (xq00Var.m91770i(th00Var) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zMo76359a = AbstractC2124me.m61532a(xq00Var).mo76359a(6);
            cxh0 cxh0Var = cxh0.f43038a;
            iyg1.m51914a(mi21.m61819c(1.0f, cxh0Var), null, rkk.m75772x(-120921639, new du20(str, arrayList, th00Var, e1nVar, d1nVar, zMo76359a, e2rVar, str2), xq00Var), xq00Var, 3072, 6);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1636o(arrayList, e2rVar, str, str2, d1nVar, e1nVar, fxh0Var2, th00Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43492c(int i, String str, String str2, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1168101339);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(fxh0Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            jiu jiuVarM58815a = leu.m58815a(xq00Var);
            m0v m0vVar = leu.m58815a(xq00Var).f112824b;
            fxh0Var2 = fxh0Var;
            qiu.m72878d(jiu.m53470a(jiuVarM58815a, null, new m0v(m0vVar.f138757a, ((hiu) iiu.f102631a.f258040e).f91881l, m0vVar.f138759c, m0vVar.f138760d, m0vVar.f138761e, m0vVar.f138762f, m0vVar.f138763g), 13), rkk.m75772x(-718535775, new gy5(str, str2, eh00Var, fxh0Var2), xq00Var), xq00Var, 48);
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gy5(i, 4, str, str2, eh00Var, fxh0Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m43493d(c5k c5kVar, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(181474619);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(c5kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                LayerDrawable layerDrawable = c5kVar.f34196a.f150572a;
                q94 q94Var = new q94(xtm0.m92066M(layerDrawable, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888));
                xq00Var.m91793t0(q94Var);
                objM91750T = q94Var;
            }
            xq00Var2 = xq00Var;
            l0y0.m57822d((q94) objM91750T, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159605c, cxh0.f43038a), null, null, null, null, null, xq00Var2, 48, 504);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zuh(c5kVar, i, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m43494e(tt20 tt20Var, jt20 jt20Var, int i, xom0 xom0Var, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(1104025005);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? xq00Var.m91766g(tt20Var) : xq00Var.m91770i(tt20Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? xq00Var.m91766g(jt20Var) : xq00Var.m91770i(jt20Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91762e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91770i(xom0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91768h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            boolean zM91770i = (i4 == 32 || ((i3 & 64) != 0 && xq00Var.m91770i(jt20Var))) | ((57344 & i3) == 16384) | xq00Var.m91770i(xom0Var) | ((i3 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new au20(jt20Var, z, xom0Var, i);
                xq00Var.m91793t0(objM91750T);
            }
            mif1.m61869b(tt20Var, jt20Var, l0y0.m57831m(fxh0Var, (gh00) objM91750T), null, xq00Var, (i3 & 14) | 72 | i4, 8);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j69(tt20Var, jt20Var, i, xom0Var, z, fxh0Var, i2, 10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m43495f(nu20 nu20Var, mu20 mu20Var, int i, xom0 xom0Var, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        xq00Var.m91775k0(-1112622471);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? xq00Var.m91766g(nu20Var) : xq00Var.m91770i(nu20Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? xq00Var.m91766g(mu20Var) : xq00Var.m91770i(mu20Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= xq00Var.m91762e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91770i(xom0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91768h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 131072 : 65536;
        }
        int i4 = 0;
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = i == ((vum0) xom0Var.f264315d.f99667c).m86437v();
            int iM33198q = cks.m33198q(leu.m58817c(xq00Var).f235363b.f225041c, ils.MILLISECONDS);
            yzl yzlVar = ((pku) leu.m58817c(xq00Var).f235362a.f197471b).f178551b;
            xq00Var.m91771i0(216676866);
            float fMo35989Z0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35989Z0(leu.m58816b(xq00Var).f117230b.f224761d);
            xq00Var.m91788r(false);
            float f = z2 ? 1.0f : 0.0f;
            if (!z) {
                iM33198q = 0;
            }
            if (z2 && z) {
                i4 = 150;
            }
            rv41 rv41VarM79506b = sw4.m79506b(f, new im91(iM33198q, i4, yzlVar), "shareButton", null, xq00Var, 3072, 20);
            boolean zM91770i = xq00Var.m91770i(rv41VarM79506b) | xq00Var.m91760d(fMo35989Z0);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new xw4(fMo35989Z0, 1, rv41VarM79506b);
                xq00Var.m91793t0(objM91750T);
            }
            mif1.m61869b(nu20Var, mu20Var, l0y0.m57831m(fxh0Var, (gh00) objM91750T), null, xq00Var, (i3 & 14) | 72 | (i3 & ContentType.LONG_FORM_ON_DEMAND), 8);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new j69(nu20Var, mu20Var, i, xom0Var, z, fxh0Var, i2, 11);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m43496g(eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        eh00 eh00Var2;
        xq00Var.m91775k0(887346804);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            c7l0 c7l0VarM35772a = dea0.m35772a(xq00Var);
            if (c7l0VarM35772a == null) {
                xq00Var.m91771i0(-574944016);
                xq00Var.m91788r(false);
                eh00Var2 = null;
            } else {
                xq00Var.m91771i0(-574944015);
                boolean zM91770i = xq00Var.m91770i(c7l0VarM35772a) | ((i2 & 14) == 4);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == t6x0.f217647t) {
                    objM91750T = new e371(11, eh00Var, c7l0VarM35772a);
                    xq00Var.m91793t0(objM91750T);
                }
                eh00Var2 = (eh00) objM91750T;
                xq00Var.m91788r(false);
            }
            if (eh00Var2 != null) {
                xq00Var.m91771i0(-574808731);
                riw0.m75607a(new peu(u40.f226523c, eh00Var2), wgu.f251150c, null, null, vvx.m86515p(xq00Var), null, false, null, null, qdh.f187691b, xq00Var, 0, 6, 988);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-574554066);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eon0(eh00Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m43497h(fyf fyfVar, fyf fyfVar2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(745167015);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fyfVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new egc0(fyfVar, fyfVar2, 2);
                xq00Var.m91793t0(objM91750T);
            }
            pag1.m69469e(fxh0Var, (th00) objM91750T, xq00Var, (i2 >> 6) & 14, 0);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lz11(fyfVar, fyfVar2, fxh0Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final String m43498i(k980 k980Var) {
        if (k980Var instanceof f880) {
            return "albums";
        }
        if (k980Var instanceof i880) {
            return "all_downloaded";
        }
        if (k980Var instanceof l880) {
            return "artists";
        }
        if (k980Var instanceof n880) {
            return "books";
        }
        if (k980Var instanceof x880) {
            return "downloaded";
        }
        if (k980Var instanceof e980) {
            return "playlists";
        }
        if (k980Var instanceof f980) {
            return "podcasts";
        }
        if (k980Var instanceof q880) {
            return "courses";
        }
        if (wj50.m88271j(k980Var, r880.f196735b)) {
            return "downloaded_albums";
        }
        if (wj50.m88271j(k980Var, s880.f206600b)) {
            return "downloaded_artists";
        }
        if (wj50.m88271j(k980Var, v880.f238430b)) {
            return "downloaded_playlists";
        }
        if (wj50.m88271j(k980Var, w880.f248883b)) {
            return "downloaded_podcasts";
        }
        if (wj50.m88271j(k980Var, t880.f218004b)) {
            return "downloaded_books";
        }
        if (wj50.m88271j(k980Var, u880.f227857b)) {
            return "downloaded_courses";
        }
        if (wj50.m88271j(k980Var, p880.f174896b)) {
            return "by_you";
        }
        if (wj50.m88271j(k980Var, o880.f162732b)) {
            return "by_spotify";
        }
        if (wj50.m88271j(k980Var, h880.f88652b)) {
            return "all_by_you";
        }
        if (wj50.m88271j(k980Var, g880.f77435b)) {
            return "all_by_spotify";
        }
        if (k980Var instanceof y880) {
            return "events";
        }
        if (wj50.m88271j(k980Var, h980.f88893b)) {
            return "upcoming";
        }
        if (wj50.m88271j(k980Var, j980.f110118b)) {
            return "venue";
        }
        if (wj50.m88271j(k980Var, d980.f46745b)) {
            return "past";
        }
        if (wj50.m88271j(k980Var, b980.f24800b)) {
            return "in_progress";
        }
        if (wj50.m88271j(k980Var, g980.f77703b)) {
            return "unplayed";
        }
        if (wj50.m88271j(k980Var, m880.f140941b)) {
            return "authors";
        }
        if (wj50.m88271j(k980Var, z880.f280406b)) {
            return "finished";
        }
        if (wj50.m88271j(k980Var, k880.f120269b)) {
            return "all_mixed";
        }
        if (wj50.m88271j(k980Var, c980.f35422b)) {
            return "is_mixed";
        }
        if (wj50.m88271j(k980Var, j880.f109864b)) {
            return "all_folders";
        }
        if (wj50.m88271j(k980Var, a980.f13517b)) {
            return "folders";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j */
    public static final Object m43499j(Flowable flowable, xm2 xm2Var) {
        return s1h1.m76980u(250L, new an2(flowable, null, 0), xm2Var);
    }

    /* JADX INFO: renamed from: k */
    public static final qio m43500k(z4l0 z4l0Var, wa9 wa9Var, x491 x491Var) {
        y0i0 y0i0Var = new y0i0(z4l0Var);
        y0i0Var.f267990c = x491Var;
        if (wa9Var == null) {
            return y0i0Var;
        }
        i2v i2vVar = new i2v(false);
        i2vVar.f97925b = x491Var;
        d3b d3bVar = new d3b();
        d3bVar.f44831a = wa9Var.mo58462a();
        d3bVar.f44835e = y0i0Var;
        d3bVar.f44833c = new ly5(false, 1);
        d3bVar.f44832b = i2vVar;
        if (wa9Var instanceof y99) {
            d3bVar.f44834d = true;
        }
        return d3bVar;
    }

    /* JADX INFO: renamed from: n */
    public static final String m43501n(w601 w601Var) {
        return s571.m77250i(Integer.toHexString(w601Var.f248226c.hashCode()), ".pb");
    }

    /* JADX INFO: renamed from: o */
    public static final t050 m43502o(z8k z8kVar, mjk0 mjk0Var, mjk0 mjk0Var2, mjk0 mjk0Var3) {
        return ((b9k) z8kVar).m28489g("MusicBranchRestrictDataProcessingDaemon", new qik0(mjk0Var, mjk0Var2, mjk0Var3, 14));
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m43503p(Intent intent) {
        List<jud1> list = eud1.f62953a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (jud1 jud1Var : list) {
            if (jud1Var.f116102b) {
                ComponentName component = intent.getComponent();
                if (wj50.m88271j(component != null ? component.getClassName() : null, jud1Var.f116101a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static void m43504q(PlayOrigin playOrigin) {
        String strReferrerIdentifier;
        String strFeatureIdentifier = playOrigin.featureIdentifier();
        if (strFeatureIdentifier == null || strFeatureIdentifier.length() == 0 || (strReferrerIdentifier = playOrigin.referrerIdentifier()) == null || strReferrerIdentifier.length() == 0) {
            String strFeatureIdentifier2 = playOrigin.featureIdentifier();
            if (strFeatureIdentifier2 == null) {
                strFeatureIdentifier2 = "";
            }
            String strReferrerIdentifier2 = playOrigin.referrerIdentifier();
            if (strReferrerIdentifier2 == null) {
                strReferrerIdentifier2 = "";
            }
            String strViewUri = playOrigin.viewUri();
            String str = strViewUri != null ? strViewUri : "";
            StringBuilder sbM38573v = edb.m38573v("Missing PlayOrigin fields:\nfeatureIdentifier=", strFeatureIdentifier2, ", \nreferrerIdentifier=", strReferrerIdentifier2, ", \nviewUri=");
            sbM38573v.append(str);
            na6.m63969q(new IllegalStateException(sbM38573v.toString()));
        }
    }

    /* JADX INFO: renamed from: r */
    public static final String m43505r(buh0 buh0Var) {
        if (buh0Var instanceof pth0) {
            return "auth";
        }
        if (buh0Var instanceof xth0) {
            return "unauth";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: s */
    public static final j2a1 m43506s() {
        return new j2a1();
    }

    /* JADX INFO: renamed from: l */
    public j6f0 m43507l(e7f0 e7f0Var) {
        ByteBuffer byteBuffer = e7f0Var.f105018d;
        byteBuffer.getClass();
        c95.m31843i(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo37892m(e7f0Var, byteBuffer);
    }

    /* JADX INFO: renamed from: m */
    public abstract j6f0 mo37892m(e7f0 e7f0Var, ByteBuffer byteBuffer);
}
