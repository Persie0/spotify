package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fal0 f280826b;

    /* JADX INFO: renamed from: c */
    public int f280827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9l0(fal0 fal0Var, ibk ibkVar) {
        super(ibkVar);
        this.f280826b = fal0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280825a = obj;
        this.f280827c |= Integer.MIN_VALUE;
        return this.f280826b.m41182b(this);
    }
}
