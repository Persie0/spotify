package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gr01 extends ibk {

    /* JADX INFO: renamed from: a */
    public hr01 f83592a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f83593b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ onz0 f83594c;

    /* JADX INFO: renamed from: d */
    public int f83595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr01(onz0 onz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f83594c = onz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f83593b = obj;
        this.f83595d |= Integer.MIN_VALUE;
        return this.f83594c.m67445o(null, this);
    }
}
