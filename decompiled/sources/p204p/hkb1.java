package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hkb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92411a;

    /* JADX INFO: renamed from: b */
    public int f92412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ikb1 f92413c;

    /* JADX INFO: renamed from: d */
    public int f92414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkb1(ikb1 ikb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f92413c = ikb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92411a = obj;
        this.f92412b |= Integer.MIN_VALUE;
        return this.f92413c.mo15629a(null, null, this);
    }
}
