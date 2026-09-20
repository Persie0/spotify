package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ryu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f203968a;

    /* JADX INFO: renamed from: b */
    public tyu0 f203969b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f203970c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tyu0 f203971d;

    /* JADX INFO: renamed from: e */
    public int f203972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryu0(tyu0 tyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f203971d = tyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203970c = obj;
        this.f203972e |= Integer.MIN_VALUE;
        return this.f203971d.m82011f(this);
    }
}
