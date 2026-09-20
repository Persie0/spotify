package p204p;

import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class dvj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NotificationHandlingQuasarWorker f53472b;

    /* JADX INFO: renamed from: c */
    public int f53473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvj0(NotificationHandlingQuasarWorker notificationHandlingQuasarWorker, ibk ibkVar) {
        super(ibkVar);
        this.f53472b = notificationHandlingQuasarWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53471a = obj;
        this.f53473c |= Integer.MIN_VALUE;
        return this.f53472b.m15978A(this);
    }
}
