package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import androidx.media3.common.PlaybackException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lbd0 implements g7p0 {

    /* JADX INFO: renamed from: a */
    public final mp71 f131633a;

    /* JADX INFO: renamed from: b */
    public boolean f131634b;

    /* JADX INFO: renamed from: c */
    public final jcd0 f131635c;

    /* JADX INFO: renamed from: d */
    public final kbd0 f131636d;

    /* JADX INFO: renamed from: e */
    public final Handler f131637e;

    /* JADX INFO: renamed from: f */
    public final long f131638f;

    /* JADX INFO: renamed from: g */
    public boolean f131639g;

    /* JADX INFO: renamed from: h */
    public final obd0 f131640h;

    public lbd0(Context context, n301 n301Var, Bundle bundle, kbd0 kbd0Var, Looper looper, obd0 obd0Var) {
        jv30 jv30Var;
        c95.m31848n(context, "context must not be null");
        c95.m31848n(n301Var, "token must not be null");
        yif1.m93818w("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + h0b1.f86200a + "]");
        this.f131633a = new mp71();
        this.f131638f = -9223372036854775807L;
        this.f131636d = kbd0Var;
        this.f131637e = new Handler(looper);
        this.f131640h = obd0Var;
        n301Var.f149897a.getClass();
        jcd0 jcd0Var = new jcd0(context, this, n301Var, bundle, looper);
        this.f131635c = jcd0Var;
        n301 n301Var2 = jcd0Var.f111083e;
        n301Var2.f149897a.getClass();
        IBinder iBinder = n301Var2.f149897a.f161208g;
        iBinder.getClass();
        IBinder iBinder2 = iBinder;
        int i = iv30.f106108a;
        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jv30)) {
            gv30 gv30Var = new gv30();
            gv30Var.f84601a = iBinder2;
            jv30Var = gv30Var;
        } else {
            jv30Var = (jv30) iInterfaceQueryLocalInterface;
        }
        int iM62565e = jcd0Var.f111080b.m62565e();
        String packageName = jcd0Var.f111082d.getPackageName();
        int iMyPid = Process.myPid();
        lbd0 lbd0Var = jcd0Var.f111079a;
        lbd0Var.getClass();
        try {
            jv30Var.mo45801I0(jcd0Var.f111081c, iM62565e, new kzi(1011000300, 10, packageName, iMyPid, new Bundle(jcd0Var.f111084f), 0).m57758b());
        } catch (RemoteException e) {
            yif1.m93821x0("Failed to call connection request.", e);
            Objects.requireNonNull(lbd0Var);
            lbd0Var.m58660c1(new ig10(lbd0Var, 16));
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: A */
    public final void mo43825A() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring decreaseDeviceVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(26)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 13));
            cap0 cap0Var = jcd0Var.f111094p;
            int i = cap0Var.f35909t - 1;
            if (i >= cap0Var.f35908s.f258730b) {
                jcd0Var.f111094p = cap0Var.m32068c(i, cap0Var.f35910u);
                n890Var.m63834e(30, new bcd0(jcd0Var, i, 9));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: A0 */
    public final int mo43826A0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149589a.f56986i;
        }
        return -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: B */
    public final void mo43827B(int i) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring increaseDeviceVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(34)) {
            jcd0Var.m52949f(new bcd0(jcd0Var, i, 2));
            cap0 cap0Var = jcd0Var.f111094p;
            int i2 = cap0Var.f35909t + 1;
            int i3 = cap0Var.f35908s.f258731c;
            if (i3 == 0 || i2 <= i3) {
                jcd0Var.f111094p = cap0Var.m32068c(i2, cap0Var.f35910u);
                n890Var.m63834e(30, new bcd0(jcd0Var, i2, 3));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: B0 */
    public final void mo43828B0(dr81 dr81Var) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(29)) {
            jcd0Var.m52949f(new us30(7, jcd0Var, dr81Var));
            cap0 cap0Var = jcd0Var.f111094p;
            if (dr81Var != cap0Var.f35889G) {
                jcd0Var.f111094p = cap0Var.m32079n(dr81Var);
                n890Var.m63834e(19, new wix(dr81Var, 1));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: C */
    public final void mo43829C(int i, int i2, List list) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring replaceMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0 && i <= i2);
            jcd0Var.m52949f(new pbd0(jcd0Var, list, i, i2, 0));
            jcd0Var.m52937C(i, i2, list);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: C0 */
    public final void mo43830C0(ufd0 ufd0Var) {
        m58661d1();
        c95.m31848n(ufd0Var, "mediaItems must not be null");
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setMediaItems().");
        } else if (jcd0Var.m52959q(31)) {
            jcd0Var.m52949f(new tbd0(jcd0Var, ufd0Var, 0));
            jcd0Var.m52941I(Collections.singletonList(ufd0Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: D */
    public final boolean mo43831D() {
        return false;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: D0 */
    public final void mo43832D0(final List list, final int i, final long j) {
        m58661d1();
        c95.m31848n(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            c95.m31842h("items must not contain null, index=%s", i2, list.get(i2) != null);
        }
        final jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            jcd0Var.m52949f(new hcd0() { // from class: p.qbd0
                @Override // p204p.hcd0
                /* JADX INFO: renamed from: d */
                public final void mo25456d(jv30 jv30Var, int i3) {
                    jcd0 jcd0Var2 = jcd0Var;
                    pcd0 pcd0Var = jcd0Var2.f111081c;
                    jf40 jf40VarM69788m = pf40.m69788m();
                    int i4 = 0;
                    while (true) {
                        List list2 = list;
                        if (i4 >= list2.size()) {
                            jv30Var.mo45805K1(pcd0Var, i3, new kra(jf40VarM69788m.m53150g()), i, j);
                            return;
                        } else {
                            jf40VarM69788m.m28985c(((ufd0) list2.get(i4)).m82985e(jcd0Var2.m52957o(), true));
                            i4++;
                        }
                    }
                }
            });
            jcd0Var.m52941I(list, i, j, false);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: E */
    public final void mo43833E(int i) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring removeMediaItem().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0);
            jcd0Var.m52949f(new bcd0(jcd0Var, i, 11));
            jcd0Var.m52936B(i, i + 1);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: E0 */
    public final void mo43834E0(int i) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekTo().");
        } else if (jcd0Var.m52959q(10)) {
            c95.m31843i(i >= 0);
            jcd0Var.m52949f(new bcd0(jcd0Var, i, 10));
            jcd0Var.m52938F(i, -9223372036854775807L);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: F0 */
    public final long mo43835F0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35886D;
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: G */
    public final void mo43836G(int i, int i2) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring removeMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0 && i2 >= i);
            jcd0Var.m52949f(new acd0(jcd0Var, i, i2, 2));
            jcd0Var.m52936B(i, i2);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: H */
    public final void mo43837H(SurfaceHolder surfaceHolder) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setVideoSurfaceHolder().");
            return;
        }
        if (jcd0Var.m52959q(27)) {
            if (surfaceHolder == null) {
                if (jcd0Var.m52959q(27)) {
                    jcd0Var.m52946b();
                    jcd0Var.m52943K(null, 0, 0);
                    jcd0Var.m52963y(0, 0);
                    return;
                }
                return;
            }
            if (jcd0Var.f111071A == surfaceHolder) {
                return;
            }
            jcd0Var.m52946b();
            jcd0Var.f111071A = surfaceHolder;
            surfaceHolder.addCallback(jcd0Var.f111086h);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                jcd0Var.f111104z = null;
                jcd0Var.m52943K(null, 0, 0);
                jcd0Var.m52963y(0, 0);
            } else {
                jcd0Var.f111104z = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                jcd0Var.m52943K(surface, surfaceFrame.width(), surfaceFrame.height());
                jcd0Var.m52963y(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: H0 */
    public final long mo43838H0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.m52952i();
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: I */
    public final void mo43839I(d7p0 d7p0Var) {
        this.f131635c.f111087i.m63831b(d7p0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: I0 */
    public final void mo43840I0(int i, List list) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring addMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0);
            jcd0Var.m52949f(new sbd0(jcd0Var, i, list, 0));
            jcd0Var.m52945a(i, list);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: J */
    public final void mo43841J() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekToPrevious().");
            return;
        }
        if (jcd0Var.m52959q(7)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 3));
            qp71 qp71Var = jcd0Var.f111094p.f35899j;
            if (qp71Var.m73436p() || jcd0Var.f111094p.f35892c.f149590b) {
                return;
            }
            boolean z = jcd0Var.m52956n() != -1;
            mp71 mp71VarMo26654n = qp71Var.mo26654n(jcd0.m52929j(jcd0Var.f111094p), new mp71(), 0L);
            if (mp71VarMo26654n.f145934i && mp71VarMo26654n.m62446c()) {
                if (z) {
                    jcd0Var.m52938F(jcd0Var.m52956n(), -9223372036854775807L);
                }
            } else if (!z || jcd0Var.m52953k() > jcd0Var.f111094p.f35887E) {
                jcd0Var.m52938F(jcd0.m52929j(jcd0Var.f111094p), 0L);
            } else {
                jcd0Var.m52938F(jcd0Var.m52956n(), -9223372036854775807L);
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: J0 */
    public final long mo43842J0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149593e;
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: K */
    public final PlaybackException mo43843K() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35890a;
        }
        return null;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: K0 */
    public final boolean mo43844K0() {
        m58661d1();
        qp71 qp71VarMo43876b0 = mo43876b0();
        return !qp71VarMo43876b0.m73436p() && qp71VarMo43876b0.mo26654n(mo43847M0(), this.f131633a, 0L).f145933h;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: L */
    public final void mo43845L(boolean z) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            if (jcd0Var.m52959q(1)) {
                jcd0Var.m52949f(new zbd0(jcd0Var, z, 0));
                jcd0Var.m52942J(z);
            } else if (z) {
                yif1.m93819w0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: L0 */
    public final phd0 mo43846L0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35902m : phd0.f177558M;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: M0 */
    public final int mo43847M0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0.m52929j(jcd0Var.f111094p);
        }
        return -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: N */
    public final void mo43848N() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring unmute().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(24)) {
            float f = jcd0Var.f111094p.f35904o;
            jcd0Var.m52949f(new ccd0(jcd0Var, f, 2));
            cap0 cap0Var = jcd0Var.f111094p;
            float f2 = cap0Var.f35903n;
            if (f2 == cap0Var.f35904o || f2 != 0.0f) {
                return;
            }
            jcd0Var.f111094p = cap0Var.m32080o(f);
            n890Var.m63834e(22, new tix(f, 2));
            n890Var.m63832c();
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: N0 */
    public final void mo43849N0(int i, int i2) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring moveMediaItem().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0 && i2 >= 0);
            jcd0Var.m52949f(new acd0(jcd0Var, i, i2, 1));
            jcd0Var.m52960v(i, i + 1, i2);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: O */
    public final void mo43850O(d7p0 d7p0Var) {
        m58661d1();
        c95.m31848n(d7p0Var, "listener must not be null");
        this.f131635c.f111087i.m63836g(d7p0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: O0 */
    public final void mo43851O0(final int i, final int i2, final int i3) {
        m58661d1();
        final jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring moveMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0 && i <= i2 && i3 >= 0);
            jcd0Var.m52949f(new hcd0() { // from class: p.fcd0
                @Override // p204p.hcd0
                /* JADX INFO: renamed from: d */
                public final void mo25456d(jv30 jv30Var, int i4) {
                    jv30Var.mo45797E0(jcd0Var.f111081c, i4, i, i2, i3);
                }
            });
            jcd0Var.m52960v(i, i2, i3);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: P */
    public final void mo43852P(ufd0 ufd0Var) {
        m58661d1();
        c95.m31848n(ufd0Var, "mediaItems must not be null");
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setMediaItem().");
        } else if (jcd0Var.m52959q(31)) {
            jcd0Var.m52949f(new tbd0(jcd0Var, ufd0Var, 1));
            jcd0Var.m52941I(Collections.singletonList(ufd0Var), -1, -9223372036854775807L, true);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: P0 */
    public final void mo43853P0(List list) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring addMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            jcd0Var.m52949f(new rbd0(jcd0Var, list, 1));
            jcd0Var.m52945a(jcd0Var.f111094p.f35899j.mo26655o(), list);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Q */
    public final void mo43854Q() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekToNextMediaItem().");
        } else if (jcd0Var.m52959q(8)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 12));
            if (jcd0Var.m52954l() != -1) {
                jcd0Var.m52938F(jcd0Var.m52954l(), -9223372036854775807L);
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Q0 */
    public final boolean mo43855Q0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35910u;
        }
        return false;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: R */
    public final void mo43856R(int i) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring decreaseDeviceVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(34)) {
            jcd0Var.m52949f(new bcd0(jcd0Var, i, 4));
            cap0 cap0Var = jcd0Var.f111094p;
            int i2 = cap0Var.f35909t - 1;
            if (i2 >= cap0Var.f35908s.f258730b) {
                jcd0Var.f111094p = cap0Var.m32068c(i2, cap0Var.f35910u);
                n890Var.m63834e(30, new bcd0(jcd0Var, i2, 8));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: R0 */
    public final boolean mo43857R0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.f111094p.f35898i;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: S */
    public final tt81 mo43858S() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35888F : tt81.f223553b;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: T */
    public final boolean mo43859T() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.m52954l() != -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: T0 */
    public final long mo43860T0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149598j;
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: U */
    public final o0m mo43861U() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35907r : o0m.f160423d;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: U0 */
    public final void mo43862U0(int i) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setDeviceVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(25)) {
            jcd0Var.m52949f(new bcd0(jcd0Var, i, 6));
            cap0 cap0Var = jcd0Var.f111094p;
            x6r x6rVar = cap0Var.f35908s;
            if (cap0Var.f35909t == i || x6rVar.f258730b > i) {
                return;
            }
            int i2 = x6rVar.f258731c;
            if (i2 == 0 || i <= i2) {
                jcd0Var.f111094p = cap0Var.m32068c(i, cap0Var.f35910u);
                n890Var.m63834e(30, new bcd0(jcd0Var, i, 7));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: V */
    public final int mo43863V() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149589a.f56985h;
        }
        return -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: V0 */
    public final void mo43864V0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekForward().");
        } else if (jcd0Var.m52959q(12)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 0));
            jcd0Var.m52939G(jcd0Var.f111094p.f35886D);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: W */
    public final boolean mo43865W(int i) {
        return mo43895l0().m28393a(i);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: W0 */
    public final void mo43866W0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekBack().");
        } else if (jcd0Var.m52959q(11)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 5));
            jcd0Var.m52939G(-jcd0Var.f111094p.f35885C);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: X */
    public final void mo43867X(boolean z) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setDeviceMuted().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(26)) {
            jcd0Var.m52949f(new zbd0(jcd0Var, z, 3));
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35910u != z) {
                jcd0Var.f111094p = cap0Var.m32068c(cap0Var.f35909t, z);
                n890Var.m63834e(30, new zbd0(jcd0Var, z, 4));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: X0 */
    public final phd0 mo43868X0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35884B : phd0.f177558M;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Y0 */
    public final void mo43869Y0(List list) {
        m58661d1();
        c95.m31848n(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            c95.m31842h("items must not contain null, index=%s", i, list.get(i) != null);
        }
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            jcd0Var.m52949f(new rbd0(jcd0Var, list, 0));
            jcd0Var.m52941I(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Z */
    public final boolean mo43870Z() {
        m58661d1();
        qp71 qp71VarMo43876b0 = mo43876b0();
        return !qp71VarMo43876b0.m73436p() && qp71VarMo43876b0.mo26654n(mo43847M0(), this.f131633a, 0L).f145934i;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Z0 */
    public final long mo43871Z0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35885C;
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a */
    public final void mo43872a() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring pause().");
        } else if (jcd0Var.m52959q(1)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 6));
            jcd0Var.m52942J(false);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a0 */
    public final int mo43873a0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35915z;
        }
        return 0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a1 */
    public final boolean mo43874a1() {
        m58661d1();
        qp71 qp71VarMo43876b0 = mo43876b0();
        return !qp71VarMo43876b0.m73436p() && qp71VarMo43876b0.mo26654n(mo43847M0(), this.f131633a, 0L).m62446c();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: b */
    public final void mo43875b() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring prepare().");
            return;
        }
        if (jcd0Var.m52959q(2)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 10));
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35883A == 1) {
                jcd0Var.m52944L(cap0Var.m32071f(cap0Var.f35899j.m73436p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: b0 */
    public final qp71 mo43876b0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35899j : qp71.f191180a;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m58659b1() {
        m58661d1();
        if (this.f131634b) {
            return;
        }
        yif1.m93818w("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + h0b1.f86200a + "] [" + dgd0.m35921b() + "]");
        this.f131634b = true;
        Handler handler = this.f131637e;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f131635c.m52935A();
        } catch (Exception e) {
            yif1.m93804p(e, "Exception while releasing impl");
        }
        if (this.f131639g) {
            c95.m31855u(Looper.myLooper() == handler.getLooper());
            this.f131636d.onDisconnected();
        } else {
            this.f131639g = true;
            obd0 obd0Var = this.f131640h;
            obd0Var.getClass();
            obd0Var.m28331v(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: c */
    public final boolean mo43877c() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.f111094p.f35914y;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: c0 */
    public final Looper mo43878c0() {
        return this.f131637e.getLooper();
    }

    /* JADX INFO: renamed from: c1 */
    public final void m58660c1(Runnable runnable) {
        h0b1.m46304c0(this.f131637e, runnable);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: d */
    public final float mo43879d() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35903n;
        }
        return 1.0f;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: d0 */
    public final void mo43880d0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring increaseDeviceVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(26)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 7));
            cap0 cap0Var = jcd0Var.f111094p;
            int i = cap0Var.f35909t + 1;
            int i2 = cap0Var.f35908s.f258731c;
            if (i2 == 0 || i <= i2) {
                jcd0Var.f111094p = cap0Var.m32068c(i, cap0Var.f35910u);
                n890Var.m63834e(30, new bcd0(jcd0Var, i, 1));
                n890Var.m63832c();
            }
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m58661d1() {
        c95.m31856v(Looper.myLooper() == this.f131637e.getLooper(), "MediaController method is called from a wrong thread. See javadoc of MediaController for details.");
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: e */
    public final void mo43881e(float f) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setPlaybackSpeed().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(13)) {
            jcd0Var.m52949f(new ccd0(jcd0Var, f, 0));
            h1p0 h1p0Var = jcd0Var.f111094p.f35896g;
            if (h1p0Var.f86674a != f) {
                h1p0 h1p0VarM46464b = h1p0Var.m46464b(f);
                jcd0Var.f111094p = jcd0Var.f111094p.m32070e(h1p0VarM46464b);
                n890Var.m63834e(12, new dcd0(h1p0VarM46464b, 0));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: e0 */
    public final dr81 mo43882e0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return !jcd0Var.m52958p() ? dr81.f52193J : jcd0Var.f111094p.f35889G;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: f */
    public final void mo43883f(long j) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekTo().");
        } else if (jcd0Var.m52959q(5)) {
            jcd0Var.m52949f(new qcb(jcd0Var, j, 2));
            jcd0Var.m52938F(jcd0.m52929j(jcd0Var.f111094p), j);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: f0 */
    public final void mo43884f0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekToNext().");
            return;
        }
        if (jcd0Var.m52959q(9)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 8));
            qp71 qp71Var = jcd0Var.f111094p.f35899j;
            if (qp71Var.m73436p() || jcd0Var.f111094p.f35892c.f149590b) {
                return;
            }
            if (jcd0Var.m52954l() != -1) {
                jcd0Var.m52938F(jcd0Var.m52954l(), -9223372036854775807L);
                return;
            }
            mp71 mp71VarMo26654n = qp71Var.mo26654n(jcd0.m52929j(jcd0Var.f111094p), new mp71(), 0L);
            if (mp71VarMo26654n.f145934i && mp71VarMo26654n.m62446c()) {
                jcd0Var.m52938F(jcd0.m52929j(jcd0Var.f111094p), -9223372036854775807L);
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: g */
    public final void mo43885g() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring play().");
        } else if (!jcd0Var.m52959q(1)) {
            yif1.m93819w0("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            jcd0Var.m52949f(new ubd0(jcd0Var, 14));
            jcd0Var.m52942J(true);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: g0 */
    public final void mo43886g0(phd0 phd0Var) {
        m58661d1();
        c95.m31848n(phd0Var, "playlistMetadata must not be null");
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setPlaylistMetadata().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(19)) {
            jcd0Var.m52949f(new us30(8, jcd0Var, phd0Var));
            if (jcd0Var.f111094p.f35902m.equals(phd0Var)) {
                return;
            }
            jcd0Var.f111094p = jcd0Var.f111094p.m32072g(phd0Var);
            n890Var.m63834e(15, new pix(phd0Var, 1));
            n890Var.m63832c();
        }
    }

    @Override // p204p.g7p0
    public final long getDuration() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149592d;
        }
        return -9223372036854775807L;
    }

    @Override // p204p.g7p0
    public final int getPlaybackState() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35883A;
        }
        return 1;
    }

    @Override // p204p.g7p0
    public final int getRepeatMode() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35897h;
        }
        return 0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: h0 */
    public final int mo43887h0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35909t;
        }
        return 0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: i */
    public final boolean mo43888i() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.f111094p.f35913x;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: i0 */
    public final void mo43889i0(ufd0 ufd0Var, long j) {
        m58661d1();
        c95.m31848n(ufd0Var, "mediaItems must not be null");
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setMediaItem().");
        } else if (jcd0Var.m52959q(31)) {
            jcd0Var.m52949f(new f3l(jcd0Var, j, ufd0Var));
            jcd0Var.m52941I(Collections.singletonList(ufd0Var), -1, j, false);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: j */
    public final h1p0 mo43890j() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35896g : h1p0.f86671d;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: j0 */
    public final long mo43891j0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149596h;
        }
        return -9223372036854775807L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: k */
    public final void mo43892k() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring mute().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(24)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 11));
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35903n != 0.0f) {
                jcd0Var.f111094p = cap0Var.m32080o(0.0f);
                n890Var.m63834e(22, new xba0(20));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: k0 */
    public final void mo43893k0(int i, long j) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekTo().");
        } else if (jcd0Var.m52959q(10)) {
            c95.m31843i(i >= 0);
            jcd0Var.m52949f(new uwo(j, jcd0Var, i));
            jcd0Var.m52938F(i, j);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: l */
    public final void mo43894l(h1p0 h1p0Var) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setPlaybackParameters().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(13)) {
            jcd0Var.m52949f(new us30(9, jcd0Var, h1p0Var));
            if (jcd0Var.f111094p.f35896g.equals(h1p0Var)) {
                return;
            }
            jcd0Var.f111094p = jcd0Var.f111094p.m32070e(h1p0Var);
            n890Var.m63834e(12, new dcd0(h1p0Var, 1));
            n890Var.m63832c();
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: l0 */
    public final b7p0 mo43895l0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return !jcd0Var.m52958p() ? b7p0.f24366b : jcd0Var.f111103y;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: m */
    public final x6r mo43896m() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return !jcd0Var.m52958p() ? x6r.f258724e : jcd0Var.f111094p.f35908s;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: m0 */
    public final void mo43897m0(boolean z) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setShuffleMode().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(14)) {
            jcd0Var.m52949f(new zbd0(jcd0Var, z, 2));
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35898i != z) {
                jcd0Var.f111094p = cap0Var.m32076k(z);
                n890Var.m63834e(9, new vix(z, 2));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: n */
    public final void mo43898n(Surface surface) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setVideoSurface().");
            return;
        }
        if (jcd0Var.m52959q(27)) {
            jcd0Var.m52946b();
            jcd0Var.f111104z = surface;
            int i = surface == null ? 0 : -1;
            jcd0Var.m52943K(surface, i, i);
            jcd0Var.m52963y(i, i);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: o */
    public final boolean mo43899o() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.f111094p.f35911v;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: o0 */
    public final long mo43900o0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35887E;
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: p */
    public final boolean mo43901p() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.f111094p.f35892c.f149590b;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: p0 */
    public final void mo43902p0(int i, ufd0 ufd0Var) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring replaceMediaItem().");
        } else if (jcd0Var.m52959q(20)) {
            c95.m31843i(i >= 0);
            jcd0Var.m52949f(new sbd0(jcd0Var, i, ufd0Var, 1));
            jcd0Var.m52937C(i, i + 1, pf40.m69794t(ufd0Var));
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: q */
    public final long mo43903q() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149595g;
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: r */
    public final void mo43904r(float f) {
        m58661d1();
        c95.m31844j(f >= 0.0f && f <= 1.0f, "volume must be between 0 and 1");
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(24)) {
            jcd0Var.m52949f(new ccd0(jcd0Var, f, 1));
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35903n != f) {
                jcd0Var.f111094p = cap0Var.m32080o(f);
                n890Var.m63834e(22, new tix(f, 1));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: s */
    public final void mo43905s(xs6 xs6Var, boolean z) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setAudioAttributes().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(35)) {
            jcd0Var.m52949f(new szb(jcd0Var, xs6Var, z));
            if (jcd0Var.f111094p.f35906q.equals(xs6Var)) {
                return;
            }
            jcd0Var.f111094p = jcd0Var.f111094p.m32066a(xs6Var);
            n890Var.m63834e(20, new six(xs6Var, 1));
            n890Var.m63832c();
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: s0 */
    public final long mo43906s0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149597i;
        }
        return -9223372036854775807L;
    }

    @Override // p204p.g7p0
    public final void setRepeatMode(int i) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setRepeatMode().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(15)) {
            jcd0Var.m52949f(new bcd0(jcd0Var, i, 5));
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35897h != i) {
                jcd0Var.f111094p = cap0Var.m32074i(i);
                n890Var.m63834e(8, new vwo(i, 4));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    public final void stop() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring stop().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(3)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 9));
            cap0 cap0Var = jcd0Var.f111094p;
            n201 n201Var = jcd0Var.f111094p.f35892c;
            e7p0 e7p0Var = n201Var.f149589a;
            boolean z = n201Var.f149590b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            n201 n201Var2 = jcd0Var.f111094p.f35892c;
            long j = n201Var2.f149592d;
            long j2 = n201Var2.f149589a.f56983f;
            int iM37447b = dzd0.m37447b(j2, j);
            n201 n201Var3 = jcd0Var.f111094p.f35892c;
            cap0 cap0VarM32075j = cap0Var.m32075j(new n201(e7p0Var, z, jElapsedRealtime, j, j2, iM37447b, 0L, n201Var3.f149596h, n201Var3.f149597i, n201Var3.f149589a.f56983f));
            jcd0Var.f111094p = cap0VarM32075j;
            if (cap0VarM32075j.f35883A != 1) {
                jcd0Var.f111094p = cap0VarM32075j.m32071f(1, cap0VarM32075j.f35890a);
                n890Var.m63834e(4, new xba0(19));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: t */
    public final void mo43907t() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring clearMediaItems().");
        } else if (jcd0Var.m52959q(20)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 4));
            jcd0Var.m52936B(0, Alert.DURATION_SHOW_INDEFINITELY);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: t0 */
    public final int mo43908t0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149589a.f56982e;
        }
        return -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: u */
    public final long mo43909u() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.m52953k();
        }
        return 0L;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: u0 */
    public final k9c1 mo43910u0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() ? jcd0Var.f111094p.f35901l : k9c1.f120559d;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: v */
    public final ufd0 mo43911v() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            return null;
        }
        return qp71VarMo43876b0.mo26654n(mo43847M0(), this.f131633a, 0L).f145928c;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: v0 */
    public final xs6 mo43912v0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return !jcd0Var.m52958p() ? xs6.f265509i : jcd0Var.f111094p.f35906q;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: w */
    public final int mo43913w() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (jcd0Var.m52958p()) {
            return jcd0Var.f111094p.f35892c.f149594f;
        }
        return 0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: x */
    public final void mo43914x() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else if (jcd0Var.m52959q(6)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 2));
            if (jcd0Var.m52956n() != -1) {
                jcd0Var.m52938F(jcd0Var.m52956n(), -9223372036854775807L);
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: x0 */
    public final void mo43915x0(int i, int i2) {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setDeviceVolume().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(33)) {
            jcd0Var.m52949f(new acd0(jcd0Var, i, i2, 0));
            cap0 cap0Var = jcd0Var.f111094p;
            x6r x6rVar = cap0Var.f35908s;
            if (cap0Var.f35909t == i || x6rVar.f258730b > i) {
                return;
            }
            int i3 = x6rVar.f258731c;
            if (i3 == 0 || i <= i3) {
                jcd0Var.f111094p = cap0Var.m32068c(i, cap0Var.f35910u);
                n890Var.m63834e(30, new bcd0(jcd0Var, i, 0));
                n890Var.m63832c();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: y */
    public final void mo43916y() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring seekTo().");
        } else if (jcd0Var.m52959q(4)) {
            jcd0Var.m52949f(new ubd0(jcd0Var, 1));
            jcd0Var.m52938F(jcd0.m52929j(jcd0Var.f111094p), -9223372036854775807L);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: y0 */
    public final boolean mo43917y0() {
        m58661d1();
        jcd0 jcd0Var = this.f131635c;
        return jcd0Var.m52958p() && jcd0Var.m52956n() != -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: z */
    public final void mo43918z(final int i, final boolean z) {
        m58661d1();
        final jcd0 jcd0Var = this.f131635c;
        if (!jcd0Var.m52958p()) {
            yif1.m93819w0("The controller is not connected. Ignoring setDeviceMuted().");
            return;
        }
        n890 n890Var = jcd0Var.f111087i;
        if (jcd0Var.m52959q(34)) {
            jcd0Var.m52949f(new hcd0() { // from class: p.ecd0
                @Override // p204p.hcd0
                /* JADX INFO: renamed from: d */
                public final void mo25456d(jv30 jv30Var, int i2) {
                    jv30Var.mo45839r(jcd0Var.f111081c, i2, z, i);
                }
            });
            cap0 cap0Var = jcd0Var.f111094p;
            if (cap0Var.f35910u != z) {
                jcd0Var.f111094p = cap0Var.m32068c(cap0Var.f35909t, z);
                n890Var.m63834e(30, new zbd0(jcd0Var, z, 1));
                n890Var.m63832c();
            }
        }
    }
}
