package p204p;

import android.bluetooth.BluetoothAdapter;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes.dex */
public final class kc8 {

    /* JADX INFO: renamed from: a */
    public final j3a f121400a;

    /* JADX INFO: renamed from: b */
    public final cej0 f121401b;

    public kc8(j3a j3aVar, cej0 cej0Var) {
        this.f121400a = j3aVar;
        this.f121401b = cej0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m56018a() {
        j3a j3aVar = this.f121400a;
        Observable map = j3aVar.f108327d.filter(s0o0.f204452Y).map(t0o0.f215930X);
        BluetoothAdapter bluetoothAdapter = j3aVar.f108325b.f214795a;
        Observable observableDistinctUntilChanged = map.startWithItem(Boolean.valueOf(bluetoothAdapter != null ? bluetoothAdapter.isEnabled() : false)).distinctUntilChanged();
        cej0 cej0Var = this.f121401b;
        return Observable.combineLatest(observableDistinctUntilChanged, cej0Var.f37142d.distinctUntilChanged().startWithItem(Boolean.valueOf(cej0Var.m32585a())).distinctUntilChanged(), d7f0.f46149T0);
    }
}
