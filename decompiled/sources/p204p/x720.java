package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x720 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258792a;

    /* JADX INFO: renamed from: b */
    public int f258793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f258794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x720(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f258794c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258792a = obj;
        this.f258793b |= Integer.MIN_VALUE;
        return this.f258794c.emit(null, this);
    }
}
