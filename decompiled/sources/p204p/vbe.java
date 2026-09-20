package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vbe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f239482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xbe f239483b;

    /* JADX INFO: renamed from: c */
    public int f239484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbe(xbe xbeVar, ibk ibkVar) {
        super(ibkVar);
        this.f239483b = xbeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239482a = obj;
        this.f239484c |= Integer.MIN_VALUE;
        return this.f239483b.m90316c(this);
    }
}
