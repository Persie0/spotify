package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f205677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a61 f205678b;

    /* JADX INFO: renamed from: c */
    public int f205679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(a61 a61Var, ibk ibkVar) {
        super(ibkVar);
        this.f205678b = a61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205677a = obj;
        this.f205679c |= Integer.MIN_VALUE;
        return this.f205678b.m24830b(null, null, null, this);
    }
}
