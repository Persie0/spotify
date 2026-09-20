package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ecx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ djs0 f58407b;

    /* JADX INFO: renamed from: c */
    public int f58408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecx0(djs0 djs0Var, ibk ibkVar) {
        super(ibkVar);
        this.f58407b = djs0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58406a = obj;
        this.f58408c |= Integer.MIN_VALUE;
        return this.f58407b.m36222m(null, null, null, this);
    }
}
