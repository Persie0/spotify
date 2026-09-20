package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bs1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30210a;

    /* JADX INFO: renamed from: b */
    public int f30211b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f30212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs1(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f30212c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f30210a = obj;
        this.f30211b |= Integer.MIN_VALUE;
        return this.f30212c.emit(null, this);
    }
}
