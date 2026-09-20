package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class asc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19387a;

    /* JADX INFO: renamed from: b */
    public int f19388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oox f19389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asc0(oox ooxVar, fbk fbkVar) {
        super(fbkVar);
        this.f19389c = ooxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19387a = obj;
        this.f19388b |= Integer.MIN_VALUE;
        return this.f19389c.emit(null, this);
    }
}
