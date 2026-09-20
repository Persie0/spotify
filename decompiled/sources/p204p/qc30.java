package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187245a;

    /* JADX INFO: renamed from: b */
    public int f187246b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f187247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f187247c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187245a = obj;
        this.f187246b |= Integer.MIN_VALUE;
        return this.f187247c.emit(null, this);
    }
}
