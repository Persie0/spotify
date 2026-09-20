package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ica0 f47479b;

    /* JADX INFO: renamed from: c */
    public int f47480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dca0(ica0 ica0Var, ibk ibkVar) {
        super(ibkVar);
        this.f47479b = ica0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47478a = obj;
        this.f47480c |= Integer.MIN_VALUE;
        return this.f47479b.m50245c(null, this);
    }
}
