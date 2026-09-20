package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bkb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27894a;

    /* JADX INFO: renamed from: b */
    public int f27895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ckb1 f27896c;

    /* JADX INFO: renamed from: d */
    public bqz0 f27897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkb1(ckb1 ckb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f27896c = ckb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27894a = obj;
        this.f27895b |= Integer.MIN_VALUE;
        return this.f27896c.mo15629a(null, null, this);
    }
}
