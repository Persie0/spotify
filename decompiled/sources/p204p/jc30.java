package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public gc30 f110946a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f110947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mc30 f110948c;

    /* JADX INFO: renamed from: d */
    public int f110949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc30(mc30 mc30Var, ibk ibkVar) {
        super(ibkVar);
        this.f110948c = mc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110947b = obj;
        this.f110949d |= Integer.MIN_VALUE;
        return mc30.m61437H1(this.f110948c, this);
    }
}
