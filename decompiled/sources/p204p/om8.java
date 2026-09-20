package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class om8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m47 f166990b;

    /* JADX INFO: renamed from: c */
    public int f166991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om8(m47 m47Var, ibk ibkVar) {
        super(ibkVar);
        this.f166990b = m47Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166989a = obj;
        this.f166991c |= Integer.MIN_VALUE;
        return this.f166990b.m60781p(this);
    }
}
