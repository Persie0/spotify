package p204p;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class x2a extends ScanCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z2a f257401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f257402b;

    public x2a(z2a z2aVar, ObservableEmitter observableEmitter) {
        this.f257401a = z2aVar;
        this.f257402b = observableEmitter;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        super.onBatchScanResults(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z2a.m95179a(this.f257401a, this.f257402b, (ScanResult) it.next());
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.f257402b.onNext(r2a.f195091a);
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        z2a.m95179a(this.f257401a, this.f257402b, scanResult);
    }
}
