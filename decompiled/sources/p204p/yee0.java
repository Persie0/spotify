package p204p;

import io.reactivex.rxjava3.core.FlowableEmitter;

/* JADX INFO: loaded from: classes5.dex */
public final class yee0 implements qwz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FlowableEmitter f271980a;

    public yee0(FlowableEmitter flowableEmitter) {
        this.f271980a = flowableEmitter;
    }

    @Override // p204p.qwz
    /* JADX INFO: renamed from: a */
    public final void mo74096a(uuz uuzVar) {
        this.f271980a.onNext(uuzVar);
    }
}
