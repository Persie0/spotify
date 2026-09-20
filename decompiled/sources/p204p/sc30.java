package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public c9k f207637a;

    /* JADX INFO: renamed from: b */
    public luu0 f207638b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f207639c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xc30 f207640d;

    /* JADX INFO: renamed from: e */
    public int f207641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc30(xc30 xc30Var, ibk ibkVar) {
        super(ibkVar);
        this.f207640d = xc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f207639c = obj;
        this.f207641e |= Integer.MIN_VALUE;
        return this.f207640d.m90345e(this);
    }
}
