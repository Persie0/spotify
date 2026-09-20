package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f7p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66760a;

    /* JADX INFO: renamed from: b */
    public int f66761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f66762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f66762c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66760a = obj;
        this.f66761b |= Integer.MIN_VALUE;
        return this.f66762c.emit(null, this);
    }
}
