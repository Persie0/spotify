package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class njz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154705a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2470ut f154706b;

    /* JADX INFO: renamed from: c */
    public int f154707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njz(C2470ut c2470ut, fbk fbkVar) {
        super(fbkVar);
        this.f154706b = c2470ut;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154705a = obj;
        this.f154707c |= Integer.MIN_VALUE;
        return this.f154706b.emit(null, this);
    }
}
