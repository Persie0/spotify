package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u83 extends ibk {

    /* JADX INFO: renamed from: a */
    public vn80 f227796a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f227797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w83 f227798c;

    /* JADX INFO: renamed from: d */
    public int f227799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u83(w83 w83Var, ibk ibkVar) {
        super(ibkVar);
        this.f227798c = w83Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227797b = obj;
        this.f227799d |= Integer.MIN_VALUE;
        return this.f227798c.m87436b(null, null, this);
    }
}
