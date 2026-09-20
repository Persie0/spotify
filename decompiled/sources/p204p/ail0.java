package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ail0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16009a;

    /* JADX INFO: renamed from: b */
    public int f16010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bil0 f16011c;

    /* JADX INFO: renamed from: d */
    public bqz0 f16012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ail0(bil0 bil0Var, ibk ibkVar) {
        super(ibkVar);
        this.f16011c = bil0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16009a = obj;
        this.f16010b |= Integer.MIN_VALUE;
        return this.f16011c.mo15629a(null, null, this);
    }
}
