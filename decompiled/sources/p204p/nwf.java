package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nwf extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f159138b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f159139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nwf(int i, Object obj, Object obj2) {
        super(1);
        this.f159137a = i;
        this.f159138b = obj;
        this.f159139c = obj2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f159137a) {
            case 0:
                Boolean bool = (Boolean) ((wwf) obj).f255761b.invoke(this.f159138b, this.f159139c);
                bool.booleanValue();
                return bool;
            default:
                Boolean bool2 = (Boolean) ((wwf) obj).f255760a.invoke(this.f159138b, this.f159139c);
                bool2.booleanValue();
                return bool2;
        }
    }
}
