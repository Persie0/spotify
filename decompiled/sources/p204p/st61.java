package p204p;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class st61 extends ScanCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f213826a;

    public st61(sir0 sir0Var) {
        this.f213826a = sir0Var;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        Logger.m3966b("Tap BLE: Scan failed (errorCode=%d)", Integer.valueOf(i));
        this.f213826a.mo30210A(null);
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        this.f213826a.mo30231j(scanResult);
    }
}
