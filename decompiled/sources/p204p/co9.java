package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class co9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ go9 f40208b;

    /* JADX INFO: renamed from: c */
    public int f40209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co9(go9 go9Var, ibk ibkVar) {
        super(ibkVar);
        this.f40208b = go9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40207a = obj;
        this.f40209c |= Integer.MIN_VALUE;
        return go9.m45327b(this.f40208b, null, this);
    }
}
