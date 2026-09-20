package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zwo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f287015a;

    /* JADX INFO: renamed from: b */
    public int f287016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f287017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f287017c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f287015a = obj;
        this.f287016b |= Integer.MIN_VALUE;
        return this.f287017c.emit(null, this);
    }
}
