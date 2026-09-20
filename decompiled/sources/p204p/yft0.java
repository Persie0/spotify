package p204p;

import com.spotify.notifications.notifications.workers.PushTokenSyncQuasarWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class yft0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PushTokenSyncQuasarWorker f272329b;

    /* JADX INFO: renamed from: c */
    public int f272330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yft0(PushTokenSyncQuasarWorker pushTokenSyncQuasarWorker, ibk ibkVar) {
        super(ibkVar);
        this.f272329b = pushTokenSyncQuasarWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272328a = obj;
        this.f272330c |= Integer.MIN_VALUE;
        return this.f272329b.m15980A(this);
    }
}
