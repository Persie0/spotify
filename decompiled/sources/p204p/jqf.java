package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jqf extends lqf {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f114904f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ nqf f114905g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqf(nqf nqfVar, int i) {
        super(nqfVar);
        this.f114904f = i;
        this.f114905g = nqfVar;
    }

    @Override // p204p.lqf
    /* JADX INFO: renamed from: a */
    public final Object mo54089a(int i) {
        switch (this.f114904f) {
            case 0:
                return this.f114905g.m65424k()[i];
            case 1:
                return new mqf(this.f114905g, i);
            default:
                return this.f114905g.m65425l()[i];
        }
    }
}
