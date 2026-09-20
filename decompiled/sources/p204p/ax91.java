package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ax91 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f20813a;

    /* JADX INFO: renamed from: b */
    public int f20814b;

    /* JADX INFO: renamed from: c */
    public int f20815c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20816d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bx91 f20817e;

    /* JADX INFO: renamed from: f */
    public int f20818f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax91(bx91 bx91Var, ibk ibkVar) {
        super(ibkVar);
        this.f20817e = bx91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20816d = obj;
        this.f20818f |= Integer.MIN_VALUE;
        return this.f20817e.m30767c(0, null, this);
    }
}
