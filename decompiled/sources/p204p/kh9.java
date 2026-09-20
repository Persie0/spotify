package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kh9 extends ibk {

    /* JADX INFO: renamed from: a */
    public opz0 f122553a;

    /* JADX INFO: renamed from: b */
    public int f122554b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f122555c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lh9 f122556d;

    /* JADX INFO: renamed from: e */
    public int f122557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh9(lh9 lh9Var, ibk ibkVar) {
        super(ibkVar);
        this.f122556d = lh9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122555c = obj;
        this.f122557e |= Integer.MIN_VALUE;
        return this.f122556d.mo39812a(this);
    }
}
