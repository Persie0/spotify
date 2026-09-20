package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hob1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93493a;

    /* JADX INFO: renamed from: b */
    public int f93494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f93495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hob1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f93495c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93493a = obj;
        this.f93494b |= Integer.MIN_VALUE;
        return this.f93495c.emit(null, this);
    }
}
