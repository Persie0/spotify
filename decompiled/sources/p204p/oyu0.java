package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oyu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f171902a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f171903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tyu0 f171904c;

    /* JADX INFO: renamed from: d */
    public int f171905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyu0(tyu0 tyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f171904c = tyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171903b = obj;
        this.f171905d |= Integer.MIN_VALUE;
        return this.f171904c.m82008c(null, 0L, this);
    }
}
