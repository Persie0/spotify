package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ij20 extends ibk {

    /* JADX INFO: renamed from: a */
    public xuk f102673a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f102674b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jj20 f102675c;

    /* JADX INFO: renamed from: d */
    public int f102676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij20(jj20 jj20Var, ibk ibkVar) {
        super(ibkVar);
        this.f102675c = jj20Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102674b = obj;
        this.f102676d |= Integer.MIN_VALUE;
        return this.f102675c.m53493b(null, this);
    }
}
