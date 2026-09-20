package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fe30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68672a;

    /* JADX INFO: renamed from: b */
    public int f68673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ge30 f68674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe30(ge30 ge30Var, ibk ibkVar) {
        super(ibkVar);
        this.f68674c = ge30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68672a = obj;
        this.f68673b |= Integer.MIN_VALUE;
        return this.f68674c.mo15629a(null, null, this);
    }
}
