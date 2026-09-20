package p204p;

import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterClearer;

/* JADX INFO: loaded from: classes6.dex */
public final class m7v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EngageRecommendationsClusterClearer f140844b;

    /* JADX INFO: renamed from: c */
    public int f140845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7v(EngageRecommendationsClusterClearer engageRecommendationsClusterClearer, ibk ibkVar) {
        super(ibkVar);
        this.f140844b = engageRecommendationsClusterClearer;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140843a = obj;
        this.f140845c |= Integer.MIN_VALUE;
        return this.f140844b.mo6805k(null, this);
    }
}
