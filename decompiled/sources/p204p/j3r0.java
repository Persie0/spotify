package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j3r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f108458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k3r0 f108459b;

    /* JADX INFO: renamed from: c */
    public int f108460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3r0(k3r0 k3r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f108459b = k3r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f108458a = obj;
        this.f108460c |= Integer.MIN_VALUE;
        return this.f108459b.m55283d(this);
    }
}
