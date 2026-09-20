package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class vg61 extends sg61 {

    /* JADX INFO: renamed from: b */
    public final ik40 f241150b;

    /* JADX INFO: renamed from: c */
    public final Handler f241151c;

    /* JADX INFO: renamed from: d */
    public final htz0 f241152d;

    /* JADX INFO: renamed from: e */
    public final zb20 f241153e;

    /* JADX INFO: renamed from: f */
    public kwb f241154f;

    /* JADX INFO: renamed from: g */
    public jsa f241155g;

    /* JADX INFO: renamed from: h */
    public jbb f241156h;

    /* JADX INFO: renamed from: i */
    public gbb f241157i;

    /* JADX INFO: renamed from: j */
    public hk00 f241158j;

    /* JADX INFO: renamed from: o */
    public final zb20 f241163o;

    /* JADX INFO: renamed from: q */
    public ArrayList f241165q;

    /* JADX INFO: renamed from: r */
    public hw80 f241166r;

    /* JADX INFO: renamed from: s */
    public final uz6 f241167s;

    /* JADX INFO: renamed from: t */
    public final k9u f241168t;

    /* JADX INFO: renamed from: u */
    public final cu70 f241169u;

    /* JADX INFO: renamed from: v */
    public final mwt0 f241170v;

    /* JADX INFO: renamed from: a */
    public final Object f241149a = new Object();

    /* JADX INFO: renamed from: k */
    public List f241159k = null;

    /* JADX INFO: renamed from: l */
    public boolean f241160l = false;

    /* JADX INFO: renamed from: m */
    public boolean f241161m = false;

    /* JADX INFO: renamed from: n */
    public boolean f241162n = false;

    /* JADX INFO: renamed from: p */
    public final Object f241164p = new Object();

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f241171w = new AtomicBoolean(false);

    public vg61(rwt0 rwt0Var, rwt0 rwt0Var2, ik40 ik40Var, htz0 htz0Var, zb20 zb20Var, Handler handler) {
        this.f241150b = ik40Var;
        this.f241151c = handler;
        this.f241152d = htz0Var;
        this.f241153e = zb20Var;
        uz6 uz6Var = new uz6();
        uz6Var.f235431a = rwt0Var2.m76580a(TextureViewIsClosedQuirk.class);
        uz6Var.f235432b = rwt0Var.m76580a(PreviewOrientationIncorrectQuirk.class);
        uz6Var.f235433c = rwt0Var.m76580a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.f241167s = uz6Var;
        this.f241169u = new cu70(rwt0Var.m76580a(CaptureSessionStuckQuirk.class) || rwt0Var.m76580a(IncorrectCaptureStateQuirk.class));
        this.f241168t = new k9u(rwt0Var2);
        this.f241170v = new mwt0(rwt0Var2);
        this.f241163o = zb20Var;
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: a */
    public final void mo57518a(vg61 vg61Var) {
        Objects.requireNonNull(this.f241154f);
        this.f241154f.mo57518a(vg61Var);
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: b */
    public final void mo57519b(vg61 vg61Var) {
        Objects.requireNonNull(this.f241154f);
        this.f241154f.mo57519b(vg61Var);
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: c */
    public final void mo57520c(vg61 vg61Var) {
        jbb jbbVar;
        synchronized (this.f241164p) {
            this.f241167s.m84283b(this.f241165q);
        }
        m85399l("onClosed()");
        synchronized (this.f241149a) {
            try {
                if (this.f241160l) {
                    jbbVar = null;
                } else {
                    this.f241160l = true;
                    wj50.m88280q(this.f241156h, "Need to call openCaptureSession before using this API.");
                    jbbVar = this.f241156h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f241149a) {
            try {
                List list = this.f241159k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mjq) it.next()).m61984b();
                    }
                    this.f241159k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f241169u.m33891c();
        if (jbbVar != null) {
            jbbVar.f110727b.mo28322a(new tg61(this, vg61Var, 0), e95.m38202g());
        }
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: d */
    public final void mo57521d(vg61 vg61Var) {
        vg61 vg61Var2;
        Objects.requireNonNull(this.f241154f);
        synchronized (this.f241149a) {
            try {
                List list = this.f241159k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mjq) it.next()).m61984b();
                    }
                    this.f241159k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f241169u.m33891c();
        ik40 ik40Var = this.f241150b;
        Iterator it2 = ik40Var.m50922y().iterator();
        while (it2.hasNext() && (vg61Var2 = (vg61) it2.next()) != this) {
            synchronized (vg61Var2.f241149a) {
                try {
                    List list2 = vg61Var2.f241159k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((mjq) it3.next()).m61984b();
                        }
                        vg61Var2.f241159k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            vg61Var2.f241169u.m33891c();
        }
        synchronized (ik40Var.f103007c) {
            ((LinkedHashSet) ik40Var.f103010f).remove(this);
        }
        this.f241154f.mo57521d(vg61Var);
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: e */
    public final void mo57522e(vg61 vg61Var) {
        ArrayList arrayList;
        vg61 vg61Var2;
        vg61 vg61Var3;
        vg61 vg61Var4;
        m85399l("Session onConfigured()");
        k9u k9uVar = this.f241168t;
        ik40 ik40Var = this.f241150b;
        synchronized (ik40Var.f103007c) {
            arrayList = new ArrayList((LinkedHashSet) ik40Var.f103010f);
        }
        ArrayList arrayListM50916r = this.f241150b.m50916r();
        if (((CaptureSessionOnClosedNotCalledQuirk) k9uVar.f120692b) != null) {
            LinkedHashSet<vg61> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (vg61Var4 = (vg61) it.next()) != vg61Var) {
                linkedHashSet.add(vg61Var4);
            }
            for (vg61 vg61Var5 : linkedHashSet) {
                vg61Var5.getClass();
                vg61Var5.mo57521d(vg61Var5);
            }
        }
        Objects.requireNonNull(this.f241154f);
        ik40 ik40Var2 = this.f241150b;
        synchronized (ik40Var2.f103007c) {
            ((LinkedHashSet) ik40Var2.f103008d).add(this);
            ((LinkedHashSet) ik40Var2.f103010f).remove(this);
        }
        Iterator it2 = ik40Var2.m50922y().iterator();
        while (it2.hasNext() && (vg61Var3 = (vg61) it2.next()) != this) {
            synchronized (vg61Var3.f241149a) {
                try {
                    List list = vg61Var3.f241159k;
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((mjq) it3.next()).m61984b();
                        }
                        vg61Var3.f241159k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            vg61Var3.f241169u.m33891c();
        }
        this.f241154f.mo57522e(vg61Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) k9uVar.f120692b) != null) {
            LinkedHashSet<vg61> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayListM50916r.iterator();
            while (it4.hasNext() && (vg61Var2 = (vg61) it4.next()) != vg61Var) {
                linkedHashSet2.add(vg61Var2);
            }
            for (vg61 vg61Var6 : linkedHashSet2) {
                vg61Var6.getClass();
                vg61Var6.mo57520c(vg61Var6);
            }
        }
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: f */
    public final void mo57523f(vg61 vg61Var) {
        Objects.requireNonNull(this.f241154f);
        this.f241154f.mo57523f(vg61Var);
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: g */
    public final void mo57524g(vg61 vg61Var) {
        jbb jbbVar;
        synchronized (this.f241149a) {
            try {
                if (this.f241162n) {
                    jbbVar = null;
                } else {
                    this.f241162n = true;
                    wj50.m88280q(this.f241156h, "Need to call openCaptureSession before using this API.");
                    jbbVar = this.f241156h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jbbVar != null) {
            jbbVar.f110727b.mo28322a(new tg61(this, vg61Var, 1), e95.m38202g());
        }
    }

    @Override // p204p.sg61
    /* JADX INFO: renamed from: h */
    public final void mo57525h(vg61 vg61Var, Surface surface) {
        Objects.requireNonNull(this.f241154f);
        this.f241154f.mo57525h(vg61Var, surface);
    }

    /* JADX INFO: renamed from: i */
    public final int m85396i(ArrayList arrayList, ucb ucbVar) {
        CameraCaptureSession.CaptureCallback captureCallbackM33889a = this.f241169u.m33889a(ucbVar);
        wj50.m88280q(this.f241155g, "Need to call openCaptureSession before using this API.");
        return ((nt7) this.f241155g.f115456b).mo56200d(arrayList, this.f241152d, captureCallbackM33889a);
    }

    /* JADX INFO: renamed from: j */
    public final void m85397j() {
        if (!this.f241171w.compareAndSet(false, true)) {
            m85399l("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f241170v.f147883b) {
            try {
                m85399l("Call abortCaptures() before closing session.");
                wj50.m88280q(this.f241155g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((nt7) this.f241155g.f115456b).f157998b).abortCaptures();
            } catch (Exception e) {
                m85399l("Exception when calling abortCaptures()" + e);
            }
        }
        m85399l("Session call close()");
        this.f241169u.m33890b().mo28322a(new ug61(this, 1), this.f241152d);
    }

    /* JADX INFO: renamed from: k */
    public final void m85398k(CameraCaptureSession cameraCaptureSession) {
        if (this.f241155g == null) {
            this.f241155g = new jsa(cameraCaptureSession, this.f241151c);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m85399l(String str) {
        vie1.m85624f("SyncCaptureSessionImpl");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m85400m() {
        boolean z;
        synchronized (this.f241149a) {
            z = this.f241156h != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final u790 m85401n(CameraDevice cameraDevice, ayz0 ayz0Var, List list) throws Throwable {
        Throwable th;
        synchronized (this.f241164p) {
            try {
                try {
                    ArrayList<vg61> arrayListM50916r = this.f241150b.m50916r();
                    ArrayList arrayList = new ArrayList();
                    for (vg61 vg61Var : arrayListM50916r) {
                        try {
                            arrayList.add(n5h1.m63736l(new f3l(vg61Var.f241169u.m33890b(), 1500L, vg61Var.f241163o)));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    hw80 hw80Var = new hw80(new ArrayList(arrayList), false, e95.m38202g());
                    this.f241166r = hw80Var;
                    return x4w0.m89920K(x4w0.m89929T(hk00.m47729c(hw80Var), new geq(this, cameraDevice, ayz0Var, list, 5), this.f241152d));
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m85402o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackM33889a = this.f241169u.m33889a(captureCallback);
        wj50.m88280q(this.f241155g, "Need to call openCaptureSession before using this API.");
        return ((nt7) this.f241155g.f115456b).mo56201l(captureRequest, this.f241152d, captureCallbackM33889a);
    }

    /* JADX INFO: renamed from: p */
    public final u790 m85403p(ArrayList arrayList) {
        synchronized (this.f241149a) {
            try {
                if (this.f241161m) {
                    return new se40(new CancellationException("Opener is disabled"), 1);
                }
                jjc jjcVarM89929T = x4w0.m89929T(hk00.m47729c(gjg1.m44916c0(arrayList, this.f241152d, this.f241153e)), new uir(this, arrayList), this.f241152d);
                this.f241158j = jjcVarM89929T;
                return x4w0.m89920K(jjcVarM89929T);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m85404q() {
        boolean z;
        synchronized (this.f241164p) {
            try {
                if (m85400m()) {
                    this.f241167s.m84283b(this.f241165q);
                } else {
                    hw80 hw80Var = this.f241166r;
                    if (hw80Var != null) {
                        hw80Var.cancel(true);
                    }
                }
                hk00 hk00Var = null;
                try {
                    synchronized (this.f241149a) {
                        try {
                            if (!this.f241161m) {
                                hk00 hk00Var2 = this.f241158j;
                                hk00Var = hk00Var2 != null ? hk00Var2 : null;
                                this.f241161m = true;
                            }
                            z = !m85400m();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (hk00Var != null) {
                        hk00Var.cancel(true);
                    }
                } catch (Throwable th2) {
                    if (hk00Var != null) {
                        hk00Var.cancel(true);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: r */
    public final jsa m85405r() {
        this.f241155g.getClass();
        return this.f241155g;
    }
}
