package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k690 extends ibk {

    /* JADX INFO: renamed from: a */
    public i690 f119696a;

    /* JADX INFO: renamed from: b */
    public sr4 f119697b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f119698c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ m690 f119699d;

    /* JADX INFO: renamed from: e */
    public int f119700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k690(m690 m690Var, ibk ibkVar) {
        super(ibkVar);
        this.f119699d = m690Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119698c = obj;
        this.f119700e |= Integer.MIN_VALUE;
        return this.f119699d.m60976e(null, null, this);
    }
}
