package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g1r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f75703a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f75704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h1r0 f75705c;

    /* JADX INFO: renamed from: d */
    public int f75706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1r0(h1r0 h1r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f75705c = h1r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75704b = obj;
        this.f75706d |= Integer.MIN_VALUE;
        return this.f75705c.m46465a(null, this);
    }
}
