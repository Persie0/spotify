package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lr81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qr81 f136241b;

    /* JADX INFO: renamed from: c */
    public int f136242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr81(qr81 qr81Var, ibk ibkVar) {
        super(ibkVar);
        this.f136241b = qr81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136240a = obj;
        this.f136242c |= Integer.MIN_VALUE;
        return qr81.m73607d(this.f136241b, null, this);
    }
}
