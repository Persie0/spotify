package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f801 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66822a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i801 f66823b;

    /* JADX INFO: renamed from: c */
    public int f66824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f801(i801 i801Var, ibk ibkVar) {
        super(ibkVar);
        this.f66823b = i801Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66822a = obj;
        this.f66824c |= Integer.MIN_VALUE;
        return this.f66823b.m49899a(null, this);
    }
}
