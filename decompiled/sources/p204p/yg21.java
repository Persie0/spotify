package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yg21 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f272455a;

    /* JADX INFO: renamed from: b */
    public Object f272456b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f272457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bh21 f272458d;

    /* JADX INFO: renamed from: e */
    public int f272459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg21(bh21 bh21Var, ibk ibkVar) {
        super(ibkVar);
        this.f272458d = bh21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272457c = obj;
        this.f272459e |= Integer.MIN_VALUE;
        return this.f272458d.m29196h(this);
    }
}
