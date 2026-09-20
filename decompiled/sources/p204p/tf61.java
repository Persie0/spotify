package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tf61 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f219862a;

    /* JADX INFO: renamed from: b */
    public int f219863b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f219864c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uf61 f219865d;

    /* JADX INFO: renamed from: e */
    public int f219866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf61(uf61 uf61Var, ibk ibkVar) {
        super(ibkVar);
        this.f219865d = uf61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219864c = obj;
        this.f219866e |= Integer.MIN_VALUE;
        return uf61.m82953a(this.f219865d, 0, this);
    }
}
