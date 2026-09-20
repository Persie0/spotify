package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lrb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136254a;

    /* JADX INFO: renamed from: b */
    public int f136255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f136256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f136256c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136254a = obj;
        this.f136255b |= Integer.MIN_VALUE;
        return this.f136256c.emit(null, this);
    }
}
