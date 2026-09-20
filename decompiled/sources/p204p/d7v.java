package p204p;

import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterPublisher;

/* JADX INFO: loaded from: classes6.dex */
public final class d7v extends ibk {

    /* JADX INFO: renamed from: a */
    public Exception f46276a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f46277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EngageContinuationClusterPublisher f46278c;

    /* JADX INFO: renamed from: d */
    public int f46279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7v(EngageContinuationClusterPublisher engageContinuationClusterPublisher, ibk ibkVar) {
        super(ibkVar);
        this.f46278c = engageContinuationClusterPublisher;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46277b = obj;
        this.f46279d |= Integer.MIN_VALUE;
        return this.f46278c.mo6805k(null, this);
    }
}
