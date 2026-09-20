package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yvb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276639a;

    /* JADX INFO: renamed from: b */
    public int f276640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f276641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f276641c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276639a = obj;
        this.f276640b |= Integer.MIN_VALUE;
        return this.f276641c.emit(null, this);
    }
}
