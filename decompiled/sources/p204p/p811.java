package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p811 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f174810a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f174811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v811 f174812c;

    /* JADX INFO: renamed from: d */
    public int f174813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p811(v811 v811Var, ibk ibkVar) {
        super(ibkVar);
        this.f174812c = v811Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174811b = obj;
        this.f174813d |= Integer.MIN_VALUE;
        return this.f174812c.m84904c(null, null, null, null, this);
    }
}
