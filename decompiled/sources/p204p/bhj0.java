package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bhj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f27198a;

    /* JADX INFO: renamed from: b */
    public String f27199b;

    /* JADX INFO: renamed from: c */
    public String f27200c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f27201d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ chj0 f27202e;

    /* JADX INFO: renamed from: f */
    public int f27203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhj0(chj0 chj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f27202e = chj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27201d = obj;
        this.f27203f |= Integer.MIN_VALUE;
        return this.f27202e.m32796d(null, null, this);
    }
}
