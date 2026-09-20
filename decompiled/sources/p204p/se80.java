package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class se80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208243a;

    /* JADX INFO: renamed from: b */
    public int f208244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f208245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f208245c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208243a = obj;
        this.f208244b |= Integer.MIN_VALUE;
        return this.f208245c.emit(null, this);
    }
}
