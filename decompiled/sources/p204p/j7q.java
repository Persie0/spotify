package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j7q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k7q f109648b;

    /* JADX INFO: renamed from: c */
    public int f109649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7q(k7q k7qVar, ibk ibkVar) {
        super(ibkVar);
        this.f109648b = k7qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109647a = obj;
        this.f109649c |= Integer.MIN_VALUE;
        Object objM55696b = this.f109648b.m55696b(null, this, false);
        return objM55696b == yuk.f276404a ? objM55696b : new s6x0(objM55696b);
    }
}
