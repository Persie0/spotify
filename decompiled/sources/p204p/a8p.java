package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a8p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13335a;

    /* JADX INFO: renamed from: b */
    public int f13336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f13337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f13337c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13335a = obj;
        this.f13336b |= Integer.MIN_VALUE;
        return this.f13337c.emit(null, this);
    }
}
