package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f2j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pj70 f65200b;

    /* JADX INFO: renamed from: c */
    public int f65201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2j0(pj70 pj70Var, ibk ibkVar) {
        super(ibkVar);
        this.f65200b = pj70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65199a = obj;
        this.f65201c |= Integer.MIN_VALUE;
        return this.f65200b.m70124b(null, this);
    }
}
