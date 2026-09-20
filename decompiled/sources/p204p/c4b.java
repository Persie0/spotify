package p204p;

import com.spotify.storage.localstorage.CacheMovingWorkerImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class c4b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CacheMovingWorkerImpl f33902b;

    /* JADX INFO: renamed from: c */
    public int f33903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4b(CacheMovingWorkerImpl cacheMovingWorkerImpl, ibk ibkVar) {
        super(ibkVar);
        this.f33902b = cacheMovingWorkerImpl;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33901a = obj;
        this.f33903c |= Integer.MIN_VALUE;
        return this.f33902b.mo750f(this);
    }
}
