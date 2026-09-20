package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.AbstractC0042f;
import p204p.gb80;
import p204p.sew0;
import p204p.zg71;

/* JADX INFO: loaded from: classes3.dex */
class NavigationManager$1 extends INavigationManager.Stub {
    final /* synthetic */ C0034b this$0;
    final /* synthetic */ gb80 val$lifecycle;

    public NavigationManager$1(C0034b c0034b, gb80 gb80Var) {
        this.this$0 = c0034b;
        this.val$lifecycle = gb80Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onStopNavigation$0() {
        this.this$0.getClass();
        zg71.m96049a();
        return null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
        AbstractC0042f.m246c(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new sew0() { // from class: androidx.car.app.navigation.a
            @Override // p204p.sew0
            /* JADX INFO: renamed from: b */
            public final Object mo205b() {
                return this.f462a.lambda$onStopNavigation$0();
            }
        });
    }
}
