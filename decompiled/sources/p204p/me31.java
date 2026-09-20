package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class me31 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f142596a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f142597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ue31 f142598c;

    /* JADX INFO: renamed from: d */
    public int f142599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f142598c = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142597b = obj;
        this.f142599d |= Integer.MIN_VALUE;
        return this.f142598c.m82879c(null, null, this);
    }
}
