package p204p;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.music.R;
import com.spotify.nowplayingmodes.adsmode.p115ui.overlay.AdsOverlayControlsLayout;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class n10 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f149215b;

    public /* synthetic */ n10(Object obj, int i) {
        this.f149214a = i;
        this.f149215b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v32, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v2, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        ?? arrayList;
        int actionMasked;
        ViewGroup viewGroup;
        AbstractC0110a layoutManager;
        AbstractC0110a layoutManager2;
        int i = 8;
        aq6Var = null;
        aq6 aq6Var = null;
        int i2 = 0;
        switch (this.f149214a) {
            case 0:
                o10 o10Var = (o10) this.f149215b;
                o10Var.f160553f = false;
                ViewGroup viewGroup2 = o10Var.f160551d;
                Object tag = viewGroup2.getTag(R.id.tag_accessibility_actions);
                ArrayList arrayList2 = tag instanceof ArrayList ? (ArrayList) tag : null;
                if (arrayList2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        C2212of c2212of = obj instanceof C2212of ? (C2212of) obj : null;
                        if (c2212of != null) {
                            arrayList.add(c2212of);
                        }
                    }
                } else {
                    arrayList = lau.f131415a;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mec1.m61559k(viewGroup2, ((C2212of) it.next()).m66803a());
                }
                if (o10Var.f160551d.isEnabled()) {
                    C2042k7 c2042k7 = new C2042k7(o10Var.f160551d, i);
                    while (c2042k7.hasNext()) {
                        o10Var.m66030j((View) c2042k7.next());
                    }
                    List<C1857fe> list = o10Var.f160552e;
                    if (list != null) {
                        for (C1857fe c1857fe : list) {
                            mec1.m61549a(o10Var.f160551d, c1857fe.f68626a, c1857fe.f68627b);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((AdsOverlayControlsLayout) this.f149215b).mo15995a(true);
                return;
            case 2:
                ((i941) this.f149215b).invoke();
                return;
            case 3:
                av3 av3Var = (av3) this.f149215b;
                av3Var.f20082d.await();
                ta6 ta6Var = (ta6) av3Var.f20080b.get();
                File[] fileArrListFiles = ((File) ta6Var.f218461a.get()).listFiles();
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    while (i2 < length) {
                        File file = fileArrListFiles[i2];
                        if (!ta6Var.f218462b.containsKey(file.getName())) {
                            file.delete();
                        }
                        i2++;
                    }
                    return;
                }
                return;
            case 4:
                oz3 oz3Var = (oz3) this.f149215b;
                oz3Var.removeCallbacks(this);
                MotionEvent motionEvent = oz3Var.f172004U1;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i3 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                oz3 oz3Var2 = (oz3) this.f149215b;
                oz3Var2.m68593K(motionEvent, i3, oz3Var2.f172006V1, false);
                return;
            case 5:
                sx4 sx4Var = (sx4) this.f149215b;
                if (sx4Var.getCollapsed()) {
                    sx4Var.f214805b.invoke();
                    return;
                }
                return;
            case 6:
                ly4 ly4Var = (ly4) this.f149215b;
                EGLDisplay eGLDisplay = ly4Var.f137951b;
                if (eGLDisplay != null) {
                    gy4 gy4Var = ly4Var.f137950a;
                    int i4 = gy4Var.f85436c;
                    if (i4 != 0) {
                        GLES20.glDeleteBuffers(1, new int[]{i4}, 0);
                        gy4Var.f85436c = 0;
                    }
                    int i5 = gy4Var.f85434a;
                    if (i5 != 0) {
                        GLES20.glDeleteProgram(i5);
                        gy4Var.f85434a = 0;
                    }
                    int i6 = gy4Var.f85435b;
                    if (i6 != 0) {
                        GLES20.glDeleteProgram(i6);
                        gy4Var.f85435b = 0;
                    }
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    EGLSurface eGLSurface2 = ly4Var.f137953d;
                    if (eGLSurface2 != null) {
                        EGL14.eglDestroySurface(eGLDisplay, eGLSurface2);
                    }
                    EGLContext eGLContext = ly4Var.f137952c;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                    }
                    EGL14.eglTerminate(eGLDisplay);
                }
                ly4Var.f137951b = null;
                ly4Var.f137952c = null;
                ly4Var.f137953d = null;
                HandlerThread handlerThread = ly4Var.f137954e;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    return;
                }
                return;
            case 7:
                l65 l65Var = (l65) this.f149215b;
                l65Var.f130197U0.showAtLocation(l65Var.f130196T0, 55, 0, 0);
                zkc1 zkc1Var = l65Var.f130199W0;
                if (zkc1Var != null) {
                    zkc1Var.m96314c();
                }
                if (l65Var.f130201X0 && (viewGroup = l65Var.f130203Y0) != null) {
                    WeakHashMap weakHashMap = mec1.f142677a;
                    if (viewGroup.isLaidOut()) {
                        l65Var.f130196T0.setAlpha(0.0f);
                        zkc1 zkc1VarM61551c = mec1.m61551c(l65Var.f130196T0);
                        zkc1VarM61551c.m96312a(1.0f);
                        l65Var.f130199W0 = zkc1VarM61551c;
                        zkc1VarM61551c.m96317f(new d65(this, i2));
                        return;
                    }
                }
                l65Var.f130196T0.setAlpha(1.0f);
                l65Var.f130196T0.setVisibility(0);
                return;
            case 8:
                ((sb5) this.f149215b).f207356e = false;
                return;
            case 9:
                w6f imageLoaderColorCallback = ((ArtworkView) this.f149215b).getImageLoaderColorCallback();
                if (imageLoaderColorCallback != null) {
                    ((t96) imageLoaderColorCallback).f218192b.invoke(new c66(null));
                    return;
                }
                return;
            case 10:
                pi6 pi6Var = (pi6) this.f149215b;
                Parcelable parcelable = (Parcelable) pi6Var.f177832X;
                if (parcelable != null && (layoutManager = ((RecyclerView) pi6Var.f177841i).getLayoutManager()) != null) {
                    layoutManager.mo961x0(parcelable);
                }
                pi6Var.f177832X = null;
                return;
            case 11:
                sk6 sk6Var = (sk6) this.f149215b;
                Parcelable parcelable2 = sk6Var.f210028Q0;
                if (parcelable2 != null && (layoutManager2 = sk6Var.f210041i.getLayoutManager()) != null) {
                    layoutManager2.mo961x0(parcelable2);
                }
                sk6Var.f210028Q0 = null;
                return;
            case 12:
                ((m500) this.f149215b).finish();
                return;
            case 13:
                pqm0 pqm0Var = (pqm0) this.f149215b;
                hv31 hv31Var = (hv31) pqm0Var.f180351b;
                fv31 fv31Var = jt7.f115745e;
                int iMo48717l = hv31Var.mo48717l(fv31Var, 0) + 1;
                lv31 lv31VarEdit = ((hv31) pqm0Var.f180351b).edit();
                lv31VarEdit.m60049b(fv31Var, iMo48717l);
                lv31VarEdit.m60055h();
                return;
            case 14:
                r690 r690Var = (r690) this.f149215b;
                rhs rhsVar = r690Var.f196207c;
                fx7 fx7Var = r690Var.f196205a;
                if (r690Var.f196199M0) {
                    if (r690Var.f196204Z) {
                        r690Var.f196204Z = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        fx7Var.f74281e = jCurrentAnimationTimeMillis;
                        fx7Var.f74283g = -1L;
                        fx7Var.f74282f = jCurrentAnimationTimeMillis;
                        fx7Var.f74284h = 0.5f;
                    }
                    if ((fx7Var.f74283g > 0 && AnimationUtils.currentAnimationTimeMillis() > fx7Var.f74283g + ((long) fx7Var.f74285i)) || !r690Var.m74851e()) {
                        r690Var.f196199M0 = false;
                        return;
                    }
                    if (r690Var.f196198L0) {
                        r690Var.f196198L0 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        rhsVar.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (fx7Var.f74282f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM42996a = fx7Var.m42996a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - fx7Var.f74282f;
                    fx7Var.f74282f = jCurrentAnimationTimeMillis2;
                    r690Var.f196201O0.scrollListBy((int) (j * ((fM42996a * 4.0f) + ((-4.0f) * fM42996a * fM42996a)) * fx7Var.f74280d));
                    WeakHashMap weakHashMap2 = mec1.f142677a;
                    rhsVar.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                ((n09) this.f149215b).m63304i();
                return;
            case 16:
                ((k19) this.f149215b).f118255a.m68777c(3);
                return;
            case 17:
                pa9 pa9Var = (pa9) this.f149215b;
                pa9Var.m69453s(null);
                pa9Var.f175440f = null;
                return;
            case 18:
                br9 br9Var = (br9) this.f149215b;
                ViewParent parent = br9Var.getParent();
                ViewManager viewManager = parent instanceof ViewManager ? (ViewManager) parent : null;
                if (viewManager != null) {
                    viewManager.removeView(br9Var);
                    return;
                }
                return;
            case 19:
                o2a o2aVar = (o2a) this.f149215b;
                if (o2aVar.f161004h) {
                    return;
                }
                o2aVar.f161004h = true;
                o2a.m66099a(o2aVar);
                return;
            case 20:
                ((qq8) this.f149215b).f191505b = UnicastSubject.m23812f(1, this).m23811c();
                return;
            case 21:
                qac qacVar = (qac) this.f149215b;
                try {
                    nac.m63982c(qacVar.f186840a, qacVar.f186841b).m92991l(qacVar.f186842c, new fs9(qacVar, i));
                    return;
                } catch (Exception e) {
                    Logger.m3966b("CastBasic->%s", edb.m38564m("initializeCastContext() threw: ", e.getMessage()));
                    qacVar.f186844e.m45754w0(e);
                    return;
                }
            case 22:
                kic kicVar = (kic) this.f149215b;
                xpi0 xpi0Var = (xpi0) kicVar.f122918f;
                int i7 = kicVar.f122914b;
                if (i7 == 0) {
                    return;
                }
                kicVar.f122914b = 0;
                if (kicVar.f122913a != 2) {
                    return;
                }
                int iM38547C = edb.m38547C(i7);
                if (iM38547C == 0) {
                    kicVar.m56483e(kicVar.m56479a(xpi0Var.m91707c()));
                    return;
                }
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                aq6 aq6Var2 = (aq6) kicVar.f122916d;
                if (aq6Var2 != null && kicVar.m56480b(aq6Var2)) {
                    aq6Var = aq6Var2;
                }
                kicVar.m56483e(kicVar.m56482d(aq6Var, xpi0Var));
                return;
            case 23:
                ((CircularVideoPreviewView) this.f149215b).f3762a.setVisibility(8);
                return;
            case 24:
                efe efeVar = (efe) this.f149215b;
                ((z9j0) efeVar.f59031b).mo47346g(((qee) efeVar.f59032c).f187912a);
                return;
            case 25:
                ((twy) this.f149215b).reset();
                return;
            case 26:
                vte vteVar = (vte) this.f149215b;
                vteVar.f244617a.release();
                EGLDisplay eGLDisplay2 = vteVar.f244618b;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(vteVar.f244618b, vteVar.f244620d);
                EGL14.eglDestroyContext(vteVar.f244618b, vteVar.f244619c);
                EGL14.eglTerminate(vteVar.f244618b);
                vteVar.f244621e.quitSafely();
                return;
            case 27:
                zte zteVar = (zte) this.f149215b;
                LinkedHashMap linkedHashMap = zteVar.f286146d;
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((xte) it2.next()).m92012a(null);
                }
                linkedHashMap.clear();
                zteVar.f286147e = null;
                vte vteVar2 = zteVar.f286148f;
                if (vteVar2 != null) {
                    vteVar2.release();
                }
                zteVar.f286148f = null;
                return;
            case 28:
                ((eue) this.f149215b).m40059e(false);
                return;
            default:
                ((q3c) this.f149215b).invoke();
                return;
        }
    }
}
