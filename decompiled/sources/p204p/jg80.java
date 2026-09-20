package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jg80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f112105a;

    /* JADX INFO: renamed from: b */
    public int f112106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f112107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f112107c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112105a = obj;
        this.f112106b |= Integer.MIN_VALUE;
        return this.f112107c.emit(null, this);
    }
}
