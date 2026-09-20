package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z370 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e470 f278808b;

    /* JADX INFO: renamed from: c */
    public int f278809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z370(e470 e470Var, ibk ibkVar) {
        super(ibkVar);
        this.f278808b = e470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278807a = obj;
        this.f278809c |= Integer.MIN_VALUE;
        return this.f278808b.m37760c(null, this);
    }
}
