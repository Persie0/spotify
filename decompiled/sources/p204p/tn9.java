package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tn9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un9 f221909b;

    /* JADX INFO: renamed from: c */
    public int f221910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn9(un9 un9Var, ibk ibkVar) {
        super(ibkVar);
        this.f221909b = un9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221908a = obj;
        this.f221910c |= Integer.MIN_VALUE;
        return this.f221909b.m83537r(null, this);
    }
}
