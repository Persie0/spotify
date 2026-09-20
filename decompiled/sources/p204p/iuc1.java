package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iuc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ juc1 f105937b;

    /* JADX INFO: renamed from: c */
    public int f105938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuc1(juc1 juc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f105937b = juc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105936a = obj;
        this.f105938c |= Integer.MIN_VALUE;
        return juc1.m54340f(this.f105937b, this);
    }
}
