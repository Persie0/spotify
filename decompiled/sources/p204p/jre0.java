package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jre0 extends ibk {

    /* JADX INFO: renamed from: a */
    public gh00 f115165a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f115166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kre0 f115167c;

    /* JADX INFO: renamed from: d */
    public int f115168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jre0(kre0 kre0Var, fbk fbkVar) {
        super(fbkVar);
        this.f115167c = kre0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f115166b = obj;
        this.f115168d |= Integer.MIN_VALUE;
        return this.f115167c.m57156b(null, this);
    }
}
