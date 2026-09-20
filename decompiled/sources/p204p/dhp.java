package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dhp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f49136a;

    /* JADX INFO: renamed from: b */
    public int f49137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f49138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f49138c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49136a = obj;
        this.f49137b |= Integer.MIN_VALUE;
        return this.f49138c.emit(null, this);
    }
}
