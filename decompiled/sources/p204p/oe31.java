package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oe31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f164334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue31 f164335b;

    /* JADX INFO: renamed from: c */
    public int f164336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f164335b = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164334a = obj;
        this.f164336c |= Integer.MIN_VALUE;
        return this.f164335b.m82881e(null, this);
    }
}
