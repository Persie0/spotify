package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f8v extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g8v f67092b;

    /* JADX INFO: renamed from: c */
    public int f67093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8v(g8v g8vVar, ibk ibkVar) {
        super(ibkVar);
        this.f67092b = g8vVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67091a = obj;
        this.f67093c |= Integer.MIN_VALUE;
        return g8v.m43965e(this.f67092b, null, this);
    }
}
