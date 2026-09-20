package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wy6 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f256202a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f256203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yy6 f256204c;

    /* JADX INFO: renamed from: d */
    public int f256205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy6(yy6 yy6Var, ibk ibkVar) {
        super(ibkVar);
        this.f256204c = yy6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256203b = obj;
        this.f256205d |= Integer.MIN_VALUE;
        return this.f256204c.m94865b(null, this);
    }
}
