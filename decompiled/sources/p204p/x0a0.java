package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public y430 f256840a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f256841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l1a0 f256842c;

    /* JADX INFO: renamed from: d */
    public int f256843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0a0(l1a0 l1a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f256842c = l1a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256841b = obj;
        this.f256843d |= Integer.MIN_VALUE;
        return l1a0.m57866a(this.f256842c, null, this);
    }
}
