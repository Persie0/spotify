package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u2p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226126a;

    /* JADX INFO: renamed from: b */
    public int f226127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f226128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f226128c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226126a = obj;
        this.f226127b |= Integer.MIN_VALUE;
        return this.f226128c.emit(null, this);
    }
}
