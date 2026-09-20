package p204p;

import com.spotify.remoteconfig.backgroundsync.RemoteConfigBackgroundSyncWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class baw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemoteConfigBackgroundSyncWorker f25355b;

    /* JADX INFO: renamed from: c */
    public int f25356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baw0(RemoteConfigBackgroundSyncWorker remoteConfigBackgroundSyncWorker, ibk ibkVar) {
        super(ibkVar);
        this.f25355b = remoteConfigBackgroundSyncWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25354a = obj;
        this.f25356c |= Integer.MIN_VALUE;
        return this.f25355b.mo6805k(null, this);
    }
}
