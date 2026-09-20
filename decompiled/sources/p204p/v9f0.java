package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v9f0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f238935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q5x f238936b;

    /* JADX INFO: renamed from: c */
    public int f238937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9f0(q5x q5xVar, ibk ibkVar) {
        super(ibkVar);
        this.f238936b = q5xVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f238935a = obj;
        this.f238937c |= Integer.MIN_VALUE;
        return this.f238936b.m72201c(null, null, this);
    }
}
