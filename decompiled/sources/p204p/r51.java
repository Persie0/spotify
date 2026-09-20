package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a61 f195915b;

    /* JADX INFO: renamed from: c */
    public int f195916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r51(a61 a61Var, ibk ibkVar) {
        super(ibkVar);
        this.f195915b = a61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195914a = obj;
        this.f195916c |= Integer.MIN_VALUE;
        return this.f195915b.m24829a(null, null, null, this);
    }
}
