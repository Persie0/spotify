package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: classes9.dex */
public final class idp0 implements FlowableTransformer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f101199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Scheduler f101200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xre f101201c;

    public idp0(long j, Scheduler scheduler, xre xreVar) {
        this.f101199a = j;
        this.f101200b = scheduler;
        this.f101201c = xreVar;
    }

    @Override // io.reactivex.rxjava3.core.FlowableTransformer
    /* JADX INFO: renamed from: a */
    public final i7t0 mo23362a(Flowable flowable) {
        Flowable flowableM23343X = flowable.m23343X(new iqb0(this.f101199a, this.f101200b, this.f101201c, 1));
        flowableM23343X.getClass();
        return flowableM23343X.m23356t(Functions.f7225a);
    }
}
