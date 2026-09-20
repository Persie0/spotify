package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eb41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fb41 f57820b;

    /* JADX INFO: renamed from: c */
    public int f57821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb41(fb41 fb41Var, ibk ibkVar) {
        super(ibkVar);
        this.f57820b = fb41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57819a = obj;
        this.f57821c |= Integer.MIN_VALUE;
        return fb41.m41207a(this.f57820b, this);
    }
}
