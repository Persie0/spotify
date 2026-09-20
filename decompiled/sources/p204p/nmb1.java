package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nmb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f155397a;

    /* JADX INFO: renamed from: b */
    public int f155398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f155399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f155399c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f155397a = obj;
        this.f155398b |= Integer.MIN_VALUE;
        return this.f155399c.emit(null, this);
    }
}
