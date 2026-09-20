package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47411a;

    /* JADX INFO: renamed from: b */
    public int f47412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f47413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f47413c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47411a = obj;
        this.f47412b |= Integer.MIN_VALUE;
        return this.f47413c.emit(null, this);
    }
}
