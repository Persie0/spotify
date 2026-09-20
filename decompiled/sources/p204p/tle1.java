package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tle1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f221454a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f221455b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vle1 f221456c;

    /* JADX INFO: renamed from: d */
    public int f221457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tle1(vle1 vle1Var, ibk ibkVar) {
        super(ibkVar);
        this.f221456c = vle1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221455b = obj;
        this.f221457d |= Integer.MIN_VALUE;
        return this.f221456c.m85948f(null, this);
    }
}
