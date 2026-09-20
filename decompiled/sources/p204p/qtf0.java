package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qtf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f192373a;

    /* JADX INFO: renamed from: b */
    public mtf0 f192374b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f192375c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ttf0 f192376d;

    /* JADX INFO: renamed from: e */
    public int f192377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtf0(ttf0 ttf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f192376d = ttf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192375c = obj;
        this.f192377e |= Integer.MIN_VALUE;
        return this.f192376d.m81502a(null, null, this);
    }
}
