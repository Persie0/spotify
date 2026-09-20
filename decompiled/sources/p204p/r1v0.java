package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r1v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public vbv f194928a;

    /* JADX INFO: renamed from: b */
    public hv31 f194929b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f194930c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s1v0 f194931d;

    /* JADX INFO: renamed from: e */
    public int f194932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1v0(s1v0 s1v0Var, ibk ibkVar) {
        super(ibkVar);
        this.f194931d = s1v0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194930c = obj;
        this.f194932e |= Integer.MIN_VALUE;
        return this.f194931d.m76994c(null, this);
    }
}
