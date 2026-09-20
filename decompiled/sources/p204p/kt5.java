package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kt5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f126138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lt5 f126139b;

    /* JADX INFO: renamed from: c */
    public int f126140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt5(lt5 lt5Var, ibk ibkVar) {
        super(ibkVar);
        this.f126139b = lt5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126138a = obj;
        this.f126140c |= Integer.MIN_VALUE;
        return this.f126139b.m59870b(null, this);
    }
}
