package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r811 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f196692a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f196693b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v811 f196694c;

    /* JADX INFO: renamed from: d */
    public int f196695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r811(v811 v811Var, ibk ibkVar) {
        super(ibkVar);
        this.f196694c = v811Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196693b = obj;
        this.f196695d |= Integer.MIN_VALUE;
        return this.f196694c.m84905d(null, null, null, null, this);
    }
}
