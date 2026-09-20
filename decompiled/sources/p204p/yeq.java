package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yeq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272033a;

    /* JADX INFO: renamed from: b */
    public int f272034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ veq f272035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeq(veq veqVar, fbk fbkVar) {
        super(fbkVar);
        this.f272035c = veqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272033a = obj;
        this.f272034b |= Integer.MIN_VALUE;
        return this.f272035c.emit(null, this);
    }
}
