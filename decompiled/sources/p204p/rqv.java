package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rqv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uqv f201893b;

    /* JADX INFO: renamed from: c */
    public int f201894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqv(uqv uqvVar, ibk ibkVar) {
        super(ibkVar);
        this.f201893b = uqvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201892a = obj;
        this.f201894c |= Integer.MIN_VALUE;
        return this.f201893b.m83818d(null, null, null, null, this);
    }
}
