package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class myq implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148499a;

    /* JADX INFO: renamed from: b */
    public final nyq f148500b;

    /* JADX INFO: renamed from: c */
    public final oyq f148501c;

    public /* synthetic */ myq(nyq nyqVar, oyq oyqVar, int i) {
        this.f148499a = i;
        this.f148500b = nyqVar;
        this.f148501c = oyqVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f148499a) {
            case 0:
                return s601.m77309l0(this.f148500b.f159880a.keySet(), this.f148501c.mo37353o());
            default:
                return s601.m77309l0(this.f148500b.f159881b.keySet(), this.f148501c.mo37354p());
        }
    }
}
