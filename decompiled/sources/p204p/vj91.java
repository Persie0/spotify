package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vj91 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f241926a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f241927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ck91 f241928c;

    /* JADX INFO: renamed from: d */
    public int f241929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj91(ck91 ck91Var, ibk ibkVar) {
        super(ibkVar);
        this.f241928c = ck91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241927b = obj;
        this.f241929d |= Integer.MIN_VALUE;
        return ck91.m33105a(this.f241928c, null, this);
    }
}
