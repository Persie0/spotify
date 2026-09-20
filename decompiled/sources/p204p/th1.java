package p204p;

import android.os.Trace;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class th1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f220300a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f220301b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f220302c = {24000, 22050, pxb.AUDIO_CONTENT_SAMPLING_RATE};

    /* JADX INFO: renamed from: d */
    public static final int[] f220303d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f220304e = {32, 40, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f220305f = {69, 87, 104, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: g */
    public static sd40 f220306g;

    /* JADX INFO: renamed from: a */
    public static final void m80799a(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        eh00 eh00Var3;
        xq00 xq00Var2;
        xq00Var.m91775k0(-161112089);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var2) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.media_picker_camera_permission_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.media_picker_camera_permission_message, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.media_picker_camera_permission_go_to_settings, xq00Var);
            String strM54977L4 = k0e1.m54977L(R.string.media_picker_camera_permission_go_to_settings, xq00Var);
            if (wl51.m88460J0(strM54977L4)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            gku gkuVar = new gku(strM54977L3, new peu(new t40(strM54977L4), eh00Var));
            String strM54977L5 = k0e1.m54977L(R.string.media_picker_camera_permission_cancel, xq00Var);
            String strM54977L6 = k0e1.m54977L(R.string.media_picker_camera_permission_cancel, xq00Var);
            if (wl51.m88460J0(strM54977L6)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            eh00Var3 = eh00Var2;
            xq00Var2 = xq00Var;
            kku.m56741a(eh00Var3, null, null, strM54977L, strM54977L2, gkuVar, new gku(strM54977L5, new peu(new t40(strM54977L6), eh00Var2)), xq00Var2, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            eh00Var3 = eh00Var2;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igb(eh00Var, eh00Var3, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m80800b(eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        eh00 eh00Var3;
        xq00 xq00Var2;
        xq00Var.m91775k0(-2142073124);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var2) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.media_picker_camera_permission_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.media_picker_camera_permission_message, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.media_picker_camera_permission_give_access, xq00Var);
            String strM54977L4 = k0e1.m54977L(R.string.media_picker_camera_permission_give_access, xq00Var);
            if (wl51.m88460J0(strM54977L4)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            gku gkuVar = new gku(strM54977L3, new peu(new t40(strM54977L4), eh00Var));
            String strM54977L5 = k0e1.m54977L(R.string.media_picker_camera_permission_cancel, xq00Var);
            String strM54977L6 = k0e1.m54977L(R.string.media_picker_camera_permission_cancel, xq00Var);
            if (wl51.m88460J0(strM54977L6)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            eh00Var3 = eh00Var2;
            xq00Var2 = xq00Var;
            kku.m56741a(eh00Var3, null, null, strM54977L, strM54977L2, gkuVar, new gku(strM54977L5, new peu(new t40(strM54977L6), eh00Var2)), xq00Var2, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            eh00Var3 = eh00Var2;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new igb(eh00Var, eh00Var3, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m80801c(boolean z, gh00 gh00Var, eh00 eh00Var, xq00 xq00Var, int i) {
        gh00 gh00Var2;
        xq00 xq00Var2;
        boolean z2 = z;
        eh00 eh00Var2 = eh00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1674587918);
        ug5 ug5Var = xq00Var.f264811a;
        int i2 = i | (xq00Var.m91768h(z2) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61822f(1.0f, cxh0Var), leu.m58816b(xq00Var).f117233e.f137887c, 0.0f, 2);
            WeakHashMap weakHashMap = cxd1.f42984x;
            fxh0 fxh0VarM19r = AbstractC0000a.m19r(bxd1.m30815d(xq00Var).f42991g, 32, fxh0VarM96830A);
            ub9 ub9Var = d7f0.f46145P0;
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM19r);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_skip_title, xq00Var), zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1), leu.m58818d(xq00Var).f64969e, 0L, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2024);
            tix0 tix0Var = new tix0(1);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == ia7Var) {
                objM91750T = new r20(gh00Var, z2, 28);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96830A2 = zsf1.m96830A(bzf1.m31026r(cxh0Var, z2, false, tix0Var, (eh00) objM91750T, 10), 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 1);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29371h(leu.m58816b(xq00Var).f117230b.f224763f, ub9Var), d7f0.f46142M0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM96830A2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(k0e1.m54977L(R.string.chapter_playback_confirmation_mark_previous_finished, xq00Var), new cr70(1.0f, false), leu.m58818d(xq00Var).f64971g, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = ve21.f240584i;
                xq00Var.m91793t0(objM91750T2);
            }
            boolean z4 = false;
            z2 = z;
            gh00Var2 = gh00Var;
            phu.m70050b(z2, gh00Var2, zoz0.m96643a(cxh0Var, (gh00) objM91750T2), null, 0, null, null, xq00Var, i2 & 126, 120);
            xq00Var.m91788r(true);
            fxh0 fxh0VarM96830A3 = zsf1.m96830A(cxh0Var, 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 1);
            tgu tguVar = new tgu(4);
            if ((i2 & 896) == 256) {
                z4 = true;
            }
            Object objM91750T3 = xq00Var.m91750T();
            if (z4 || objM91750T3 == ia7Var) {
                eh00Var2 = eh00Var;
                objM91750T3 = new sp11(3, eh00Var2);
                xq00Var.m91793t0(objM91750T3);
            } else {
                eh00Var2 = eh00Var;
            }
            dyu.m37371c(new peu(u40.f226523c, (eh00) objM91750T3), tguVar, fxh0VarM96830A3, null, null, null, null, null, j9h.f110174a, null, j9h.f110175b, xq00Var, 805306368, 48, 1528);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
        } else {
            gh00Var2 = gh00Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c4v0(z2, gh00Var2, eh00Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final q4k m80802d(Map map, prt0 prt0Var, boolean z, boolean z2) {
        int i;
        boolean z3 = dxf1.m37244s("offline", map) || z;
        boolean zM37213B = dxf1.m37213B(map);
        boolean z4 = prt0Var.f180666a;
        if (z2) {
            i = prt0Var.f180676k.contains(ort0.f168653c) ? 1 : 2;
        } else {
            i = 2;
        }
        return new q4k(null, false, false, false, false, z3, false, null, false, zM37213B, i, false, false, false, false, false, null, false, false, null, false, null, null, null, false, z4, 536867775);
    }

    /* JADX INFO: renamed from: e */
    public static void m80803e(String str) {
        Trace.beginSection(str);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX INFO: renamed from: f */
    public static final z190 m80804f(PlayerState playerState, r9k r9kVar) {
        boolean zM88271j;
        y190 v190Var;
        bv41 bv41Var;
        xul0 xul0VarTrack = playerState.track();
        String str = (String) xul0VarTrack.mo49284i(cx7.f42940k).mo49283h();
        String str2 = (String) xul0VarTrack.mo49284i(cx7.f42939j).mo49283h();
        String strM35710h = null;
        String strM88486j1 = str2 != null ? wl51.m88486j1(str2, ":") : null;
        String strContextUri = playerState.contextUri();
        xul0 xul0VarTrack2 = playerState.track();
        boolean zEquals = r9kVar.equals(new r9k(playerState.contextUri()));
        gf41 gf41Var = r9kVar.f197070a;
        if (zEquals) {
            Set set = dd41.f47702f;
            if (r46.m74709B(gf41Var != null ? gf41Var.toString() : null, gn80.CLIP, gn80.PODCAST_CHAPTER)) {
                ContextTrack contextTrack = (ContextTrack) xul0VarTrack2.mo49283h();
                zM88271j = wj50.m88271j(contextTrack != null ? e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_POINTER_URI) : null, gf41Var != null ? gf41Var.toString() : null);
            } else {
                zM88271j = true;
            }
        } else {
            zM88271j = false;
        }
        he41 he41VarM30579c = bup0.f31192a.m30579c(strContextUri == null ? "" : strContextUri);
        kup0 kup0Var = he41VarM30579c instanceof kup0 ? (kup0) he41VarM30579c : null;
        if (kup0Var != null) {
            String str3 = kup0Var.f126652a;
            try {
                Set set2 = dd41.f47702f;
                strM35710h = r46.m74726U(gf41Var != null ? gf41Var.toString() : null).m35710h();
            } catch (UnsupportedOperationException unused) {
            }
            if (str3.equals(strM35710h) && str != null) {
                v190Var = new x190(str);
            } else if (zM88271j || strM88486j1 == null) {
                v190Var = w190.f247033a;
            } else {
                v190Var = new v190(strM88486j1);
            }
        } else if (zM88271j) {
            v190Var = w190.f247033a;
        } else {
            v190Var = w190.f247033a;
        }
        boolean z = playerState.isPlaying() && !playerState.isPaused();
        boolean zMo49279c = xul0VarTrack.mo49279c();
        if (zM88271j && z && zMo49279c) {
            bv41Var = bv41.f31276c;
        } else {
            bv41Var = (zM88271j && zMo49279c) ? bv41.f31275b : bv41.f31274a;
        }
        return new z190(bv41Var, new r9k(strContextUri), v190Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m80805g() {
        Trace.endSection();
    }

    /* JADX INFO: renamed from: h */
    public static y0p0 m80806h(int i) {
        return (y0p0) y0p0.f268037b.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public static int m80807i(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f220301b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f220305f[i3]) * 2;
        }
        int i5 = f220304e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX INFO: renamed from: j */
    public static final t050 m80808j(z8k z8kVar, njk0 njk0Var, djk0 djk0Var, njk0 njk0Var2, ojk0 ojk0Var) {
        return ((b9k) z8kVar).m28489g("PassthroughAdsDetectorDaemon", new bjk0(njk0Var, djk0Var, njk0Var2, ojk0Var, 10));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m80809k(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m80810l(h74 h74Var) {
        return h74Var.m46754a();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m80811m(wp4 wp4Var) {
        return wp4Var.m88677b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:142:0x0205  */
    /* JADX WARN: Code duplicated, block: B:144:0x0209  */
    /* JADX WARN: Code duplicated, block: B:146:0x0216  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX INFO: renamed from: n */
    public static final kb81 m80812n(ContextTrack contextTrack, int i, Restrictions restrictions, List list, boolean z, boolean z2, ljr0 ljr0Var, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, boolean z7, boolean z8, String str3) {
        String strM38021r;
        boolean zContains;
        boolean zContains2;
        boolean z9;
        boolean zContains3;
        boolean z10;
        boolean z11;
        String strM38008h0 = e72.m38008h0(contextTrack);
        String strUri = contextTrack.uri();
        String strM38012j0 = e72.m38012j0(contextTrack);
        if (strM38012j0 == null) {
            strM38012j0 = "";
        }
        if (str2 != null) {
            strM38021r = str2;
        } else if (e72.m37976J(contextTrack)) {
            strM38021r = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ADVERTISER);
            if (strM38021r == null) {
                strM38021r = "";
            }
        } else if (e72.m37986T(contextTrack)) {
            strM38021r = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ALBUM_TITLE);
            if (strM38021r == null) {
                strM38021r = "";
            }
        } else {
            strM38021r = e72.m38021r(contextTrack);
        }
        String str4 = (!z7 || str3 == null) ? str : str3;
        boolean zM37988V = e72.m37988V(contextTrack);
        boolean zM42184m = fn1.m42184m(contextTrack);
        Set setMo50824f = e72.m37988V(contextTrack) ? ljr0Var.mo50824f() : ljr0Var.mo50823e();
        ort0 ort0Var = zM42184m ? ort0.f168653c : ort0.f168654d;
        boolean zContains4 = setMo50824f.contains(ort0Var);
        zp81 zp81Var = zp81.f285021c;
        if (zContains4 && z) {
            if (!ljr0Var.mo50822d().contains(ort0Var)) {
                zp81Var = zp81.f285022d;
            }
        } else if (!(ljr0Var instanceof jjr0)) {
            zp81Var = ljr0Var instanceof ijr0 ? zp81.f285020b : zp81.f285019a;
        }
        zp81 zp81Var2 = zp81Var;
        boolean zM37988V2 = e72.m37988V(contextTrack);
        boolean zM42184m2 = fn1.m42184m(contextTrack);
        if (z) {
            zContains = (zM37988V2 ? ljr0Var.mo50821c() : ljr0Var.mo50820b()).contains(zM42184m2 ? ort0.f168653c : ort0.f168654d);
        } else {
            zContains = !(ljr0Var instanceof ijr0) && restrictions.disallowRemovingFromNextTracksReasons().isEmpty() && restrictions.disallowSetQueueReasons().isEmpty();
        }
        boolean zM42184m3 = fn1.m42184m(contextTrack);
        if (!z) {
            if ((ljr0Var instanceof jjr0 ? true : ljr0Var.mo50819a().contains(zM42184m3 ? ort0.f168653c : ort0.f168654d)) && restrictions.disallowAddToQueueReasons().isEmpty()) {
                zContains2 = true;
            } else {
                zContains2 = false;
            }
        } else if (wj50.m88271j(ljr0Var.mo50819a(), ort0.f168652b)) {
            zContains2 = false;
        } else {
            zContains2 = ljr0Var.mo50819a().contains(zM42184m3 ? ort0.f168653c : ort0.f168654d);
        }
        boolean z12 = (e72.m37981O(contextTrack) || Boolean.parseBoolean((String) contextTrack.metadata().get("recommendation_icon")) || e72.m37991Y(contextTrack) || Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_EXTERNALLY_INJECTED)) || wj50.m88271j(contextTrack.metadata().get(ContextTrack.Metadata.KEY_PROVIDER), "album/inject_filler_tracks")) || (z3 && !e72.m37980N(contextTrack));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str5 = ((j6y) obj).f109422b;
            String str6 = strM38008h0;
            String str7 = strUri;
            String str8 = (String) contextTrack.metadata().get("queued_by");
            if (str8 == null) {
                str8 = "";
            }
            if (wj50.m88271j(str5, str8)) {
                arrayList.add(obj);
            }
            strM38008h0 = str6;
            strUri = str7;
        }
        String str9 = strM38008h0;
        String str10 = strUri;
        qsj qsjVar = e72.m37982P(contextTrack) ? qsj.f192128b : e72.m37975I(contextTrack) ? qsj.f192127a : qsj.f192130d;
        boolean zM42184m4 = fn1.m42184m(contextTrack);
        if (!z) {
            if (!zM42184m4 || ((ljr0Var instanceof jjr0) && ((jjr0) ljr0Var).f113093s.contains(ort0.f168653c))) {
                zContains3 = true;
            } else if (ljr0Var instanceof ijr0) {
                ijr0 ijr0Var = (ijr0) ljr0Var;
                if (ijr0Var.f102883t.contains(ort0.f168653c)) {
                    z9 = true;
                    if (ijr0Var.f102875l != 1) {
                        zContains3 = true;
                    }
                } else {
                    z9 = true;
                }
                zContains3 = false;
            } else {
                z9 = true;
                zContains3 = false;
            }
            if (z6) {
                z10 = false;
                if (bm51.m29803n0(contextTrack.uri(), "spotify:kallax:", false)) {
                    z11 = z9;
                }
                return new kb81(str9, str10, strM38012j0, strM38021r, str4, i, zM37988V, contextTrack, zp81Var2, zContains, zContains2, z12, z2, zContains3, qsjVar, arrayList, z4, z5, z11, z7, z8);
            }
            z10 = false;
            z11 = z10;
            return new kb81(str9, str10, strM38012j0, strM38021r, str4, i, zM37988V, contextTrack, zp81Var2, zContains, zContains2, z12, z2, zContains3, qsjVar, arrayList, z4, z5, z11, z7, z8);
        }
        if (ljr0Var.mo50825g().isEmpty()) {
            zContains3 = false;
        } else {
            zContains3 = ljr0Var.mo50825g().contains(zM42184m4 ? ort0.f168653c : ort0.f168654d);
        }
        z9 = true;
        if (z6) {
            z10 = false;
            if (bm51.m29803n0(contextTrack.uri(), "spotify:kallax:", false)) {
                z11 = z9;
            }
            return new kb81(str9, str10, strM38012j0, strM38021r, str4, i, zM37988V, contextTrack, zp81Var2, zContains, zContains2, z12, z2, zContains3, qsjVar, arrayList, z4, z5, z11, z7, z8);
        }
        z10 = false;
        z11 = z10;
        return new kb81(str9, str10, strM38012j0, strM38021r, str4, i, zM37988V, contextTrack, zp81Var2, zContains, zContains2, z12, z2, zContains3, qsjVar, arrayList, z4, z5, z11, z7, z8);
    }

    /* JADX INFO: renamed from: p */
    public static final i3y m80814p(f1k f1kVar, Map map, prt0 prt0Var, boolean z, boolean z2) {
        return new i3y(f1k.m40558a(f1kVar, null, new zq2(2, f1kVar, m80802d(map, prt0Var, z, z2)), 479), true);
    }
}
