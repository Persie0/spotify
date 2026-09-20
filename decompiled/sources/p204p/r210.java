package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f195010b;

    /* JADX INFO: renamed from: c */
    public int f195011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r210(x210 x210Var, ibk ibkVar) {
        super(ibkVar);
        this.f195010b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195009a = obj;
        this.f195011c |= Integer.MIN_VALUE;
        return this.f195010b.m89699b(null, this);
    }
}
