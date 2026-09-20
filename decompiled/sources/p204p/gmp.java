package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gmp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f81438a;

    /* JADX INFO: renamed from: b */
    public int f81439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f81440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f81440c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f81438a = obj;
        this.f81439b |= Integer.MIN_VALUE;
        return this.f81440c.emit(null, this);
    }
}
