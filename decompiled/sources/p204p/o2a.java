package p204p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class o2a implements h3a {

    /* JADX INFO: renamed from: L0 */
    public final iwr f160992L0;

    /* JADX INFO: renamed from: M0 */
    public final iwr f160993M0;

    /* JADX INFO: renamed from: X */
    public final BehaviorSubject f160994X;

    /* JADX INFO: renamed from: Y */
    public final BehaviorSubject f160995Y;

    /* JADX INFO: renamed from: Z */
    public final PublishSubject f160996Z;

    /* JADX INFO: renamed from: a */
    public final z2a f160997a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f160998b;

    /* JADX INFO: renamed from: c */
    public final int f160999c;

    /* JADX INFO: renamed from: d */
    public final boolean f161000d;

    /* JADX INFO: renamed from: e */
    public final int f161001e;

    /* JADX INFO: renamed from: f */
    public final boolean f161002f;

    /* JADX INFO: renamed from: g */
    public final Set f161003g = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: h */
    public boolean f161004h = true;

    /* JADX INFO: renamed from: i */
    public final r12 f161005i = new r12(this, 1);

    /* JADX INFO: renamed from: t */
    public final PublishSubject f161006t;

    public o2a(z2a z2aVar, Scheduler scheduler, int i, boolean z, int i2, boolean z2) {
        this.f160997a = z2aVar;
        this.f160998b = scheduler;
        this.f160999c = i;
        this.f161000d = z;
        this.f161001e = i2;
        this.f161002f = z2;
        PublishSubject publishSubject = new PublishSubject();
        this.f161006t = publishSubject;
        gbu gbuVar = gbu.f78413a;
        BehaviorSubject behaviorSubjectM23796g = BehaviorSubject.m23796g(gbuVar);
        this.f160994X = behaviorSubjectM23796g;
        this.f160995Y = BehaviorSubject.m23796g(h2a.f86935a);
        this.f160996Z = new PublishSubject();
        this.f160992L0 = new iwr();
        this.f160993M0 = new iwr();
        publishSubject.observeOn(scheduler).scan(gbuVar, d7f0.f46150U0).distinctUntilChanged().subscribeOn(scheduler).subscribe(behaviorSubjectM23796g);
    }

    /* JADX INFO: renamed from: a */
    public static final void m66099a(o2a o2aVar) {
        if (o2aVar.f161000d) {
            BehaviorSubject behaviorSubject = o2aVar.f160995Y;
            if (behaviorSubject == null) {
                behaviorSubject = null;
            }
            if (wj50.m88271j(behaviorSubject != null ? (j2a) behaviorSubject.m23798h() : null, i2a.f97782a)) {
                o2aVar.m66105g();
                o2aVar.m66104f();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m66100c(eh00 eh00Var) {
        if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            eh00Var.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new zu3(eh00Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66101b() {
        if (!this.f161003g.contains("social_radar")) {
            na6.m63957e("Identifier social_radar must have been previously enabled in order to cancel a scan request with it!");
        } else {
            this.f161006t.onNext(new k2a());
        }
    }

    /* JADX INFO: renamed from: d */
    public final Observable m66102d() {
        if (!this.f161003g.contains("social_radar")) {
            na6.m63957e("Identifier social_radar must have been previously enabled in order to be notified of scanned devices with it!");
            return Observable.empty();
        }
        return this.f160996Z.withLatestFrom(this.f160994X, zp7.f284965L0).subscribeOn(this.f160998b).filter(new on3(2)).map(pqa.f180216L0);
    }

    /* JADX INFO: renamed from: e */
    public final Observable m66103e() {
        if (this.f161003g.contains("social_radar")) {
            return Observable.combineLatest(this.f160994X, this.f160995Y, new so3(this, 2)).subscribeOn(this.f160998b).distinctUntilChanged((BiPredicate) e8f.f57171Y);
        }
        na6.m63957e("Identifier social_radar must have been previously enabled in order to monitor the scanning events with it!");
        return Observable.empty();
    }

    /* JADX INFO: renamed from: f */
    public final void m66104f() {
        Observable observableCreate;
        int iM38547C;
        boolean z = false;
        boolean z2 = this.f161000d && !this.f161004h;
        int i = 3;
        if (!z2 && (iM38547C = edb.m38547C(this.f160999c)) != 0) {
            if (iM38547C != 1) {
                i = 2;
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 1;
            }
        }
        long j = z2 ? ((long) this.f161001e) * 5000 : 0L;
        z2a z2aVar = this.f160997a;
        BluetoothAdapter bluetoothAdapter = z2aVar.f278521a;
        if (bluetoothAdapter != null ? bluetoothAdapter.isEnabled() : false) {
            if (Build.VERSION.SDK_INT >= 31 && z2aVar.f278522b.checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0) {
                z = true;
            }
            if (!z) {
                observableCreate = Observable.just(s2a.f204941a);
                wj50.m88279p(observableCreate);
            } else if (z2aVar.f278527g != null) {
                observableCreate = Observable.just(p2a.f173305a);
                wj50.m88279p(observableCreate);
            } else {
                observableCreate = Observable.create(new y2a(z2aVar, i, j));
            }
        } else {
            observableCreate = Observable.just(q2a.f184569a);
            wj50.m88279p(observableCreate);
        }
        this.f160993M0.m51848b(observableCreate.doOnNext(new cf8(z2aVar, 10)).observeOn(this.f160998b).subscribe(new C2428tu(this, 14), new fh8(this, 2)));
        this.f160995Y.onNext(i2a.f97782a);
    }

    /* JADX INFO: renamed from: g */
    public final void m66105g() {
        BluetoothLeScanner bluetoothLeScanner;
        z2a z2aVar = this.f160997a;
        if (z2aVar.f278527g != null) {
            BluetoothAdapter bluetoothAdapter = z2aVar.f278521a;
            if (bluetoothAdapter != null && bluetoothAdapter.getState() == 12 && (bluetoothLeScanner = (BluetoothLeScanner) z2aVar.f278526f.getValue()) != null) {
                bluetoothLeScanner.stopScan(z2aVar.f278527g);
            }
            z2aVar.f278527g = null;
        }
        this.f160993M0.m51847a();
        this.f160995Y.onNext(h2a.f86935a);
    }

    @Override // p204p.h3a
    public final void start() {
        if (this.f161002f) {
            this.f160992L0.m51848b(this.f160994X.withLatestFrom(this.f160995Y, z9h1.f280794X).subscribeOn(this.f160998b).subscribe(new fh8(this, 1)));
            m66100c(new bj9(this, 11));
        }
    }

    @Override // p204p.h3a
    public final void stop() {
        if (this.f161002f) {
            m66100c(new f30(this, 29));
            this.f160992L0.m51847a();
            this.f161006t.onNext(l2a.f128954a);
            m66105g();
        }
    }
}
