package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qj1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189125a;

    /* JADX INFO: renamed from: b */
    public int f189126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f189127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj1(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f189127c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189125a = obj;
        this.f189126b |= Integer.MIN_VALUE;
        return this.f189127c.emit(null, this);
    }
}
