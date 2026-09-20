package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xvb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f266351a;

    /* JADX INFO: renamed from: b */
    public boolean f266352b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f266353c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ awb1 f266354d;

    /* JADX INFO: renamed from: e */
    public int f266355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb1(awb1 awb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f266354d = awb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266353c = obj;
        this.f266355e |= Integer.MIN_VALUE;
        return this.f266354d.m27299a(null, this, false);
    }
}
