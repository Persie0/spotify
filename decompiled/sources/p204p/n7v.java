package p204p;

import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterPublisher;

/* JADX INFO: loaded from: classes6.dex */
public final class n7v extends ibk {

    /* JADX INFO: renamed from: a */
    public Exception f151222a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f151223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EngageRecommendationsClusterPublisher f151224c;

    /* JADX INFO: renamed from: d */
    public int f151225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7v(EngageRecommendationsClusterPublisher engageRecommendationsClusterPublisher, ibk ibkVar) {
        super(ibkVar);
        this.f151224c = engageRecommendationsClusterPublisher;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151223b = obj;
        this.f151225d |= Integer.MIN_VALUE;
        return this.f151224c.mo6805k(null, this);
    }
}
