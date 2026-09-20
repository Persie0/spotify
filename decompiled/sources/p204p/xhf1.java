package p204p;

import android.graphics.Bitmap;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.util.Base64;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.music.R;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xhf1 {

    /* JADX INFO: renamed from: a */
    public static final C2109m f261569a = new C2109m(21);

    /* JADX INFO: renamed from: b */
    public static sd40 f261570b;

    /* JADX INFO: renamed from: c */
    public static sd40 f261571c;

    /* JADX INFO: renamed from: a */
    public static final void m90970a(rc5 rc5Var, eh00 eh00Var, xq00 xq00Var, int i) {
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-67177354);
        int i2 = (xq00Var.m91766g(rc5Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            ((kv91) rc5Var.f197733c.getValue()).mo57449i(rc5Var.f197732b.mo24514e(), null);
            String strM54977L = k0e1.m54977L(R.string.app_outdated_dialog_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.app_outdated_dialog_body, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.app_outdated_dialog_button, xq00Var);
            boolean z = (i2 & 14) == 4;
            int i3 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            boolean z2 = z | (i3 == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == ia7Var) {
                objM91750T = new zq2(17, rc5Var, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            gku gkuVar = new gku(strM54977L3, new peu(u40.f226523c, (eh00) objM91750T));
            boolean z3 = i3 == 32;
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == ia7Var) {
                objM91750T2 = new as2(3, eh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            kku.m56741a((eh00) objM91750T2, null, null, strM54977L, strM54977L2, gkuVar, null, xq00Var, 262144, 70);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2359s1(rc5Var, eh00Var, i, 28);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m90971b(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-623511034);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61826j = mi21.m61826j(mi21.m61822f(1.0f, cxh0Var), 65, 0.0f, 2);
            wb9 wb9Var = d7f0.f46174i;
            float f = leu.m58816b(xq00Var).f117230b.f224761d;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            vju vjuVar = vju.f242057e;
            if (wl51.m88460J0("Install on other device")) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            zn91.m96545d(fxh0VarM61826j, wb9Var, null, vjuVar, j4m0Var, null, false, null, null, new peu(new t40("Install on other device"), eh00Var), null, cbg.f36119a, xq00Var, 3120, 48, 1508);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ra1(eh00Var, fxh0Var2, i, 13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m90972c(int i, int i2, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1649485091);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 3) != 2)) {
            fxh0 fxh0Var3 = i4 != 0 ? cxh0.f43038a : fxh0Var;
            p711.m69222a(mi21.m61822f(1.0f, fxh0Var3), new kyu(null, 3, null, null, 26), null, false, null, null, null, null, null, hqg.f94175a, null, hqg.f94176b, null, null, null, hqg.f94177c, xq00Var, 805306432, 196656, 30204);
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2351ru(fxh0Var2, i, i2, 27);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m90973d(float f, float f2, float f3, xq00 xq00Var, int i, int i2) {
        int i3;
        float f4;
        float f5;
        xq00Var.m91775k0(503272076);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f4 = f3;
                int i4 = xq00Var.m91760d(f4) ? 256 : 128;
                i3 |= i4;
            } else {
                f4 = f3;
            }
            i3 |= i4;
        } else {
            f4 = f3;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                if ((i2 & 4) != 0) {
                    f5 = 0;
                }
                xq00Var.m91790s();
                dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f5, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
                f4 = f5;
            } else {
                xq00Var.m91757b0();
                int i5 = i2 & 4;
            }
            f5 = f4;
            xq00Var.m91790s();
            dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f5, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
            f4 = f5;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tsx(f, f2, f4, i, i2, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m90974e(LockedBadgeView lockedBadgeView, EnhancedBadgeView enhancedBadgeView, ContentRestrictionBadgeView contentRestrictionBadgeView, PremiumBadgeView premiumBadgeView, DownloadBadgeView downloadBadgeView) {
        List listM46715L = h6f.m46715L(lockedBadgeView, enhancedBadgeView, contentRestrictionBadgeView, downloadBadgeView, premiumBadgeView);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM46715L) {
            if (((AppCompatImageView) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = g6f.m43729k0(arrayList, 3).iterator();
        while (it.hasNext()) {
            ((AppCompatImageView) it.next()).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m90975f(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j8d0 j8d0Var = (j8d0) it.next();
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(j8d0Var.f109906a, j8d0Var.f109907b, j8d0Var.f109908c, null, null, j8d0Var.f109910e, j8d0Var.f109911f, j8d0Var.f109909d);
            int i = SpotifyMediaBrowserService.f5443M0;
            int i2 = j8d0Var.f109912g;
            int i3 = (i2 & 1) != 0 ? 1 : 0;
            if ((i2 & 2) != 0) {
                i3 |= 2;
            }
            arrayList.add(new MediaBrowserCompat$MediaItem(mediaDescriptionCompat, i3));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static xag0 m90976g(Integer num, st91 st91Var) {
        return new xag0(num, st91Var);
    }

    /* JADX INFO: renamed from: h */
    public static void m90977h(ArrayList arrayList, SpannableString spannableString, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannableString);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannableString, iStart, iEnd)) && strGroup != null) {
                un80 un80Var = new un80();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    String str = strArr[i];
                    if (strGroup.regionMatches(true, 0, str, 0, str.length())) {
                        z = true;
                        if (!strGroup.regionMatches(false, 0, str, 0, str.length())) {
                            StringBuilder sbM36620t = dq60.m36620t(str);
                            sbM36620t.append(strGroup.substring(str.length()));
                            strGroup = sbM36620t.toString();
                            break;
                        }
                        break;
                    }
                    i++;
                }
                if (!z && strArr.length > 0) {
                    strGroup = dq60.m36616p(strArr[0], strGroup, new StringBuilder());
                }
                un80Var.f232094b = strGroup;
                un80Var.f232095c = iStart;
                un80Var.f232096d = iEnd;
                arrayList.add(un80Var);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final PublicKey m90978i(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(bm51.m29801l0(bm51.m29801l0(bm51.m29801l0(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0)));
    }

    /* JADX INFO: renamed from: j */
    public static final String m90979j(String str) {
        URL url = new URL(pka1.f178421b, "www." + p8y.f175098s, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        rlv0 rlv0Var = new rlv0();
        p8y.m69345c().execute(new k39(url, rlv0Var, str, reentrantLock, conditionNewCondition, 4));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) rlv0Var.f200373a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final View m90980l(w0n w0nVar, int i) {
        ViewStub viewStub = (ViewStub) w0nVar.f246768b;
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    /* JADX INFO: renamed from: m */
    public static final void m90981m(w0n w0nVar, e940 e940Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) w0nVar.f246767a;
        nap.m64024q(-1, -2, constraintLayout);
        ArtworkView artworkView = (ArtworkView) w0nVar.f246770d;
        artworkView.setViewContext(new r96(e940Var));
        ((QuickActionView) w0nVar.f246757L0).setViewContext(new lut0(constraintLayout.getContext(), e940Var));
        q3r0 q3r0VarM26334q = alf1.m26334q(constraintLayout);
        Collections.addAll(q3r0VarM26334q.f184932c, (TextView) w0nVar.f246762Q0, (TextView) w0nVar.f246761P0);
        Collections.addAll(q3r0VarM26334q.f184933d, artworkView);
        q3r0VarM26334q.f184934e = false;
        q3r0VarM26334q.m72126a();
    }

    /* JADX INFO: renamed from: n */
    public static final void m90982n(w0n w0nVar, boolean z) {
        ((ArtworkView) w0nVar.f246770d).setEnabled(z);
        ((TextView) w0nVar.f246762Q0).setEnabled(z);
        ((TextView) w0nVar.f246761P0).setEnabled(z);
        ((LockedBadgeView) w0nVar.f246775i).setEnabled(z);
        ((EnhancedBadgeView) w0nVar.f246772f).setEnabled(z);
        ((DownloadBadgeView) w0nVar.f246771e).setEnabled(z);
        ((ContentRestrictionBadgeView) w0nVar.f246758M0).setEnabled(z);
        ((PremiumBadgeView) w0nVar.f246764X).setEnabled(z);
    }

    /* JADX INFO: renamed from: o */
    public static final void m90983o(w0n w0nVar, int i) {
        Guideline guideline = (Guideline) w0nVar.f246773g;
        h6j h6jVar = (h6j) guideline.getLayoutParams();
        h6jVar.f88131b = i;
        guideline.setLayoutParams(h6jVar);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m90984p(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes(vuc.f244913a));
            return signature.verify(Base64.decode(str2, 8));
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m90985q(Bitmap bitmap, File file) {
        Object c6x0Var;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (bitmap.isRecycled()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                c6x0Var = Boolean.valueOf(zCompress);
                Throwable thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a != null) {
                    Logger.m3967c(thM77348a, "Couldn't write image to file \"%s\".", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            c6x0Var = new c6x0(th3);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract rza mo90987k();
}
