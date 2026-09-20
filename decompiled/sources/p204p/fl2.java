package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fl2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70666a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f70667b;

    /* JADX INFO: renamed from: c */
    public int f70668c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f70667b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70666a = obj;
        this.f70668c |= Integer.MIN_VALUE;
        return this.f70667b.m70240a(null, null, false, null, this);
    }
}
