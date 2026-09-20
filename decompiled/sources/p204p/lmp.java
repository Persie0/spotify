package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lmp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134996a;

    /* JADX INFO: renamed from: b */
    public int f134997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f134998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f134998c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134996a = obj;
        this.f134997b |= Integer.MIN_VALUE;
        return this.f134998c.emit(null, this);
    }
}
