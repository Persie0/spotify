package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c2p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d2p0 f33440b;

    /* JADX INFO: renamed from: c */
    public int f33441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2p0(d2p0 d2p0Var, ibk ibkVar) {
        super(ibkVar);
        this.f33440b = d2p0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33439a = obj;
        this.f33441c |= Integer.MIN_VALUE;
        return this.f33440b.m34771j0(this);
    }
}
