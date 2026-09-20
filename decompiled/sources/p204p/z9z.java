package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z9z extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ baz f280934b;

    /* JADX INFO: renamed from: c */
    public int f280935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9z(baz bazVar, ibk ibkVar) {
        super(ibkVar);
        this.f280934b = bazVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280933a = obj;
        this.f280935c |= Integer.MIN_VALUE;
        return baz.m28601b(this.f280934b, this);
    }
}
