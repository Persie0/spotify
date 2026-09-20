package p204p;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class eue {

    /* JADX INFO: renamed from: a */
    public final iac1 f62954a;

    /* JADX INFO: renamed from: d */
    public ln9 f62957d;

    /* JADX INFO: renamed from: e */
    public VideoSurfaceView f62958e;

    /* JADX INFO: renamed from: f */
    public SurfaceHolder f62959f;

    /* JADX INFO: renamed from: g */
    public due f62960g;

    /* JADX INFO: renamed from: h */
    public boolean f62961h;

    /* JADX INFO: renamed from: b */
    public final Handler f62955b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f62956c = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final cue f62962i = new cue(this);

    public eue(iac1 iac1Var) {
        this.f62954a = iac1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m40055a() {
        SurfaceHolder surfaceHolder;
        due dueVar = this.f62960g;
        if (dueVar != null && (surfaceHolder = this.f62959f) != null) {
            surfaceHolder.removeCallback(dueVar);
        }
        this.f62960g = null;
        this.f62959f = null;
        this.f62958e = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m40056b(VideoSurfaceView videoSurfaceView) {
        LinkedHashMap linkedHashMap = this.f62956c;
        if (linkedHashMap.containsKey(videoSurfaceView)) {
            return;
        }
        bue bueVar = new bue(this, videoSurfaceView);
        linkedHashMap.put(videoSurfaceView, bueVar);
        videoSurfaceView.addOnLayoutChangeListener(bueVar.f31126b);
        videoSurfaceView.getViewTreeObserver().addOnScrollChangedListener(bueVar.f31127c);
    }

    /* JADX INFO: renamed from: c */
    public final void m40057c(ln9 ln9Var) {
        q3c q3cVar = new q3c(25, this, ln9Var);
        if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            q3cVar.invoke();
        } else {
            this.f62955b.post(new n10(q3cVar, 29));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m40058d(VideoSurfaceView videoSurfaceView) {
        bue bueVar = (bue) this.f62956c.remove(videoSurfaceView);
        if (bueVar != null) {
            VideoSurfaceView videoSurfaceView2 = bueVar.f31125a;
            videoSurfaceView2.removeOnLayoutChangeListener(bueVar.f31126b);
            ViewTreeObserver viewTreeObserver = videoSurfaceView2.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(bueVar.f31127c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX INFO: renamed from: e */
    public final void m40059e(boolean z) {
        Object next;
        VideoSurfaceView videoSurfaceView;
        SurfaceView f3060c;
        if (this.f62961h) {
            ArrayList arrayList = this.f62954a.f100219b;
            fue fueVar = fue.f73472h;
            ArrayList<VideoSurfaceView> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((VideoSurfaceView) obj).getSupportsSurfaceView()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
            for (VideoSurfaceView videoSurfaceView2 : arrayList2) {
                arrayList3.add(new pqm0(videoSurfaceView2, fueVar.invoke(videoSurfaceView2)));
            }
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((pqm0) next).f180351b).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((pqm0) next2).f180351b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            pqm0 pqm0Var = (pqm0) next;
            if (pqm0Var == null) {
                videoSurfaceView = null;
            } else {
                if (((Number) pqm0Var.f180351b).intValue() <= 0) {
                    pqm0Var = null;
                }
                if (pqm0Var != null) {
                    videoSurfaceView = (VideoSurfaceView) pqm0Var.f180350a;
                } else {
                    videoSurfaceView = null;
                }
            }
            if (videoSurfaceView != this.f62958e || this.f62959f == null) {
                m40055a();
                this.f62958e = videoSurfaceView;
                SurfaceHolder holder = (videoSurfaceView == null || (f3060c = videoSurfaceView.getF3060c()) == null) ? null : f3060c.getHolder();
                if (holder == null) {
                    ln9 ln9Var = this.f62957d;
                    if (ln9Var != null) {
                        ln9Var.m59488s(null);
                    }
                    if (videoSurfaceView == null || !z) {
                        return;
                    }
                    this.f62955b.post(new n10(this, 28));
                    return;
                }
                due dueVar = new due(this);
                this.f62959f = holder;
                this.f62960g = dueVar;
                holder.addCallback(dueVar);
                ln9 ln9Var2 = this.f62957d;
                if (ln9Var2 != null) {
                    Surface surface = holder.getSurface();
                    ln9Var2.m59488s(surface.isValid() ? surface : null);
                }
            }
        }
    }
}
