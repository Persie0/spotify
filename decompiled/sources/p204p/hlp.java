package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hlp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92720a;

    /* JADX INFO: renamed from: b */
    public int f92721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f92722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f92722c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92720a = obj;
        this.f92721b |= Integer.MIN_VALUE;
        return this.f92722c.emit(null, this);
    }
}
