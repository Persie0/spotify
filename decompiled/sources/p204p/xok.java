package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f264293a;

    /* JADX INFO: renamed from: b */
    public String f264294b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f264295c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bpk f264296d;

    /* JADX INFO: renamed from: e */
    public int f264297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f264296d = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f264295c = obj;
        this.f264297e |= Integer.MIN_VALUE;
        return this.f264296d.m30132G(null, null, this);
    }
}
