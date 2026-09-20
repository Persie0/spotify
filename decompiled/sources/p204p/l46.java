package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l46 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129575a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q46 f129576b;

    /* JADX INFO: renamed from: c */
    public int f129577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l46(q46 q46Var, ibk ibkVar) {
        super(ibkVar);
        this.f129576b = q46Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129575a = obj;
        this.f129577c |= Integer.MIN_VALUE;
        return this.f129576b.m72144b(null, this);
    }
}
