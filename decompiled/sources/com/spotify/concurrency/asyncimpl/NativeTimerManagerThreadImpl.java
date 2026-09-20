package com.spotify.concurrency.asyncimpl;

import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.concurrency.async.Scheduler;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SignalCommand;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0096 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0011\u0010\u0004R$\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00188Ö\u0001X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/concurrency/asyncimpl/NativeTimerManagerThreadImpl;", "Lcom/spotify/concurrency/async/NativeTimerManagerThread;", "Lcom/spotify/concurrency/async/Scheduler;", "<init>", "()V", "Lp/w2a1;", "destroy", "Ljava/lang/Runnable;", "callback", "runBlocking", "(Ljava/lang/Runnable;)V", "post", "", SignalCommand.ENDPOINT_NAME, "kill", "(I)V", "start", ContextTrack.TrackAction.STOP, "", "value", "nThis", "J", "getNThis", "()J", "", "isCurrentThread", "Z", "()Z", "Companion", "src_main_java_com_spotify_concurrency_asyncimpl-asyncimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeTimerManagerThreadImpl implements NativeTimerManagerThread, Scheduler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isCurrentThread;
    private long nThis;

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 ¨\u0006\b"}, m24212d2 = {"Lcom/spotify/concurrency/asyncimpl/NativeTimerManagerThreadImpl$Companion;", "", "<init>", "()V", "create", "Lcom/spotify/concurrency/asyncimpl/NativeTimerManagerThreadImpl;", "threadName", "", "src_main_java_com_spotify_concurrency_asyncimpl-asyncimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeTimerManagerThreadImpl create(String threadName) {
            return NativeTimerManagerThreadImpl.create(threadName);
        }

        private Companion() {
        }
    }

    private NativeTimerManagerThreadImpl() {
    }

    public static final native NativeTimerManagerThreadImpl create(String str);

    @Override // com.spotify.concurrency.async.NativeTimerManagerThread
    public native void destroy();

    @Override // com.spotify.concurrency.async.NativeTimerManagerThread
    public long getNThis() {
        return this.nThis;
    }

    @Override // com.spotify.concurrency.async.Scheduler
    public native boolean isCurrentThread();

    @Override // com.spotify.concurrency.async.Scheduler
    public native void kill(int signal);

    @Override // com.spotify.concurrency.async.Scheduler
    public native void post(Runnable callback);

    @Override // com.spotify.concurrency.async.Scheduler
    public void runBlocking(final Runnable callback) {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        if (isCurrentThread()) {
            throw new RuntimeException("Not allowed to run blocking task on core thread from the core thread.");
        }
        final Exception[] excArr = new Exception[1];
        post(new Runnable() { // from class: com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl.runBlocking.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    callback.run();
                } catch (Exception e) {
                    excArr[0] = e;
                }
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e2) {
                    throw new IllegalStateException("Interrupted exception awaiting barrier (on core thread)", e2);
                } catch (BrokenBarrierException e3) {
                    throw new IllegalStateException("Broken barrier exception awaiting barrier (on core thread)", e3);
                }
            }
        });
        try {
            cyclicBarrier.await();
            if (excArr[0] != null) {
                throw new IllegalStateException("Callback to NativeTimerManagerThreadImpl.run(...) threw", excArr[0]);
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted exception awaiting barrier", e);
        } catch (BrokenBarrierException e2) {
            throw new IllegalStateException("Broken barrier exception awaiting barrier", e2);
        }
    }

    public final native void start();

    public final native void stop();
}
