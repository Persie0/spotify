package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class u040 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f225383b;

    public /* synthetic */ u040(ObservableEmitter observableEmitter, int i) {
        this.f225382a = i;
        this.f225383b = observableEmitter;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f225382a) {
            case 0:
                this.f225383b.onNext(xul0.m92200a((q040) obj));
                break;
            default:
                q040 q040Var = (q040) obj;
                if (q040Var != null) {
                    this.f225383b.onNext(new tmm0(q040Var.f183901a, q040Var.f183902b.m86091c(), 4));
                }
                break;
        }
    }
}
