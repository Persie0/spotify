package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g9u0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f77877a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f77878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i9u0 f77879c;

    /* JADX INFO: renamed from: d */
    public int f77880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9u0(i9u0 i9u0Var, ibk ibkVar) {
        super(ibkVar);
        this.f77879c = i9u0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77878b = obj;
        this.f77880d |= Integer.MIN_VALUE;
        return i9u0.m49991e(this.f77879c, null, this);
    }
}
