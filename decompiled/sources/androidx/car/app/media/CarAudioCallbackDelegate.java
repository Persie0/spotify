package androidx.car.app.media;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import java.util.Objects;
import p204p.oxb;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(oxb oxbVar) {
        this.mCallback = new CarAudioCallbackStub(oxbVar);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static CarAudioCallbackDelegate create(oxb oxbVar) {
        return new CarAudioCallbackDelegate(oxbVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @rzb
    public static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final oxb mCarAudioCallback;

        public CarAudioCallbackStub(oxb oxbVar) {
            this.mCarAudioCallback = oxbVar;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            oxb oxbVar = this.mCarAudioCallback;
            Objects.requireNonNull(oxbVar);
            oxbVar.onStopRecording();
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
