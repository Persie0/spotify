package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b5z0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c5z0 f23794b;

    /* JADX INFO: renamed from: c */
    public int f23795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5z0(c5z0 c5z0Var, ibk ibkVar) {
        super(ibkVar);
        this.f23794b = c5z0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23793a = obj;
        this.f23795c |= Integer.MIN_VALUE;
        return this.f23794b.m31495a(null, this);
    }
}
