package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lnt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f135221a;

    /* JADX INFO: renamed from: b */
    public int f135222b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mnt f135223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnt(mnt mntVar, ibk ibkVar) {
        super(ibkVar);
        this.f135223c = mntVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135221a = obj;
        this.f135222b |= Integer.MIN_VALUE;
        return this.f135223c.mo15629a(null, null, this);
    }
}
