package p204p;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.spotify.coremediarenderer.videosinkimpl.NativeVideoSinkImpl;
import com.spotify.coremediarenderer.videosinkimpl.PlaybackRegistrationListener;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public final class zte implements PlaybackRegistrationListener, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final eue f286143a;

    /* JADX INFO: renamed from: b */
    public final tte f286144b;

    /* JADX INFO: renamed from: e */
    public Surface f286147e;

    /* JADX INFO: renamed from: f */
    public vte f286148f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f286149g;

    /* JADX INFO: renamed from: c */
    public final Handler f286145c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f286146d = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final ln9 f286150h = new ln9(this, 10);

    public zte(eue eueVar, tte tteVar, zi5 zi5Var) {
        this.f286143a = eueVar;
        this.f286144b = tteVar;
        NativeVideoSinkImpl.nativeSetPlaybackRegistrationListener(this);
    }

    /* JADX INFO: renamed from: a */
    public final Surface m96905a() {
        Surface surface = this.f286147e;
        if (surface != null) {
            return surface;
        }
        vte vteVar = this.f286148f;
        if (vteVar != null) {
            return vteVar;
        }
        int i = vte.f244616g;
        HandlerThread handlerThread = new HandlerThread("CmrPlaceholderSurface");
        handlerThread.start();
        rlv0 rlv0Var = new rlv0();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(handlerThread.getLooper()).post(new bz1(rlv0Var, handlerThread, countDownLatch, 5));
        countDownLatch.await();
        if (rlv0Var.f200373a == null) {
            handlerThread.quitSafely();
        }
        vte vteVar2 = (vte) rlv0Var.f200373a;
        this.f286148f = vteVar2;
        return vteVar2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f286149g) {
            return;
        }
        this.f286149g = true;
        this.f286144b.getClass();
        NativeVideoSinkImpl.nativeSetPlaybackRegistrationListener(null);
        this.f286143a.m40057c(null);
        this.f286145c.post(new n10(this, 27));
    }

    @Override // com.spotify.coremediarenderer.videosinkimpl.PlaybackRegistrationListener
    public final void onPlaybackRegistered(String str, String str2, String str3, String str4, String str5) {
        this.f286145c.post(new yte(this, str, str2, str3, str4, str5, 0));
    }

    @Override // com.spotify.coremediarenderer.videosinkimpl.PlaybackRegistrationListener
    public final void onPlaybackUnregistered(String str) {
        this.f286145c.post(new lk00(10, this, str));
    }
}
