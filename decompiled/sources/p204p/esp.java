package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class esp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nsp f62438b;

    /* JADX INFO: renamed from: c */
    public int f62439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esp(nsp nspVar, ibk ibkVar) {
        super(ibkVar);
        this.f62438b = nspVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62437a = obj;
        this.f62439c |= Integer.MIN_VALUE;
        return nsp.m65580a(this.f62438b, this);
    }
}
