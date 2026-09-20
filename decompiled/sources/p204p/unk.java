package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class unk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bpk f232186b;

    /* JADX INFO: renamed from: c */
    public int f232187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unk(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f232186b = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232185a = obj;
        this.f232187c |= Integer.MIN_VALUE;
        return this.f232186b.m30139d(this);
    }
}
