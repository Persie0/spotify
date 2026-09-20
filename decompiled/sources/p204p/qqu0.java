package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qqu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yqu0 f191655b;

    /* JADX INFO: renamed from: c */
    public int f191656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqu0(yqu0 yqu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f191655b = yqu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191654a = obj;
        this.f191656c |= Integer.MIN_VALUE;
        return this.f191655b.m94396b(null, this);
    }
}
