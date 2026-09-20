package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vgs extends ibk {

    /* JADX INFO: renamed from: a */
    public String f241305a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f241306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xgs f241307c;

    /* JADX INFO: renamed from: d */
    public int f241308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgs(xgs xgsVar, ibk ibkVar) {
        super(ibkVar);
        this.f241307c = xgsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f241306b = obj;
        this.f241308d |= Integer.MIN_VALUE;
        return this.f241307c.m90937b(null, this);
    }
}
