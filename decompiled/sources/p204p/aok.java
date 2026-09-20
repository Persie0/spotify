package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f17705a;

    /* JADX INFO: renamed from: b */
    public String f17706b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f17707c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bpk f17708d;

    /* JADX INFO: renamed from: e */
    public int f17709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f17708d = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17707c = obj;
        this.f17709e |= Integer.MIN_VALUE;
        return this.f17708d.m30144j(null, null, this);
    }
}
