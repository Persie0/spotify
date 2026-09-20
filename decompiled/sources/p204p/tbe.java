package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tbe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xbe f218832b;

    /* JADX INFO: renamed from: c */
    public int f218833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbe(xbe xbeVar, ibk ibkVar) {
        super(ibkVar);
        this.f218832b = xbeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218831a = obj;
        this.f218833c |= Integer.MIN_VALUE;
        return this.f218832b.m90315b(this);
    }
}
