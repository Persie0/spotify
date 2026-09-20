package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l4e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f129664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dmk f129665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4e0(dmk dmkVar, int i) {
        super(1);
        this.f129664a = i;
        this.f129665b = dmkVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f129664a) {
            case 0:
                String str = ((ezs0) obj).f64461c;
                if (((d4e0) this.f129665b.f50551g).f45147c) {
                    return str;
                }
                return null;
            default:
                String str2 = ((ezs0) obj).f64461c;
                if (((d4e0) this.f129665b.f50551g).f45145a) {
                    return str2;
                }
                return null;
        }
    }
}
