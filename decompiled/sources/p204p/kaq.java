package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kaq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ maq f120946b;

    /* JADX INFO: renamed from: c */
    public int f120947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaq(maq maqVar, ibk ibkVar) {
        super(ibkVar);
        this.f120946b = maqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120945a = obj;
        this.f120947c |= Integer.MIN_VALUE;
        return this.f120946b.m61321a(this);
    }
}
