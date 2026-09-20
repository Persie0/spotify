package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wl00 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f252335a;

    /* JADX INFO: renamed from: b */
    public int f252336b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f252337c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zl00 f252338d;

    /* JADX INFO: renamed from: e */
    public int f252339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl00(zl00 zl00Var, ibk ibkVar) {
        super(ibkVar);
        this.f252338d = zl00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252337c = obj;
        this.f252339e |= Integer.MIN_VALUE;
        return zl00.m96349a(this.f252338d, this);
    }
}
