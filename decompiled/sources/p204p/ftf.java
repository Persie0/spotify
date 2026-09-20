package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ftf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f73205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gtf f73206b;

    /* JADX INFO: renamed from: c */
    public int f73207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftf(gtf gtfVar, ibk ibkVar) {
        super(ibkVar);
        this.f73206b = gtfVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73205a = obj;
        this.f73207c |= Integer.MIN_VALUE;
        return this.f73206b.m45693d(null, this);
    }
}
