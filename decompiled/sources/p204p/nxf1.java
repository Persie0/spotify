package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import com.spotify.music.SpotifyApplication;
import com.spotify.playbacknative.AudioDriver;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nxf1 {

    /* JADX INFO: renamed from: a */
    public static final l06 f159463a = new l06("ResolutionAnchorProvider", 7);

    /* JADX INFO: renamed from: b */
    public static sd40 f159464b;

    /* JADX INFO: renamed from: c */
    public static sd40 f159465c;

    /* JADX INFO: renamed from: a */
    public static final void m65822a(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        Object obj;
        xq00Var.m91775k0(-993719678);
        int i3 = (xq00Var.m91762e(i) ? 4 : 2) | i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            long jM32713k = cgg1.m32713k(R.color.crop_image_overlay, xq00Var);
            long jM32713k2 = cgg1.m32713k(android.R.color.transparent, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            Object obj2 = t6x0.f217647t;
            if (objM91750T == obj2) {
                obj = objM91750T;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColor(rfg1.m75429D(jM32713k));
                float f = i;
                canvas.drawRect(0.0f, 0.0f, f, f, paint);
                paint.setColor(rfg1.m75429D(jM32713k2));
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f2 = f / 2.0f;
                canvas.drawCircle(f2, f2, f2, paint);
                xq00Var.m91793t0(bitmapCreateBitmap);
                obj = bitmapCreateBitmap;
            }
            obj = objM91750T;
            Object obj3 = (Bitmap) obj;
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM75069q = r9g1.m75069q(mi21.m61820d(1.0f, epv0.m39673I("circular_overlay", fxh0Var2)));
            boolean zM91770i = xq00Var.m91770i(obj3);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj2) {
                objM91750T2 = new rqc(obj3, 12);
                xq00Var.m91793t0(objM91750T2);
            }
            xud.m92135b(0, (gh00) objM91750T2, xq00Var, fxh0VarM75069q);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2351ru(i, fxh0Var2, i2, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX INFO: renamed from: b */
    public static final void m65823b(float f, int i, int i2, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        float f2;
        xq00Var.m91775k0(1391546170);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && xq00Var.m91760d(f)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var.m91761d0();
            float f3 = Float.NaN;
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f2 = Float.NaN;
                }
                xq00Var.m91790s();
                float f4 = 192;
                if (!m65840s(xq00Var)) {
                    f3 = AdvertisementType.BRANDED_DURING_LIVE;
                } else if (!ybs.m93301b(f2, 0)) {
                    f3 = f2;
                }
                iyg1.m51914a(mi21.m61825i(fxh0Var, f4, f3), null, fyfVar, xq00Var, (i3 << 3) & 7168, 6);
            } else {
                xq00Var.m91757b0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            f2 = f;
            xq00Var.m91790s();
            float f5 = 192;
            if (!m65840s(xq00Var)) {
                f3 = AdvertisementType.BRANDED_DURING_LIVE;
            } else if (!ybs.m93301b(f2, 0)) {
                f3 = f2;
            }
            iyg1.m51914a(mi21.m61825i(fxh0Var, f5, f3), null, fyfVar, xq00Var, (i3 << 3) & 7168, 6);
        } else {
            xq00Var.m91757b0();
            f2 = f;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ha6(f2, i, i2, fyfVar, fxh0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m65824c(String str, String str2, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(205712640);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var2) ? 2048 : 1024) | 24576;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strM54977L = k0e1.m54977L(R.string.listening_party_chat_profile_sheet_report, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.listening_party_chat_profile_sheet_report_action_label, xq00Var);
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                if (str2 == null || (objM91750T = Uri.parse(str2)) == null) {
                    objM91750T = Uri.EMPTY;
                }
                xq00Var.m91793t0(objM91750T);
            }
            dgu.m35938b(eh00Var2, null, null, false, false, 0.0f, false, Boolean.TRUE, false, false, null, rkk.m75772x(-1483301471, new h81(strM54977L2, eh00Var, (Uri) objM91750T, str, strM54977L), xq00Var), xq00Var, ((i2 >> 9) & 14) | 113246208, 48, 1662);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pin0(str, str2, eh00Var, eh00Var2, fxh0Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final waw0 m65825d(buh0 buh0Var) {
        return buh0Var.equals(pth0.f181156a) ? taw0.f218707a : vaw0.f239337a;
    }

    /* JADX INFO: renamed from: e */
    public static final ysk m65826e(C2401t5 c2401t5) {
        return new ysk(c2401t5, 24);
    }

    /* JADX INFO: renamed from: f */
    public static final yab m65827f(th00 th00Var) {
        return new yab(th00Var, dau.f47107a, -2, 1);
    }

    /* JADX INFO: renamed from: g */
    public static final fnc m65828g(th00 th00Var) {
        return new fnc(th00Var, dau.f47107a, -2, 1);
    }

    /* JADX INFO: renamed from: h */
    public static int m65829h(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long jM46312g0 = h0b1.m46312g0(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (jM46312g0 > 0 && jM46312g0 <= 2147483647L) {
                return (int) jM46312g0;
            }
        }
        return -2147483647;
    }

    /* JADX INFO: renamed from: i */
    public static final eh00 m65830i(b250 b250Var) {
        x150 x150Var = (x150) b250Var.mo27941a(cve0.f42391N0);
        if (x150Var != null) {
            return x150Var.f257067b;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static son m65831j(SpotifyApplication spotifyApplication) {
        spotifyApplication.getClass();
        return new son(spotifyApplication);
    }

    /* JADX INFO: renamed from: k */
    public static final Set m65832k(w7w0 w7w0Var) {
        Set set = w7w0Var.f248809b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((fyy) obj).f74868d) {
                arrayList.add(obj);
            }
        }
        return g6f.m43736n1(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static final nzx0 m65833l(th00 th00Var) {
        return new nzx0(th00Var);
    }

    /* JADX INFO: renamed from: m */
    public static final ysk m65834m(Object obj) {
        return new ysk(obj, 27);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m65835n(rha rhaVar, xq00 xq00Var) {
        float fM75510d = rhaVar.m75510d();
        gfp gfpVar = leu.f132721a;
        if (ybs.m93300a(fM75510d / gfpVar.m44637c().f164906a, 192) < 0 || rhaVar.m75510d() / AdvertisementType.BRANDED_DURING_LIVE >= gfpVar.m44637c().f164906a) {
            xq00Var.m91771i0(1885159374);
            xq00Var.m91788r(false);
            return false;
        }
        xq00Var.m91771i0(-1878851097);
        boolean z = !m65840s(xq00Var);
        xq00Var.m91788r(false);
        return z;
    }

    /* JADX INFO: renamed from: o */
    public static final float m65836o(int i, xq00 xq00Var) {
        return ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35987O0(i);
    }

    /* JADX INFO: renamed from: p */
    public static final List m65837p(ezx0 ezx0Var) {
        int iM93894l = yjf1.m93894l(ezx0Var, "id");
        int iM93894l2 = yjf1.m93894l(ezx0Var, "seq");
        int iM93894l3 = yjf1.m93894l(ezx0Var, "from");
        int iM93894l4 = yjf1.m93894l(ezx0Var, "to");
        ro80 ro80VarM44508o = geg1.m44508o();
        while (ezx0Var.mo24841E1()) {
            ro80VarM44508o.add(new h300((int) ezx0Var.getLong(iM93894l), ezx0Var.mo24844h1(iM93894l3), (int) ezx0Var.getLong(iM93894l2), ezx0Var.mo24844h1(iM93894l4)));
        }
        return g6f.m43710X0(geg1.m44506m(ro80VarM44508o));
    }

    /* JADX INFO: renamed from: q */
    public static final go61 m65838q(yyx0 yyx0Var, String str, boolean z) {
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM93894l = yjf1.m93894l(ezx0VarMo63454G1, "seqno");
            int iM93894l2 = yjf1.m93894l(ezx0VarMo63454G1, "cid");
            int iM93894l3 = yjf1.m93894l(ezx0VarMo63454G1, "name");
            int iM93894l4 = yjf1.m93894l(ezx0VarMo63454G1, "desc");
            if (iM93894l != -1 && iM93894l2 != -1 && iM93894l3 != -1 && iM93894l4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (ezx0VarMo63454G1.mo24841E1()) {
                    if (((int) ezx0VarMo63454G1.getLong(iM93894l2)) >= 0) {
                        int i = (int) ezx0VarMo63454G1.getLong(iM93894l);
                        String strMo24844h1 = ezx0VarMo63454G1.mo24844h1(iM93894l3);
                        String str2 = ezx0VarMo63454G1.getLong(iM93894l4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strMo24844h1);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listM43711Y0 = g6f.m43711Y0(linkedHashMap.entrySet(), new btm0(23));
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM43711Y0, 10));
                Iterator it = listM43711Y0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listM43728j1 = g6f.m43728j1(arrayList);
                List listM43711Y1 = g6f.m43711Y0(linkedHashMap2.entrySet(), new btm0(24));
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM43711Y1, 10));
                Iterator it2 = listM43711Y1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                go61 go61Var = new go61(str, z, listM43728j1, g6f.m43728j1(arrayList2));
                mif1.m61875i(ezx0VarMo63454G1, null);
                return go61Var;
            }
            mif1.m61875i(ezx0VarMo63454G1, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mif1.m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m65839r(xq00 xq00Var) {
        return (e0b1.m37490b((Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b)) || (((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).orientation == 2)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m65840s(xq00 xq00Var) {
        xq00Var.m91771i0(-1772545495);
        boolean zM37490b = e0b1.m37490b((Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b));
        EnumC1976ie enumC1976ieM53044a = AbstractC2124me.m61534c(xq00Var).m53044a();
        boolean z = true;
        if (zM37490b) {
            xq00Var.m91771i0(720687737);
            switch (enumC1976ieM53044a.ordinal()) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    z = false;
                    break;
            }
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(720331733);
            boolean z2 = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).orientation == 2;
            int iOrdinal = enumC1976ieM53044a.ordinal();
            z = (iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 8) && !z2;
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return z;
    }

    /* JADX INFO: renamed from: t */
    public static Next m65841t(yuf0 yuf0Var, dpf0 dpf0Var) {
        csh0 csh0Var = yuf0Var.f276363d;
        Object obj = null;
        bsh0 bsh0Var = csh0Var instanceof bsh0 ? (bsh0) csh0Var : null;
        if (bsh0Var == null) {
            return Next.m15608j();
        }
        List list = bsh0Var.f30331c;
        mky mkyVar = (mky) g6f.m43747t0(dpf0Var.f51321a, list);
        if (mkyVar == null) {
            return Next.m15608j();
        }
        String str = mkyVar.f144708b;
        nmf0 nmf0Var = new nmf0(bsh0Var.f30329a, list, bsh0Var.f30330b, str);
        b791 b791Var = mkyVar.f144709c;
        for (Object obj2 : yuf0Var.f276351X) {
            if (((mky) obj2).f144710d) {
                obj = obj2;
                break;
            }
        }
        mky mkyVar2 = (mky) obj;
        boolean zEquals = str.equals((!yuf0Var.f276339L0 || mkyVar2 == null) ? "core" : mkyVar2.f144708b);
        ash0 ash0Var = ash0.f19458a;
        return l6l.m58366o(l6l.m58376y(Next.m15607i(zEquals ? yuf0.m94655c(yuf0Var, ash0Var, null, null, b791Var, null, null, null, null, null, null, b791Var, null, null, null, e2r0.f55505a, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -2228297, AudioDriver.SPOTIFY_MAX_VOLUME) : yuf0.m94655c(yuf0Var, ash0Var, null, null, null, null, null, null, null, null, b791Var, b791Var, null, null, null, f2r0.f65259a, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -2293769, AudioDriver.SPOTIFY_MAX_VOLUME), Collections.singleton(nmf0Var))), 3);
    }

    /* JADX INFO: renamed from: u */
    public static final siv0 m65842u(View view) {
        return m65843v(view, new int[2]);
    }

    /* JADX INFO: renamed from: v */
    public static final siv0 m65843v(View view, int[] iArr) {
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        return new siv0(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    /* JADX INFO: renamed from: w */
    public static int m65844w(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
