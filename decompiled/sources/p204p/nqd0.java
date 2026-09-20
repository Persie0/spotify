package p204p;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class nqd0 implements snd0 {

    /* JADX INFO: renamed from: c */
    public Uri f157234c;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ pqd0 f157236e;

    /* JADX INFO: renamed from: a */
    public phd0 f157232a = phd0.f177558M;

    /* JADX INFO: renamed from: b */
    public String f157233b = "";

    /* JADX INFO: renamed from: d */
    public long f157235d = -9223372036854775807L;

    public nqd0(pqd0 pqd0Var) {
        this.f157236e = pqd0Var;
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: b */
    public final void mo51505b(int i, n201 n201Var, boolean z, boolean z2, int i2) {
        pqd0 pqd0Var = this.f157236e;
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pqd0Var.m70646n(rpd0Var.f201560t);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: c */
    public final void mo51506c(int i, PendingIntent pendingIntent) {
        this.f157236e.f180275j.setSessionActivity(pendingIntent);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: e */
    public final void mo51508e(int i, List list) {
        pqd0 pqd0Var = this.f157236e;
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pqd0Var.m70646n(rpd0Var.f201560t);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: g */
    public final void mo51510g(int i, h001 h001Var) {
        pqd0 pqd0Var = this.f157236e;
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pdp0 pdp0Var = rpd0Var.f201560t;
        pqd0Var.f180283r = new h9p(false, x280.m89721c(h001Var.f86093a), h001Var.f86094b, h001Var.f86095c);
        MediaSessionCompat mediaSessionCompat = pqd0Var.f180275j;
        mediaSessionCompat.setPlaybackState(pqd0Var.m70635b(pdp0Var));
        pqd0Var.f180283r = null;
        mediaSessionCompat.setPlaybackState(pqd0Var.m70635b(pdp0Var));
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: j */
    public final void mo51513j(int i, mxz0 mxz0Var) {
        Bundle bundle = mxz0Var.f148235c;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        this.f157236e.f180275j.sendSessionEvent(mxz0Var.f148234b, bundle);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: k */
    public final void mo51514k(int i, Bundle bundle) {
        c95.m31843i(!bundle.containsKey("EXO_SPEED"));
        c95.m31843i(!bundle.containsKey(MediaConstants.PLAYBACK_STATE_EXTRAS_KEY_MEDIA_ID));
        Bundle bundle2 = new Bundle(bundle);
        pqd0 pqd0Var = this.f157236e;
        pqd0Var.f180284s = bundle2;
        if (!pqd0Var.f180286u.isEmpty()) {
            pqd0Var.m70644l();
        }
        pqd0Var.f180275j.setExtras(pqd0Var.f180284s);
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pqd0Var.m70646n(rpd0Var.f201560t);
    }

    @Override // p204p.snd0
    /* JADX INFO: renamed from: l */
    public final void mo51515l(int i, b7p0 b7p0Var) {
        pqd0 pqd0Var = this.f157236e;
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pdp0 pdp0Var = rpd0Var.f201560t;
        int i2 = pdp0Var.mo43865W(20) ? 4 : 0;
        if (pqd0Var.f180282q != i2) {
            pqd0Var.f180282q = i2;
            pqd0Var.f180275j.setFlags(i2);
        }
        pqd0Var.m70646n(pdp0Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m65405p() {
        int i;
        kqd0 kqd0Var;
        pqd0 pqd0Var = this.f157236e;
        MediaSessionCompat mediaSessionCompat = pqd0Var.f180275j;
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pdp0 pdp0Var = rpd0Var.f201560t;
        if (pdp0Var.mo43896m().f258729a == 0) {
            kqd0Var = null;
        } else {
            b7p0 b7p0VarMo43895l0 = pdp0Var.mo43895l0();
            if (b7p0VarMo43895l0.f24368a.m56305a(26, 34)) {
                i = b7p0VarMo43895l0.f24368a.m56305a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(pdp0Var.f176532a.mo43878c0());
            int iMo43887h0 = pdp0Var.mo43865W(23) ? pdp0Var.mo43887h0() : 0;
            x6r x6rVarMo43896m = pdp0Var.mo43896m();
            kqd0Var = new kqd0(i, x6rVarMo43896m.f258731c, iMo43887h0, x6rVarMo43896m.f258732d, handler, pdp0Var);
        }
        pqd0Var.f180278m = kqd0Var;
        if (kqd0Var == null) {
            mediaSessionCompat.setPlaybackToLocal(pdp0Var.mo43865W(21) ? pdp0Var.mo43912v0() : xs6.f265509i);
        } else {
            mediaSessionCompat.setPlaybackToRemote(kqd0Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m65406q(ufd0 ufd0Var) {
        pqd0 pqd0Var = this.f157236e;
        MediaSessionCompat mediaSessionCompat = pqd0Var.f180275j;
        m65412w();
        if (ufd0Var == null) {
            mediaSessionCompat.setRatingType(0);
        } else {
            mediaSessionCompat.setRatingType(x280.m89728j(ufd0Var.f229765d.f177615i));
        }
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pqd0Var.m70646n(rpd0Var.f201560t);
    }

    /* JADX INFO: renamed from: r */
    public final void m65407r(int i, pdp0 pdp0Var) throws Throwable {
        m65411v(pdp0Var.m69696e1());
        m65408s(pdp0Var.mo43865W(18) ? pdp0Var.mo43846L0() : phd0.f177558M);
        pdp0Var.m69697f1();
        m65412w();
        m65410u(pdp0Var.mo43857R0());
        m65409t(pdp0Var.getRepeatMode());
        pdp0Var.mo43896m();
        m65405p();
        int i2 = pdp0Var.mo43865W(20) ? 4 : 0;
        pqd0 pqd0Var = this.f157236e;
        if (pqd0Var.f180282q != i2) {
            pqd0Var.f180282q = i2;
            pqd0Var.f180275j.setFlags(i2);
        }
        m65406q(pdp0Var.m69695d1());
    }

    /* JADX INFO: renamed from: s */
    public final void m65408s(phd0 phd0Var) {
        pqd0 pqd0Var = this.f157236e;
        MediaSessionCompat mediaSessionCompat = pqd0Var.f180275j;
        CharSequence queueTitle = mediaSessionCompat.getController().getQueueTitle();
        CharSequence charSequence = phd0Var.f177607a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        if (!pqd0Var.m70640h()) {
            charSequence = null;
        }
        mediaSessionCompat.setQueueTitle(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r2
      0x0026: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:5:0x000a, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t */
    public final void m65409t(int i) {
        MediaSessionCompat mediaSessionCompat = this.f157236e.f180275j;
        int i2 = x280.f257392a;
        int i3 = 0;
        if (i != 0) {
            int i4 = 1;
            if (i != 1) {
                i4 = 2;
                if (i != 2) {
                    yif1.m93819w0("Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i3 = i4;
                }
            } else {
                i3 = i4;
            }
        }
        mediaSessionCompat.setRepeatMode(i3);
    }

    /* JADX INFO: renamed from: u */
    public final void m65410u(boolean z) {
        MediaSessionCompat mediaSessionCompat = this.f157236e.f180275j;
        int i = x280.f257392a;
        mediaSessionCompat.setShuffleMode(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: v */
    public final void m65411v(qp71 qp71Var) throws Throwable {
        m65413x(qp71Var);
        m65412w();
    }

    /* JADX INFO: renamed from: w */
    public final void m65412w() {
        long j;
        Uri uri;
        phd0 phd0Var;
        Uri uri2;
        pqd0 pqd0Var = this.f157236e;
        rpd0 rpd0Var = pqd0Var.f180269d;
        rpd0Var.m76119E();
        pdp0 pdp0Var = rpd0Var.f201560t;
        ufd0 ufd0VarM69695d1 = pdp0Var.m69695d1();
        phd0 phd0VarM69697f1 = pdp0Var.m69697f1();
        long duration = -9223372036854775807L;
        if ((!pdp0Var.mo43865W(16) || !pdp0Var.mo43874a1()) && pdp0Var.mo43865W(16)) {
            duration = pdp0Var.getDuration();
        }
        String str = ufd0VarM69695d1 != null ? ufd0VarM69695d1.f229762a : "";
        Bitmap bitmap = null;
        Uri uri3 = (ufd0VarM69695d1 == null || (uri2 = ufd0VarM69695d1.f229767f.f177036a) == null) ? null : uri2;
        if (Objects.equals(this.f157232a, phd0VarM69697f1) && Objects.equals(this.f157233b, str) && Objects.equals(this.f157234c, uri3) && this.f157235d == duration) {
            return;
        }
        this.f157233b = str;
        this.f157234c = uri3;
        this.f157232a = phd0VarM69697f1;
        this.f157235d = duration;
        u790 u790VarMo60773g = rpd0Var.f201553m.mo60773g(phd0VarM69697f1);
        if (u790VarMo60773g != null) {
            pqd0Var.f180281p = null;
            if (u790VarMo60773g.isDone()) {
                try {
                    bitmap = (Bitmap) vgg1.m85481v(u790VarMo60773g);
                } catch (CancellationException | ExecutionException e) {
                    yif1.m93819w0("Failed to load bitmap: " + e.getMessage());
                }
                j = duration;
                uri = uri3;
                phd0Var = phd0VarM69697f1;
            } else {
                j = duration;
                uri = uri3;
                phd0Var = phd0VarM69697f1;
                pte pteVar = new pte(this, phd0Var, str, uri, j);
                str = str;
                pqd0Var.f180281p = pteVar;
                Handler handler = rpd0Var.f201552l;
                Objects.requireNonNull(handler);
                u790VarMo60773g.mo28322a(new lk00(22, u790VarMo60773g, pteVar), new xgi(handler, 0));
            }
        } else {
            j = duration;
            uri = uri3;
            phd0Var = phd0VarM69697f1;
        }
        pqd0Var.f180275j.setMetadata(x280.m89724f(phd0Var, str, uri, j, bitmap));
    }

    /* JADX INFO: renamed from: x */
    public final void m65413x(qp71 qp71Var) throws Throwable {
        pqd0 pqd0Var = this.f157236e;
        rpd0 rpd0Var = pqd0Var.f180269d;
        if (!pqd0Var.m70640h() || qp71Var.m73436p()) {
            pqd0Var.f180275j.setQueue(null);
            return;
        }
        int i = x280.f257392a;
        ArrayList arrayList = new ArrayList();
        mp71 mp71Var = new mp71();
        int i2 = 0;
        for (int i3 = 0; i3 < qp71Var.mo26655o(); i3++) {
            arrayList.add(qp71Var.mo26654n(i3, mp71Var, 0L).f145928c);
        }
        ArrayList arrayList2 = new ArrayList();
        feb febVar = new feb(this, new AtomicInteger(0), arrayList, arrayList2, 15);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr = ((ufd0) arrayList.get(i4)).f229765d.f177617k;
            if (bArr == null) {
                arrayList2.add(null);
                febVar.run();
            } else {
                u790 u790VarMo60775j = rpd0Var.f201553m.mo60775j(bArr);
                arrayList2.add(u790VarMo60775j);
                Handler handler = rpd0Var.f201552l;
                Objects.requireNonNull(handler);
                u790VarMo60775j.mo28322a(febVar, new xgi(handler, i2));
            }
        }
    }

    @Override // p204p.snd0
    public final void onDisconnected() {
    }
}
