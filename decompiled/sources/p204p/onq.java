package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class onq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f167314a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n90 f167315b;

    /* JADX INFO: renamed from: c */
    public int f167316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onq(n90 n90Var, ibk ibkVar) {
        super(ibkVar);
        this.f167315b = n90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167314a = obj;
        this.f167316c |= Integer.MIN_VALUE;
        return this.f167315b.m63870a(null, null, this);
    }
}
