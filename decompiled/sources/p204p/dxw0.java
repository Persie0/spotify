package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dxw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fxw0 f54111b;

    /* JADX INFO: renamed from: c */
    public int f54112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxw0(fxw0 fxw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f54111b = fxw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54110a = obj;
        this.f54112c |= Integer.MIN_VALUE;
        return fxw0.m43026a(this.f54111b, null, 0, this);
    }
}
