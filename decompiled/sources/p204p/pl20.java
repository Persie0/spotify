package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pl20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178614a;

    /* JADX INFO: renamed from: b */
    public int f178615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f178616c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f178616c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178614a = obj;
        this.f178615b |= Integer.MIN_VALUE;
        return this.f178616c.emit(null, this);
    }
}
