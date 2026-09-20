package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u62 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f227203a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f227204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v62 f227205c;

    /* JADX INFO: renamed from: d */
    public int f227206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u62(v62 v62Var, ibk ibkVar) {
        super(ibkVar);
        this.f227205c = v62Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227204b = obj;
        this.f227206d |= Integer.MIN_VALUE;
        return this.f227205c.m84765a(this);
    }
}
