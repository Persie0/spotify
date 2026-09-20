package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w690 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248288a;

    /* JADX INFO: renamed from: b */
    public int f248289b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f248290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w690(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f248290c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248288a = obj;
        this.f248289b |= Integer.MIN_VALUE;
        return this.f248290c.emit(null, this);
    }
}
