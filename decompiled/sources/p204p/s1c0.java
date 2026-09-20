package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s1c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204680a;

    /* JADX INFO: renamed from: b */
    public int f204681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t1c0 f204682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1c0(t1c0 t1c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f204682c = t1c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204680a = obj;
        this.f204681b |= Integer.MIN_VALUE;
        return this.f204682c.mo15629a(null, null, this);
    }
}
