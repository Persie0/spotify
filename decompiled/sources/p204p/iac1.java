package p204p;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class iac1 {

    /* JADX INFO: renamed from: a */
    public final ay1 f100218a = new ay1(this, 24);

    /* JADX INFO: renamed from: b */
    public final ArrayList f100219b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f100220c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f100221d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public boolean f100222e;

    /* JADX INFO: renamed from: f */
    public boolean f100223f;

    /* JADX INFO: renamed from: g */
    public boolean f100224g;

    /* JADX INFO: renamed from: a */
    public static final void m50049a(iac1 iac1Var, VideoSurfaceView videoSurfaceView, SurfaceHolder surfaceHolder, boolean z) {
        gac1 gac1Var = (gac1) iac1Var.f100221d.get(videoSurfaceView);
        if ((gac1Var != null ? gac1Var.m44154b() : null) == surfaceHolder) {
            SurfaceView f3060c = videoSurfaceView.getF3060c();
            if ((f3060c != null ? f3060c.getHolder() : null) == surfaceHolder && gac1Var.m44155c() != z) {
                gac1Var.m44156d(z);
                iac1Var.m50053e(videoSurfaceView);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m50050b(VideoSurfaceView videoSurfaceView) {
        ArrayList arrayList = this.f100219b;
        if (arrayList.contains(videoSurfaceView)) {
            return;
        }
        arrayList.add(0, videoSurfaceView);
        if (arrayList.size() > 1) {
            j6f.m52572d0(arrayList, new fd11(20));
        }
        videoSurfaceView.setUseExoPlayerSubtitleViewStyling(this.f100224g);
        if (this.f100222e) {
            videoSurfaceView.setUseSurfaceView(this.f100223f);
        }
        m50054f(videoSurfaceView);
        LinkedHashSet linkedHashSet = this.f100220c;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((fac1) it.next()).mo33898a(videoSurfaceView);
            arrayList2.add(w2a1.f247311a);
        }
        videoSurfaceView.setOnPredicateChangedListener(new rg41(this, 22));
        videoSurfaceView.addOnAttachStateChangeListener(this.f100218a);
    }

    /* JADX INFO: renamed from: c */
    public final VideoSurfaceView m50051c(yzo0 yzo0Var) {
        Object next;
        boolean zMo29657f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f100219b) {
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
            boolean z = videoSurfaceView.useSurfaceView;
            if (!(z && videoSurfaceView.f3060c == null) && (z || videoSurfaceView.f3056a != null)) {
                cvo0 cvo0Var = videoSurfaceView.f3070h;
                zMo29657f = cvo0Var != null ? cvo0Var.mo29657f(yzo0Var) : true;
            } else {
                zMo29657f = false;
            }
            if (zMo29657f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m50052d((VideoSurfaceView) next));
        VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) next;
        return videoSurfaceView2 == null ? (VideoSurfaceView) g6f.m43745s0(arrayList) : videoSurfaceView2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m50052d(VideoSurfaceView videoSurfaceView) {
        SurfaceView f3060c = videoSurfaceView.getF3060c();
        SurfaceHolder holder = f3060c != null ? f3060c.getHolder() : null;
        gac1 gac1Var = (gac1) this.f100221d.get(videoSurfaceView);
        if (gac1Var == null) {
            return true;
        }
        gac1 gac1Var2 = gac1Var.m44154b() == holder ? gac1Var : null;
        if (gac1Var2 != null) {
            return gac1Var2.m44155c();
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m50053e(VideoSurfaceView videoSurfaceView) {
        if (videoSurfaceView != null) {
            LinkedHashSet linkedHashSet = this.f100220c;
            ArrayList arrayList = new ArrayList(i6f.m49804T(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((fac1) it.next()).mo33899b();
                arrayList.add(w2a1.f247311a);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m50054f(VideoSurfaceView videoSurfaceView) {
        SurfaceHolder holder;
        SurfaceView f3060c = videoSurfaceView.getF3060c();
        if (f3060c == null || (holder = f3060c.getHolder()) == null) {
            return;
        }
        hac1 hac1Var = new hac1(this, videoSurfaceView);
        Surface surface = holder.getSurface();
        boolean z = false;
        if (surface != null && surface.isValid()) {
            z = true;
        }
        this.f100221d.put(videoSurfaceView, new gac1(holder, hac1Var, z));
        holder.addCallback(hac1Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m50055g(VideoSurfaceView videoSurfaceView) {
        if (this.f100219b.remove(videoSurfaceView)) {
            gac1 gac1Var = (gac1) this.f100221d.remove(videoSurfaceView);
            if (gac1Var != null) {
                gac1Var.m44154b().removeCallback(gac1Var.m44153a());
            }
            videoSurfaceView.setOnPredicateChangedListener(null);
            videoSurfaceView.removeOnAttachStateChangeListener(this.f100218a);
            LinkedHashSet linkedHashSet = this.f100220c;
            ArrayList arrayList = new ArrayList(i6f.m49804T(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((fac1) it.next()).mo33900c(videoSurfaceView);
                arrayList.add(w2a1.f247311a);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m50056h(boolean z) {
        if (this.f100222e && this.f100223f == z) {
            return;
        }
        this.f100222e = true;
        this.f100223f = z;
        for (VideoSurfaceView videoSurfaceView : g6f.m43728j1(this.f100219b)) {
            boolean zM50052d = m50052d(videoSurfaceView);
            gac1 gac1Var = (gac1) this.f100221d.remove(videoSurfaceView);
            if (gac1Var != null) {
                gac1Var.m44154b().removeCallback(gac1Var.m44153a());
            }
            videoSurfaceView.setUseSurfaceView(z);
            m50054f(videoSurfaceView);
            if (zM50052d != m50052d(videoSurfaceView)) {
                m50053e(videoSurfaceView);
            }
        }
    }
}
