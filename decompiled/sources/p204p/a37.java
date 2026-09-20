package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a37 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f11887a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11888b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b37 f11889c;

    /* JADX INFO: renamed from: d */
    public int f11890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a37(b37 b37Var, ibk ibkVar) {
        super(ibkVar);
        this.f11889c = b37Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11888b = obj;
        this.f11890d |= Integer.MIN_VALUE;
        return this.f11889c.m27998a(0L, this);
    }
}
