package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ube extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xbe f228703b;

    /* JADX INFO: renamed from: c */
    public int f228704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ube(xbe xbeVar, fbk fbkVar) {
        super(fbkVar);
        this.f228703b = xbeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228702a = obj;
        this.f228704c |= Integer.MIN_VALUE;
        return xbe.m90314a(this.f228703b, null, this);
    }
}
