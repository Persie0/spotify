package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class laq extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f131385a;

    /* JADX INFO: renamed from: b */
    public boolean f131386b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f131387c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ maq f131388d;

    /* JADX INFO: renamed from: e */
    public int f131389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laq(maq maqVar, ibk ibkVar) {
        super(ibkVar);
        this.f131388d = maqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131387c = obj;
        this.f131389e |= Integer.MIN_VALUE;
        return this.f131388d.m61322b(false, this);
    }
}
