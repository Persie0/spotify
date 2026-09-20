package androidx.car.app;

import java.util.Arrays;
import java.util.concurrent.Executor;
import p204p.edl0;
import p204p.fb80;
import p204p.gb80;

/* JADX INFO: loaded from: classes3.dex */
class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ C0023j this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ gb80 val$lifecycle;
    final /* synthetic */ edl0 val$listener;

    public CarContext$1(C0023j c0023j, gb80 gb80Var, Executor executor, edl0 edl0Var) {
        this.this$0 = c0023j;
        this.val$lifecycle = gb80Var;
        this.val$executor = executor;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.mo31987b().m41223a(fb80.f67752c)) {
            this.val$executor.execute(new RunnableC0021h(1, Arrays.asList(strArr), Arrays.asList(strArr2)));
        }
    }
}
