package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y841 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clj f270198b;

    /* JADX INFO: renamed from: c */
    public int f270199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y841(clj cljVar, ibk ibkVar) {
        super(ibkVar);
        this.f270198b = cljVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270197a = obj;
        this.f270199c |= Integer.MIN_VALUE;
        return clj.m33276e(this.f270198b, this);
    }
}
