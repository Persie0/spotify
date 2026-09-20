package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class li2 extends ibk {

    /* JADX INFO: renamed from: a */
    public tf60 f133690a;

    /* JADX INFO: renamed from: b */
    public i37 f133691b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f133692c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pi2 f133693d;

    /* JADX INFO: renamed from: e */
    public int f133694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(pi2 pi2Var, fbk fbkVar) {
        super(fbkVar);
        this.f133693d = pi2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133692c = obj;
        this.f133694e |= Integer.MIN_VALUE;
        return pi2.m70067a(this.f133693d, null, null, this);
    }
}
