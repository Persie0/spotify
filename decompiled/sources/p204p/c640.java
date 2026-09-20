package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c640 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e640 f34379b;

    /* JADX INFO: renamed from: c */
    public int f34380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c640(e640 e640Var, ibk ibkVar) {
        super(ibkVar);
        this.f34379b = e640Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34378a = obj;
        this.f34380c |= Integer.MIN_VALUE;
        return this.f34379b.m37890m(null, this);
    }
}
