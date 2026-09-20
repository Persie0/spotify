package p204p;

import com.spotify.ondemandtrials.configimpl.OnDemandTrialFetchEndWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class f9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnDemandTrialFetchEndWorker f67297b;

    /* JADX INFO: renamed from: c */
    public int f67298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9l0(OnDemandTrialFetchEndWorker onDemandTrialFetchEndWorker, ibk ibkVar) {
        super(ibkVar);
        this.f67297b = onDemandTrialFetchEndWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67296a = obj;
        this.f67298c |= Integer.MIN_VALUE;
        return this.f67297b.mo750f(this);
    }
}
