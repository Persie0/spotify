package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bka extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27882a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hka f27883b;

    /* JADX INFO: renamed from: c */
    public int f27884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bka(hka hkaVar, ibk ibkVar) {
        super(ibkVar);
        this.f27883b = hkaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27882a = obj;
        this.f27884c |= Integer.MIN_VALUE;
        return hka.m47750o(this.f27883b, this);
    }
}
