package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kr81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qr81 f125581b;

    /* JADX INFO: renamed from: c */
    public int f125582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr81(qr81 qr81Var, ibk ibkVar) {
        super(ibkVar);
        this.f125581b = qr81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125580a = obj;
        this.f125582c |= Integer.MIN_VALUE;
        return qr81.m73606c(this.f125581b, null, this);
    }
}
