package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z871 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d971 f280398b;

    /* JADX INFO: renamed from: c */
    public int f280399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z871(d971 d971Var, ibk ibkVar) {
        super(ibkVar);
        this.f280398b = d971Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280397a = obj;
        this.f280399c |= Integer.MIN_VALUE;
        return this.f280398b.m35341s(this);
    }
}
