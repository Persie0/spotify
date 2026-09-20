package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yq5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zq5 f275150b;

    /* JADX INFO: renamed from: c */
    public int f275151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq5(zq5 zq5Var, ibk ibkVar) {
        super(ibkVar);
        this.f275150b = zq5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275149a = obj;
        this.f275151c |= Integer.MIN_VALUE;
        return this.f275150b.m96722p(null, this);
    }
}
