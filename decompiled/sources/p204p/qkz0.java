package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qkz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f189677a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f189678b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rkz0 f189679c;

    /* JADX INFO: renamed from: d */
    public int f189680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkz0(rkz0 rkz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f189679c = rkz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189678b = obj;
        this.f189680d |= Integer.MIN_VALUE;
        return this.f189679c.m75808c(null, this);
    }
}
