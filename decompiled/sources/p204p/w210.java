package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x210 f247206b;

    /* JADX INFO: renamed from: c */
    public int f247207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w210(x210 x210Var, ibk ibkVar) {
        super(ibkVar);
        this.f247206b = x210Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247205a = obj;
        this.f247207c |= Integer.MIN_VALUE;
        return this.f247206b.m89704i(null, this);
    }
}
