package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jbc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nbc f110729b;

    /* JADX INFO: renamed from: c */
    public int f110730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbc(nbc nbcVar, ibk ibkVar) {
        super(ibkVar);
        this.f110729b = nbcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110728a = obj;
        this.f110730c |= Integer.MIN_VALUE;
        return this.f110729b.m64071d(null, this);
    }
}
