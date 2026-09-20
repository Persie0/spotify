package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mmb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145115a;

    /* JADX INFO: renamed from: b */
    public int f145116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f145117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f145117c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145115a = obj;
        this.f145116b |= Integer.MIN_VALUE;
        return this.f145117c.emit(null, this);
    }
}
