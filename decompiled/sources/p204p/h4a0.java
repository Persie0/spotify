package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j4a0 f87478b;

    /* JADX INFO: renamed from: c */
    public int f87479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4a0(j4a0 j4a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f87478b = j4a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87477a = obj;
        this.f87479c |= Integer.MIN_VALUE;
        return this.f87478b.m52332a(null, this);
    }
}
