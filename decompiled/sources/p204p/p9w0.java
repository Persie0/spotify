package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p9w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f175317a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f175318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q9w0 f175319c;

    /* JADX INFO: renamed from: d */
    public int f175320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9w0(q9w0 q9w0Var, ibk ibkVar) {
        super(ibkVar);
        this.f175319c = q9w0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175318b = obj;
        this.f175320d |= Integer.MIN_VALUE;
        return this.f175319c.m72409a(0, this);
    }
}
