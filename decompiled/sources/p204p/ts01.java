package p204p;

import com.spotify.share.housekeeping.impl.ShareHousekeepingWorkerImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class ts01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223183a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShareHousekeepingWorkerImpl f223184b;

    /* JADX INFO: renamed from: c */
    public int f223185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts01(ShareHousekeepingWorkerImpl shareHousekeepingWorkerImpl, ibk ibkVar) {
        super(ibkVar);
        this.f223184b = shareHousekeepingWorkerImpl;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223183a = obj;
        this.f223185c |= Integer.MIN_VALUE;
        return this.f223184b.mo750f(this);
    }
}
