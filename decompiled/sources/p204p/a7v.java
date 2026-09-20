package p204p;

import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterClearer;

/* JADX INFO: loaded from: classes6.dex */
public final class a7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EngageContinuationClusterClearer f13142b;

    /* JADX INFO: renamed from: c */
    public int f13143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7v(EngageContinuationClusterClearer engageContinuationClusterClearer, ibk ibkVar) {
        super(ibkVar);
        this.f13142b = engageContinuationClusterClearer;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13141a = obj;
        this.f13143c |= Integer.MIN_VALUE;
        return this.f13142b.mo6805k(null, this);
    }
}
