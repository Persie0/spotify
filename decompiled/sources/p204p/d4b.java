package p204p;

import com.spotify.storage.localstorage.CacheMovingWorkerImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class d4b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45124a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CacheMovingWorkerImpl f45125b;

    /* JADX INFO: renamed from: c */
    public int f45126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4b(CacheMovingWorkerImpl cacheMovingWorkerImpl, ibk ibkVar) {
        super(ibkVar);
        this.f45125b = cacheMovingWorkerImpl;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45124a = obj;
        this.f45126c |= Integer.MIN_VALUE;
        return this.f45125b.m21611k(this);
    }
}
