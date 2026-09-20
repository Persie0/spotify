package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w2u extends ibk {

    /* JADX INFO: renamed from: a */
    public fh0 f247425a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f247426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x2u f247427c;

    /* JADX INFO: renamed from: d */
    public int f247428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2u(x2u x2uVar, ibk ibkVar) {
        super(ibkVar);
        this.f247427c = x2uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247426b = obj;
        this.f247428d |= Integer.MIN_VALUE;
        Object objMo43764a = this.f247427c.mo43764a(null, this);
        return objMo43764a == yuk.f276404a ? objMo43764a : new s6x0(objMo43764a);
    }
}
