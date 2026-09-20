package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l0p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128483a;

    /* JADX INFO: renamed from: b */
    public int f128484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f128485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f128485c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128483a = obj;
        this.f128484b |= Integer.MIN_VALUE;
        return this.f128485c.emit(null, this);
    }
}
