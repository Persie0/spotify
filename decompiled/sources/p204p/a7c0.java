package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a7c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public i6c0 f13019a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f13020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7c0 f13021c;

    /* JADX INFO: renamed from: d */
    public int f13022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7c0(f7c0 f7c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f13021c = f7c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13020b = obj;
        this.f13022d |= Integer.MIN_VALUE;
        return f7c0.m40961a(this.f13021c, null, this);
    }
}
