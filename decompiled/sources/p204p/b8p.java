package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b8p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24630a;

    /* JADX INFO: renamed from: b */
    public int f24631b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f24632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f24632c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24630a = obj;
        this.f24631b |= Integer.MIN_VALUE;
        return this.f24632c.emit(null, this);
    }
}
