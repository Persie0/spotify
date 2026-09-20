package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gnf extends ibk {

    /* JADX INFO: renamed from: a */
    public String f82701a;

    /* JADX INFO: renamed from: b */
    public String f82702b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f82703c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hnf f82704d;

    /* JADX INFO: renamed from: e */
    public int f82705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnf(hnf hnfVar, ibk ibkVar) {
        super(ibkVar);
        this.f82704d = hnfVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f82703c = obj;
        this.f82705e |= Integer.MIN_VALUE;
        Object objM48010a = this.f82704d.m48010a(null, null, this);
        return objM48010a == yuk.f276404a ? objM48010a : new zgx0((String) objM48010a);
    }
}
