package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class j1p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107812a;

    /* JADX INFO: renamed from: b */
    public int f107813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f107814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f107814c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107812a = obj;
        this.f107813b |= Integer.MIN_VALUE;
        return this.f107814c.emit(null, this);
    }
}
