package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e470 f33861b;

    /* JADX INFO: renamed from: c */
    public int f33862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c470(e470 e470Var, ibk ibkVar) {
        super(ibkVar);
        this.f33861b = e470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33860a = obj;
        this.f33862c |= Integer.MIN_VALUE;
        return this.f33861b.m37763f(null, this);
    }
}
