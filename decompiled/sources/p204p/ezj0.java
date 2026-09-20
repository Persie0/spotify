package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ezj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f64400a;

    /* JADX INFO: renamed from: b */
    public long f64401b;

    /* JADX INFO: renamed from: c */
    public String f64402c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f64403d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gzj0 f64404e;

    /* JADX INFO: renamed from: f */
    public int f64405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezj0(gzj0 gzj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f64404e = gzj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64403d = obj;
        this.f64405f |= Integer.MIN_VALUE;
        return this.f64404e.m46215l(this);
    }
}
