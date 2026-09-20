package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p4u extends ibk {

    /* JADX INFO: renamed from: a */
    public fh0 f174007a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f174008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q4u f174009c;

    /* JADX INFO: renamed from: d */
    public int f174010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4u(q4u q4uVar, ibk ibkVar) {
        super(ibkVar);
        this.f174009c = q4uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174008b = obj;
        this.f174010d |= Integer.MIN_VALUE;
        Object objMo43764a = this.f174009c.mo43764a(null, this);
        return objMo43764a == yuk.f276404a ? objMo43764a : new s6x0(objMo43764a);
    }
}
