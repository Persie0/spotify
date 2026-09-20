package p204p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: classes10.dex */
public final class ro50 implements ObservableSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f201082b;

    public ro50(sy9 sy9Var) {
        this.f201081a = 8;
        this.f201082b = sy9Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(Observer observer) {
        switch (this.f201081a) {
            case 0:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 1:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 2:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 3:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 4:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 5:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 6:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            case 7:
                ((Observable) this.f201082b).subscribe(observer);
                break;
            default:
                sy9 sy9Var = (sy9) this.f201082b;
                Context context = sy9Var.f215190a;
                Object systemService = context.getSystemService("bluetooth");
                BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
                BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                if (adapter == null || (Build.VERSION.SDK_INT >= 31 && lzj.m60353c(context, "android.permission.BLUETOOTH_CONNECT") != 0)) {
                    observer.onNext(new qy9(false, null));
                    observer.onComplete();
                } else if (adapter.getProfileConnectionState(2) != 2) {
                    observer.onNext(new qy9(false, null));
                    observer.onComplete();
                } else {
                    sy9Var.f215192c = false;
                    adapter.getProfileProxy(context, new ry9(sy9Var, observer, adapter), 2);
                }
                break;
        }
    }

    public ro50(Observable observable, int i) {
        this.f201081a = i;
        switch (i) {
            case 1:
                this.f201082b = observable.distinctUntilChanged().onErrorReturnItem(Boolean.FALSE).map(t2z.f216667g);
                break;
            case 5:
                this.f201082b = observable.onErrorReturnItem(Boolean.TRUE).distinctUntilChanged().map(fkr0.f70587M0);
                break;
            case 7:
                Boolean bool = Boolean.FALSE;
                this.f201082b = observable.onErrorReturnItem(new jf31(bool, bool)).distinctUntilChanged().map(wnq0.f253239P0);
                break;
            default:
                this.f201082b = observable.onErrorReturnItem(Boolean.TRUE).distinctUntilChanged().map(jsy.f115626g);
                break;
        }
    }

    public ro50(uj81 uj81Var) {
        this.f201081a = 2;
        this.f201082b = k0e1.m54988g(mvl0.m62953p(((k9l0) uj81Var.f230940b).m55838e(ii91.SHUFFLE_SNACKBAR)), dau.f47107a).distinctUntilChanged().map(gyx.f85766T0);
    }

    public ro50(int i, FlowableElementAtSingle flowableElementAtSingle, j331 j331Var) {
        this.f201081a = i;
        switch (i) {
            case 4:
                this.f201082b = flowableElementAtSingle.flatMapObservable(new p0p0(j331Var, 18)).onErrorReturnItem(new sz21(0));
                break;
            default:
                this.f201082b = flowableElementAtSingle.flatMapObservable(new xuk0(j331Var, 11)).onErrorReturnItem(new pz21(0));
                break;
        }
    }

    public ro50(String str, lx21 lx21Var, jx21 jx21Var) {
        this.f201081a = 6;
        i031 i031Var = (i031) jx21Var;
        ObservableRefCount observableRefCountM23778f = i031Var.f97121Y.m23293d(Observable.defer(new vns(i031Var, str, lx21Var, 3))).serialize().replay(1).m23778f();
        this.f201082b = Observable.merge(observableRefCountM23778f.map(olr0.f166881N0).distinctUntilChanged().map(pmr0.f179202N0), observableRefCountM23778f.map(ykq0.f273791O0).distinctUntilChanged().concatMap(zkq0.f283807N0));
    }
}
