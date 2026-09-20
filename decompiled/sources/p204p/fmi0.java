package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fmi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f71056a;

    /* JADX INFO: renamed from: b */
    public rlv0 f71057b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f71058c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ imi0 f71059d;

    /* JADX INFO: renamed from: e */
    public int f71060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmi0(imi0 imi0Var, ibk ibkVar) {
        super(ibkVar);
        this.f71059d = imi0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71058c = obj;
        this.f71060e |= Integer.MIN_VALUE;
        return this.f71059d.m51097c(null, this);
    }
}
