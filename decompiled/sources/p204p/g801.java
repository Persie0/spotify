package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class g801 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i801 f77382b;

    /* JADX INFO: renamed from: c */
    public int f77383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g801(i801 i801Var, ibk ibkVar) {
        super(ibkVar);
        this.f77382b = i801Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77381a = obj;
        this.f77383c |= Integer.MIN_VALUE;
        return this.f77382b.m49900b(null, this);
    }
}
