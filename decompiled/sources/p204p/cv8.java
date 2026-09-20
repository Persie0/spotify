package p204p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.Connection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cv8 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f42333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv8(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f42333h = i4;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f42333h) {
            case 0:
                fv8 fv8Var = (fv8) this.f78014b;
                x0h1.m89578u(fv8Var.f73729c, null, 0, new lw2((fw8) obj, fv8Var, null, 2), 3);
                return w2a1.f247311a;
            case 1:
                mdv.m61529x((mdv) this.f78014b, (gdv) obj);
                return w2a1.f247311a;
            case 2:
                ow00 ow00Var = (ow00) this.f78014b;
                return (xv41) ow00Var.f170608j.computeIfAbsent((oub) obj, new oid(ow00Var, 3));
            case 3:
                return tk50.m80999a((tk50) this.f78014b, (fbk) obj);
            case 4:
                Set set = (Set) obj;
                wl50 wl50Var = (wl50) this.f78014b;
                ReentrantLock reentrantLock = wl50Var.f252469d;
                reentrantLock.lock();
                try {
                    List listM43728j1 = g6f.m43728j1(wl50Var.f252468c.values());
                    reentrantLock.unlock();
                    Iterator it = listM43728j1.iterator();
                    while (it.hasNext()) {
                        ((hqk0) it.next()).m48295b(set);
                    }
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 5:
                ((vf60) this.f78014b).mo25339j((Throwable) obj);
                return w2a1.f247311a;
            case 6:
                ((Connection) this.f78014b).accept(obj);
                return w2a1.f247311a;
            case 7:
                ((t7w0) this.f78014b).m80251l((rp80) obj);
                return w2a1.f247311a;
            default:
                au11 au11Var = (au11) this.f78014b;
                au11Var.getClass();
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
                au11Var.f19809Y.mo45270b(videoSurfaceView);
                return videoSurfaceView;
        }
    }
}
