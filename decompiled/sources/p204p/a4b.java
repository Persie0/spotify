package p204p;

import com.spotify.storage.localstorage.CacheMovingWorkerImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class a4b extends ibk {

    /* JADX INFO: renamed from: a */
    public long f12179a;

    /* JADX INFO: renamed from: b */
    public ovy f12180b;

    /* JADX INFO: renamed from: c */
    public ktj0 f12181c;

    /* JADX INFO: renamed from: d */
    public a4i0 f12182d;

    /* JADX INFO: renamed from: e */
    public int f12183e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f12184f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CacheMovingWorkerImpl f12185g;

    /* JADX INFO: renamed from: h */
    public int f12186h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4b(CacheMovingWorkerImpl cacheMovingWorkerImpl, ibk ibkVar) {
        super(ibkVar);
        this.f12185g = cacheMovingWorkerImpl;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12184f = obj;
        this.f12186h |= Integer.MIN_VALUE;
        return CacheMovingWorkerImpl.m21609i(this.f12185g, 0L, null, this);
    }
}
