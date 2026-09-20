package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ct51 extends ibk {

    /* JADX INFO: renamed from: a */
    public izx0 f41779a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f41780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dt51 f41781c;

    /* JADX INFO: renamed from: d */
    public int f41782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct51(dt51 dt51Var, ibk ibkVar) {
        super(ibkVar);
        this.f41781c = dt51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41780b = obj;
        this.f41782d |= Integer.MIN_VALUE;
        return this.f41781c.m36805b(this);
    }
}
