package p204p;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class o7j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConstraintTrackingWorker f162575b;

    /* JADX INFO: renamed from: c */
    public int f162576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7j(ConstraintTrackingWorker constraintTrackingWorker, ibk ibkVar) {
        super(ibkVar);
        this.f162575b = constraintTrackingWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162574a = obj;
        this.f162576c |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.m1168i(this.f162575b, null, null, null, this);
    }
}
