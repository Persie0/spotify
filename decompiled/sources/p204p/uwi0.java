package p204p;

import com.spotify.contentdelivery.mediaprocessing.CreateProcessorResult;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory;
import com.spotify.contentdelivery.mediaprocessing.ProcessingMode;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class uwi0 implements NativeMediaProcessorFactory {

    /* JADX INFO: renamed from: a */
    public NativeMediaProcessorFactory f234661a;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f234662b = new ReentrantLock();

    public uwi0(i4t0 i4t0Var) {
        ((jph0) ((qgy0) i4t0Var.get())).m53953f(new ybi0(this, 13), new w0i0(this, 23));
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory
    public final CreateProcessorResult createProcessor(int i, ProcessingMode processingMode) {
        CreateProcessorResult fail;
        ReentrantLock reentrantLock = this.f234662b;
        reentrantLock.lock();
        try {
            NativeMediaProcessorFactory nativeMediaProcessorFactory = this.f234661a;
            if (nativeMediaProcessorFactory == null || (fail = nativeMediaProcessorFactory.createProcessor(i, processingMode)) == null) {
                fail = new CreateProcessorResult.Fail(0);
            }
            return fail;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory
    public final long getNThis() {
        ReentrantLock reentrantLock = this.f234662b;
        reentrantLock.lock();
        try {
            NativeMediaProcessorFactory nativeMediaProcessorFactory = this.f234661a;
            return nativeMediaProcessorFactory != null ? nativeMediaProcessorFactory.getNThis() : 0L;
        } finally {
            reentrantLock.unlock();
        }
    }
}
