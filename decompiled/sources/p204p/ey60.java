package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ey60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63968a;

    /* JADX INFO: renamed from: b */
    public int f63969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fy60 f63970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey60(fy60 fy60Var, ibk ibkVar) {
        super(ibkVar);
        this.f63970c = fy60Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63968a = obj;
        this.f63969b |= Integer.MIN_VALUE;
        return this.f63970c.mo15629a(null, null, this);
    }
}
