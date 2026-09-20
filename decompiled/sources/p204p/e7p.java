package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e7p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56968a;

    /* JADX INFO: renamed from: b */
    public int f56969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f56970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f56970c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56968a = obj;
        this.f56969b |= Integer.MIN_VALUE;
        return this.f56970c.emit(null, this);
    }
}
