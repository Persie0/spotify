package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class znf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284484a;

    /* JADX INFO: renamed from: b */
    public int f284485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f284486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public znf(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f284486c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284484a = obj;
        this.f284485b |= Integer.MIN_VALUE;
        return this.f284486c.emit(null, this);
    }
}
