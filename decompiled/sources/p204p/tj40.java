package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class tj40 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220827a;

    public /* synthetic */ tj40(int i) {
        this.f220827a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f220827a) {
            case 0:
                AtomicBoolean atomicBoolean = uj40.f230894a;
                Context contextM69343a = p8y.m69343a();
                fk40 fk40Var = fk40.f70466a;
                Object objM41876i = null;
                if (!p2l.f173365a.contains(fk40.class)) {
                    try {
                        objM41876i = fk40.f70466a.m41876i(contextM69343a, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
                    } catch (Throwable th) {
                        p2l.m68953a(fk40.class, th);
                    }
                }
                uj40.f230900g = objM41876i;
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.f220827a;
    }

    /* JADX INFO: renamed from: b */
    private final void m80968b(ComponentName componentName) {
    }

    /* JADX INFO: renamed from: c */
    private final void m80969c(ComponentName componentName) {
    }

    /* JADX INFO: renamed from: a */
    private final void m80967a(ComponentName componentName, IBinder iBinder) {
    }
}
