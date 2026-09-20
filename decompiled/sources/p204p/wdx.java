package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wdx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250359a;

    /* JADX INFO: renamed from: b */
    public int f250360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xdx f250361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdx(xdx xdxVar, ibk ibkVar) {
        super(ibkVar);
        this.f250361c = xdxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250359a = obj;
        this.f250360b |= Integer.MIN_VALUE;
        return this.f250361c.mo15629a(null, null, this);
    }
}
