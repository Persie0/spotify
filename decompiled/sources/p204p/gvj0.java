package p204p;

import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;

/* JADX INFO: loaded from: classes8.dex */
public final class gvj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public sr4 f84764a;

    /* JADX INFO: renamed from: b */
    public Long f84765b;

    /* JADX INFO: renamed from: c */
    public gh00 f84766c;

    /* JADX INFO: renamed from: d */
    public rlv0 f84767d;

    /* JADX INFO: renamed from: e */
    public rlv0 f84768e;

    /* JADX INFO: renamed from: f */
    public Throwable f84769f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f84770g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ NotificationHandlingQuasarWorker f84771h;

    /* JADX INFO: renamed from: i */
    public int f84772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvj0(NotificationHandlingQuasarWorker notificationHandlingQuasarWorker, ibk ibkVar) {
        super(ibkVar);
        this.f84771h = notificationHandlingQuasarWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84770g = obj;
        this.f84772i |= Integer.MIN_VALUE;
        return this.f84771h.m15979B(null, null, null, null, this);
    }
}
