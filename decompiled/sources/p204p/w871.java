package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class w871 extends ibk {

    /* JADX INFO: renamed from: a */
    public qlv0 f248870a;

    /* JADX INFO: renamed from: b */
    public qlv0 f248871b;

    /* JADX INFO: renamed from: c */
    public gb20 f248872c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f248873d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ d971 f248874e;

    /* JADX INFO: renamed from: f */
    public int f248875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w871(d971 d971Var, ibk ibkVar) {
        super(ibkVar);
        this.f248874e = d971Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248873d = obj;
        this.f248875f |= Integer.MIN_VALUE;
        return d971.m35322b(this.f248874e, null, false, this);
    }
}
