package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class t9m extends ibk {

    /* JADX INFO: renamed from: a */
    public xf11 f218329a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f218330b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u9m f218331c;

    /* JADX INFO: renamed from: d */
    public int f218332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9m(u9m u9mVar, ibk ibkVar) {
        super(ibkVar);
        this.f218331c = u9mVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218330b = obj;
        this.f218332d |= Integer.MIN_VALUE;
        return this.f218331c.m82649g(0.0f, 0.0f, this);
    }
}
