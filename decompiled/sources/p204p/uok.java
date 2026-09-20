package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f232449a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f232450b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f232451c;

    /* JADX INFO: renamed from: d */
    public int f232452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f232451c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232450b = obj;
        this.f232452d |= Integer.MIN_VALUE;
        return this.f232451c.m30129D(null, this);
    }
}
