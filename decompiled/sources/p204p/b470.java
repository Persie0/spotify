package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b470 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e470 f23240b;

    /* JADX INFO: renamed from: c */
    public int f23241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b470(e470 e470Var, ibk ibkVar) {
        super(ibkVar);
        this.f23240b = e470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23239a = obj;
        this.f23241c |= Integer.MIN_VALUE;
        return this.f23240b.m37762e(this);
    }
}
