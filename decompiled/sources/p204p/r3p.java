package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r3p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195534a;

    /* JADX INFO: renamed from: b */
    public int f195535b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f195536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f195536c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195534a = obj;
        this.f195535b |= Integer.MIN_VALUE;
        return this.f195536c.emit(null, this);
    }
}
