package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class syu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f215338a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f215339b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tyu0 f215340c;

    /* JADX INFO: renamed from: d */
    public int f215341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syu0(tyu0 tyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f215340c = tyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215339b = obj;
        this.f215341d |= Integer.MIN_VALUE;
        tyu0.m82006a(this.f215340c, this);
        return yuk.f276404a;
    }
}
