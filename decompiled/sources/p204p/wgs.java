package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wgs extends ibk {

    /* JADX INFO: renamed from: a */
    public String f251137a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f251138b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xgs f251139c;

    /* JADX INFO: renamed from: d */
    public int f251140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgs(xgs xgsVar, ibk ibkVar) {
        super(ibkVar);
        this.f251139c = xgsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251138b = obj;
        this.f251140d |= Integer.MIN_VALUE;
        return xgs.m90936a(this.f251139c, null, this);
    }
}
