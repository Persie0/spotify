package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes9.dex */
public final class ib80 implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f100469b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gb80 f100470c;

    public /* synthetic */ ib80(ObservableEmitter observableEmitter, gb80 gb80Var, int i) {
        this.f100468a = i;
        this.f100469b = observableEmitter;
        this.f100470c = gb80Var;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        switch (this.f100468a) {
            case 0:
                ObservableEmitter observableEmitter = this.f100469b;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(this.f100470c.mo31987b());
                }
                break;
            default:
                ObservableEmitter observableEmitter2 = this.f100469b;
                if (!observableEmitter2.isDisposed()) {
                    observableEmitter2.onNext(this.f100470c.mo31987b());
                }
                break;
        }
    }
}
