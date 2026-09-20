package p204p;

import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;

/* JADX INFO: loaded from: classes5.dex */
public final class l3l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public nlv0 f129343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f129344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ OfflineSyncWorker f129345c;

    /* JADX INFO: renamed from: d */
    public int f129346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3l0(OfflineSyncWorker offlineSyncWorker, ibk ibkVar) {
        super(ibkVar);
        this.f129345c = offlineSyncWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129344b = obj;
        this.f129346d |= Integer.MIN_VALUE;
        return this.f129345c.m6804A(this);
    }
}
