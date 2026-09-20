package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nz80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160036a;

    /* JADX INFO: renamed from: b */
    public int f160037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f160038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f160038c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160036a = obj;
        this.f160037b |= Integer.MIN_VALUE;
        return this.f160038c.emit(null, this);
    }
}
