package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xe10 extends ibk {

    /* JADX INFO: renamed from: a */
    public mb61 f260609a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f260610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ye10 f260611c;

    /* JADX INFO: renamed from: d */
    public int f260612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe10(ye10 ye10Var, ibk ibkVar) {
        super(ibkVar);
        this.f260611c = ye10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260610b = obj;
        this.f260612d |= Integer.MIN_VALUE;
        return this.f260611c.m93518d(null, null, null, null, this);
    }
}
