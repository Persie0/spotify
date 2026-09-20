package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ul20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231415a;

    /* JADX INFO: renamed from: b */
    public int f231416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f231417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f231417c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231415a = obj;
        this.f231416b |= Integer.MIN_VALUE;
        return this.f231417c.emit(null, this);
    }
}
