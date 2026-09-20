package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ui70 extends ibk {

    /* JADX INFO: renamed from: a */
    public xi70 f230609a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f230610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xi70 f230611c;

    /* JADX INFO: renamed from: d */
    public int f230612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui70(xi70 xi70Var, ibk ibkVar) {
        super(ibkVar);
        this.f230611c = xi70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230610b = obj;
        this.f230612d |= Integer.MIN_VALUE;
        return this.f230611c.m91087a(this);
    }
}
