package p204p;

import com.spotify.eventsender.musicintegration.eventsenderworker.EventSenderWorker;

/* JADX INFO: loaded from: classes6.dex */
public final class i8x extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventSenderWorker f99854b;

    /* JADX INFO: renamed from: c */
    public int f99855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8x(EventSenderWorker eventSenderWorker, ibk ibkVar) {
        super(ibkVar);
        this.f99854b = eventSenderWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99853a = obj;
        this.f99855c |= Integer.MIN_VALUE;
        return this.f99854b.mo6805k(null, this);
    }
}
