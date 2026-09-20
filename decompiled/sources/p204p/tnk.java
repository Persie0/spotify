package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tnk extends ibk {

    /* JADX INFO: renamed from: a */
    public String f221991a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f221992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f221993c;

    /* JADX INFO: renamed from: d */
    public int f221994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f221993c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221992b = obj;
        this.f221994d |= Integer.MIN_VALUE;
        return this.f221993c.m30137b(null, this);
    }
}
