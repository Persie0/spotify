package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mr81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qr81 f146450b;

    /* JADX INFO: renamed from: c */
    public int f146451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr81(qr81 qr81Var, ibk ibkVar) {
        super(ibkVar);
        this.f146450b = qr81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146449a = obj;
        this.f146451c |= Integer.MIN_VALUE;
        return qr81.m73608e(this.f146450b, null, this);
    }
}
