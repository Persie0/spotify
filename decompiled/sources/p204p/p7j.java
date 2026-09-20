package p204p;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class p7j extends ibk {

    /* JADX INFO: renamed from: a */
    public ConstraintTrackingWorker f174702a;

    /* JADX INFO: renamed from: b */
    public f890 f174703b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f174704c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ConstraintTrackingWorker f174705d;

    /* JADX INFO: renamed from: e */
    public int f174706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7j(ConstraintTrackingWorker constraintTrackingWorker, ibk ibkVar) {
        super(ibkVar);
        this.f174705d = constraintTrackingWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174704c = obj;
        this.f174706e |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.m1169j(this.f174705d, this);
    }
}
