package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i3r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f98256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k3r0 f98257b;

    /* JADX INFO: renamed from: c */
    public int f98258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3r0(k3r0 k3r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f98257b = k3r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98256a = obj;
        this.f98258c |= Integer.MIN_VALUE;
        return this.f98257b.m55282c(this);
    }
}
