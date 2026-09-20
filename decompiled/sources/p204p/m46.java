package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m46 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q46 f139848b;

    /* JADX INFO: renamed from: c */
    public int f139849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m46(q46 q46Var, ibk ibkVar) {
        super(ibkVar);
        this.f139848b = q46Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139847a = obj;
        this.f139849c |= Integer.MIN_VALUE;
        return this.f139848b.m72145c(null, this);
    }
}
