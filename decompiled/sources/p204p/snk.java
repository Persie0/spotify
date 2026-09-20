package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class snk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f210952b;

    /* JADX INFO: renamed from: c */
    public int f210953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f210952b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210951a = obj;
        this.f210953c |= Integer.MIN_VALUE;
        return this.f210952b.m30136a(this);
    }
}
