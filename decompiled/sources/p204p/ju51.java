package p204p;

import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class ju51 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FlowableEmitter f116036b;

    public /* synthetic */ ju51(FlowableEmitter flowableEmitter, int i) {
        this.f116035a = i;
        this.f116036b = flowableEmitter;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f116035a) {
            case 0:
                this.f116036b.onNext(obj);
                break;
            default:
                this.f116036b.tryOnError((Throwable) obj);
                break;
        }
    }
}
