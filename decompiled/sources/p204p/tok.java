package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f222276a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f222277b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f222278c;

    /* JADX INFO: renamed from: d */
    public int f222279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f222278c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222277b = obj;
        this.f222279d |= Integer.MIN_VALUE;
        return this.f222278c.m30128C(null, this);
    }
}
