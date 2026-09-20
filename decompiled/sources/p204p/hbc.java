package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nbc f89475b;

    /* JADX INFO: renamed from: c */
    public int f89476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbc(nbc nbcVar, ibk ibkVar) {
        super(ibkVar);
        this.f89475b = nbcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89474a = obj;
        this.f89476c |= Integer.MIN_VALUE;
        return this.f89475b.m64070c(null, this);
    }
}
