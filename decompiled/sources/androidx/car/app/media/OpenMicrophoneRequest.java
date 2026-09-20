package androidx.car.app.media;

import java.util.Objects;
import p204p.rzb;
import p204p.uol0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    public OpenMicrophoneRequest(uol0 uol0Var) {
        this.mCarAudioCallbackDelegate = uol0Var.f232487a;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
