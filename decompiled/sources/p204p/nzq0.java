package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nzq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public amf0 f160138a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f160139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pzq0 f160140c;

    /* JADX INFO: renamed from: d */
    public int f160141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzq0(pzq0 pzq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f160140c = pzq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160139b = obj;
        this.f160141d |= Integer.MIN_VALUE;
        return this.f160140c.m71763d(null, this);
    }
}
