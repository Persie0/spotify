package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pr81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qr81 f180530b;

    /* JADX INFO: renamed from: c */
    public int f180531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr81(qr81 qr81Var, ibk ibkVar) {
        super(ibkVar);
        this.f180530b = qr81Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180529a = obj;
        this.f180531c |= Integer.MIN_VALUE;
        return qr81.m73610g(this.f180530b, null, this);
    }
}
