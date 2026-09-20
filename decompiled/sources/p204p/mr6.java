package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class mr6 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146434a;

    /* JADX INFO: renamed from: b */
    public final Object f146435b;

    /* JADX INFO: renamed from: c */
    public final Object f146436c;

    public /* synthetic */ mr6(int i, Object obj, Object obj2) {
        this.f146434a = i;
        this.f146435b = obj;
        this.f146436c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public IBinder m62623a() {
        if (((AtomicBoolean) this.f146435b).compareAndSet(false, true)) {
            return (IBinder) ((LinkedBlockingDeque) this.f146436c).take();
        }
        throw new IllegalStateException("Binder already consumed");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        sx30 sx30Var;
        cy30 cy30Var;
        Boolean boolValueOf;
        cy30 cy30Var2 = null;
        g2f1 g2f1Var = null;
        switch (this.f146434a) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) this.f146436c).put(iBinder);
                        return;
                    } catch (InterruptedException unused) {
                        p8y p8yVar = p8y.f175080a;
                        return;
                    }
                }
                return;
            case 1:
                sef0 sef0Var = (sef0) this.f146436c;
                guf gufVar = (guf) this.f146435b;
                int i = rx30.f203480a;
                if (iBinder == null) {
                    sx30Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(sx30.f214799j);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof sx30)) {
                        qx30 qx30Var = new qx30();
                        qx30Var.f193467a = iBinder;
                        sx30Var = qx30Var;
                    } else {
                        sx30Var = (sx30) iInterfaceQueryLocalInterface;
                    }
                }
                gufVar.m38797k0(sx30Var);
                sef0Var.f208286c = iBinder;
                if (iBinder != null) {
                    iBinder.linkToDeath((ybd0) sef0Var.f208287d, 0);
                }
                zv41 zv41Var = (zv41) sef0Var.f208288e;
                Boolean bool = Boolean.TRUE;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                return;
            case 2:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.f146435b;
                if (observableEmitter.isDisposed()) {
                    return;
                }
                ((fus0) this.f146436c).getClass();
                int i2 = by30.f32054a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.msc.sa.aidl.ISAService");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof cy30)) {
                        ay30 ay30Var = new ay30();
                        ay30Var.f21083a = iBinder;
                        cy30Var2 = ay30Var;
                    } else {
                        cy30Var = (cy30) iInterfaceQueryLocalInterface2;
                    }
                }
                if (cy30Var2 == null) {
                    cy30Var2 = cy30Var;
                    observableEmitter.tryOnError(new Exception("Failed to create ISAService"));
                }
                cy30Var2 = cy30Var;
                observableEmitter.onNext(cy30Var2);
                return;
            case 3:
                Context context = (Context) this.f146436c;
                SingleEmitter singleEmitter = (SingleEmitter) ((kkc1) this.f146435b).f123567b;
                try {
                    boolValueOf = Boolean.valueOf(((dy30) ey30.m40287C(iBinder)).m37316v1());
                } catch (RemoteException unused2) {
                    boolValueOf = Boolean.FALSE;
                } finally {
                    singleEmitter.onSuccess(Boolean.FALSE);
                    context.unbindService(this);
                }
                singleEmitter.onSuccess(boolValueOf);
                return;
            default:
                if (componentName != null) {
                    q1f1 q1f1Var = (q1f1) this.f146435b;
                    String str = (String) this.f146436c;
                    LinkedHashMap linkedHashMap = q1f1Var.f184313a;
                    String packageName = componentName.getPackageName();
                    int i3 = n6r.f150940l;
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.ravelin.core.IDeviceIdInterface");
                        if (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof g2f1)) {
                            s1f1 s1f1Var = new s1f1();
                            s1f1Var.f204709a = iBinder;
                            g2f1Var = s1f1Var;
                        } else {
                            g2f1Var = (g2f1) iInterfaceQueryLocalInterface3;
                        }
                    }
                    p1f1 p1f1Var = new p1f1();
                    p1f1Var.f173064a = this;
                    p1f1Var.f173065b = g2f1Var;
                    p1f1Var.f173066c = true;
                    linkedHashMap.put(packageName, p1f1Var);
                    String str2 = q1f1.f184312b;
                    String name = Thread.currentThread().getName();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    StringBuilder sbM38573v = edb.m38573v("***Debug service connection bound to ", str, " on ", name, " at ");
                    sbM38573v.append(jCurrentTimeMillis);
                    String string = sbM38573v.toString();
                    utu0 utu0Var = gk71.f80747a;
                    utu0Var.m83940H(str2);
                    utu0Var.m83952u(string, new Object[0]);
                    return;
                }
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f146434a) {
            case 0:
                break;
            case 1:
                zv41 zv41Var = (zv41) ((sef0) this.f146436c).f208288e;
                Boolean bool = Boolean.FALSE;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                break;
            case 2:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.f146435b;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onComplete();
                }
                break;
            case 3:
                break;
            default:
                if (componentName != null) {
                    LinkedHashMap linkedHashMap = ((q1f1) this.f146435b).f184313a;
                    String str = (String) this.f146436c;
                    p1f1 p1f1Var = (p1f1) linkedHashMap.get(str);
                    if (p1f1Var != null) {
                        p1f1Var.f173065b = null;
                        p1f1Var.f173066c = false;
                    }
                    String str2 = q1f1.f184312b;
                    String strM38564m = edb.m38564m("***Debug service connection unbinding for ", str);
                    utu0 utu0Var = gk71.f80747a;
                    utu0Var.m83940H(str2);
                    utu0Var.m83952u(strM38564m, new Object[0]);
                }
                break;
        }
    }

    public mr6(fus0 fus0Var, ObservableEmitter observableEmitter) {
        this.f146434a = 2;
        this.f146436c = fus0Var;
        this.f146435b = observableEmitter;
    }

    public mr6() {
        this.f146434a = 0;
        this.f146435b = new AtomicBoolean(false);
        this.f146436c = new LinkedBlockingDeque();
    }

    /* JADX INFO: renamed from: b */
    private final void m62621b(ComponentName componentName) {
    }

    /* JADX INFO: renamed from: c */
    private final void m62622c(ComponentName componentName) {
    }
}
