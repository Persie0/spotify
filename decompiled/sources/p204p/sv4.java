package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sv4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ az1 f214310b;

    /* JADX INFO: renamed from: c */
    public int f214311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv4(az1 az1Var, ibk ibkVar) {
        super(ibkVar);
        this.f214310b = az1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214309a = obj;
        this.f214311c |= Integer.MIN_VALUE;
        return this.f214310b.m27564e(null, this);
    }
}
