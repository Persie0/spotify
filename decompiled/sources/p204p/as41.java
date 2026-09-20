package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class as41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v1a f19296b;

    /* JADX INFO: renamed from: c */
    public int f19297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as41(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f19296b = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19295a = obj;
        this.f19297c |= Integer.MIN_VALUE;
        return this.f19296b.m84455b(0, this);
    }
}
