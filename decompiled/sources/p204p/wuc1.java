package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wuc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yuc1 f255140b;

    /* JADX INFO: renamed from: c */
    public int f255141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuc1(yuc1 yuc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f255140b = yuc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255139a = obj;
        this.f255141c |= Integer.MIN_VALUE;
        return this.f255140b.m94653i(this);
    }
}
