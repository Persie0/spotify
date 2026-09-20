package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dov extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pov f51122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dov(pov povVar, int i) {
        super(1);
        this.f51121a = i;
        this.f51122b = povVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f51121a) {
            case 0:
                return rov.m76083a((bov) obj, this.f51122b.f179801d.m87936G());
            default:
                ((qsp) ((hmh0) obj)).f192162a = new eov(this.f51122b, 1);
                return w2a1.f247311a;
        }
    }
}
