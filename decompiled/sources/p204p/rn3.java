package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rn3 extends ibk {

    /* JADX INFO: renamed from: a */
    public ss50 f200707a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f200708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cl1 f200709c;

    /* JADX INFO: renamed from: d */
    public int f200710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn3(cl1 cl1Var, ibk ibkVar) {
        super(ibkVar);
        this.f200709c = cl1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200708b = obj;
        this.f200710d |= Integer.MIN_VALUE;
        return this.f200709c.mo33214i(null, this);
    }
}
