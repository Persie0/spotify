package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oqs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f168375a;

    /* JADX INFO: renamed from: b */
    public boolean f168376b;

    /* JADX INFO: renamed from: c */
    public boolean f168377c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f168378d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rqs0 f168379e;

    /* JADX INFO: renamed from: f */
    public int f168380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqs0(rqs0 rqs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f168379e = rqs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168378d = obj;
        this.f168380f |= Integer.MIN_VALUE;
        return this.f168379e.m76264c(null, null, null, false, null, false, this);
    }
}
