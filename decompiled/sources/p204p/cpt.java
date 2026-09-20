package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cpt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40638a;

    /* JADX INFO: renamed from: b */
    public int f40639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ept f40640c;

    /* JADX INFO: renamed from: d */
    public bqz0 f40641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpt(ept eptVar, ibk ibkVar) {
        super(ibkVar);
        this.f40640c = eptVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40638a = obj;
        this.f40639b |= Integer.MIN_VALUE;
        return this.f40640c.mo15629a(null, null, this);
    }
}
