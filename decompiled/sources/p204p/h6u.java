package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h6u extends ibk {

    /* JADX INFO: renamed from: a */
    public fh0 f88252a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i6u f88254c;

    /* JADX INFO: renamed from: d */
    public int f88255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6u(i6u i6uVar, ibk ibkVar) {
        super(ibkVar);
        this.f88254c = i6uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88253b = obj;
        this.f88255d |= Integer.MIN_VALUE;
        Object objMo43764a = this.f88254c.mo43764a(null, this);
        return objMo43764a == yuk.f276404a ? objMo43764a : new s6x0(objMo43764a);
    }
}
