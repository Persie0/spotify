package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eyu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f64187a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gyu0 f64189c;

    /* JADX INFO: renamed from: d */
    public int f64190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyu0(gyu0 gyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f64189c = gyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64188b = obj;
        this.f64190d |= Integer.MIN_VALUE;
        return this.f64189c.m46176d(null, this);
    }
}
