package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f6u extends ibk {

    /* JADX INFO: renamed from: a */
    public fh0 f66500a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g6u f66502c;

    /* JADX INFO: renamed from: d */
    public int f66503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6u(g6u g6uVar, ibk ibkVar) {
        super(ibkVar);
        this.f66502c = g6uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66501b = obj;
        this.f66503d |= Integer.MIN_VALUE;
        Object objMo43764a = this.f66502c.mo43764a(null, this);
        return objMo43764a == yuk.f276404a ? objMo43764a : new s6x0(objMo43764a);
    }
}
