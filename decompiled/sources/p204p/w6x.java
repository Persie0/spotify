package p204p;

import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.eventsender.api.EventSenderCoreBridge;

/* JADX INFO: loaded from: classes.dex */
public final class w6x implements AnalyticsDelegate {

    /* JADX INFO: renamed from: a */
    public final EventSenderCoreBridge f248483a;

    public w6x(EventSenderCoreBridge eventSenderCoreBridge) {
        this.f248483a = eventSenderCoreBridge;
    }

    @Override // com.spotify.connectivity.AnalyticsDelegate
    public final void logEvent(byte[] bArr, byte[] bArr2) {
        this.f248483a.send(bArr, bArr2, null, null);
    }
}
