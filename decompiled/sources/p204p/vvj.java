package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vvj extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f245238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f245239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvj(int i, int i2, th00 th00Var) {
        super(1);
        this.f245237a = i2;
        this.f245238b = th00Var;
        this.f245239c = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f245237a) {
            case 0:
                this.f245238b.invoke(Integer.valueOf(this.f245239c), Boolean.valueOf(((jwj) obj).f116648a));
                break;
            case 1:
                Integer numValueOf = Integer.valueOf(this.f245239c);
                this.f245238b.invoke(numValueOf, (String) obj);
                break;
            case 2:
                Integer numValueOf2 = Integer.valueOf(this.f245239c);
                this.f245238b.invoke(numValueOf2, (i8e0) obj);
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f245238b.invoke(Integer.valueOf(this.f245239c), bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f245238b.invoke(Integer.valueOf(this.f245239c), bool2);
                break;
        }
        return w2a1.f247311a;
    }
}
