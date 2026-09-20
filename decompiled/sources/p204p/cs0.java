package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ es0 f41428b;

    /* JADX INFO: renamed from: c */
    public int f41429c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(es0 es0Var, ibk ibkVar) {
        super(ibkVar);
        this.f41428b = es0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41427a = obj;
        this.f41429c |= Integer.MIN_VALUE;
        return this.f41428b.m39853c(this);
    }
}
