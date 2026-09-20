package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r47 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t47 f195670b;

    /* JADX INFO: renamed from: c */
    public int f195671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r47(t47 t47Var, ibk ibkVar) {
        super(ibkVar);
        this.f195670b = t47Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195669a = obj;
        this.f195671c |= Integer.MIN_VALUE;
        return this.f195670b.m80057a(this);
    }
}
