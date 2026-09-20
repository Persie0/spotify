package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i7y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f99645a;

    /* JADX INFO: renamed from: b */
    public String f99646b;

    /* JADX INFO: renamed from: c */
    public float f99647c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f99648d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ j7y0 f99649e;

    /* JADX INFO: renamed from: f */
    public int f99650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7y0(j7y0 j7y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f99649e = j7y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99648d = obj;
        this.f99650f |= Integer.MIN_VALUE;
        Object objM52667b = this.f99649e.m52667b(null, null, 0.0f, this);
        return objM52667b == yuk.f276404a ? objM52667b : new s6x0(objM52667b);
    }
}
