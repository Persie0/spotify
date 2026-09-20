package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class o641 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f162223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f162224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o641(gh00 gh00Var, kqi0 kqi0Var, int i) {
        super(0);
        this.f162222a = i;
        this.f162223b = gh00Var;
        this.f162224c = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f162222a) {
            case 0:
                cjf1.m32972m(this.f162224c, false);
                this.f162223b.invoke(c281.f33320a);
                break;
            case 1:
                cjf1.m32972m(this.f162224c, false);
                this.f162223b.invoke(c281.f33321b);
                break;
            case 2:
                cjf1.m32972m(this.f162224c, false);
                this.f162223b.invoke(c281.f33322c);
                break;
            case 3:
                cjf1.m32972m(this.f162224c, false);
                this.f162223b.invoke(c281.f33323d);
                break;
            case 4:
                Boolean bool = (Boolean) this.f162224c.getValue();
                bool.booleanValue();
                this.f162223b.invoke(bool);
                break;
            case 5:
                Boolean bool2 = (Boolean) this.f162224c.getValue();
                bool2.booleanValue();
                this.f162223b.invoke(bool2);
                break;
            case 6:
                kqi0 kqi0Var = this.f162224c;
                kqi0Var.setValue(Boolean.valueOf(!fz6.m43146b(kqi0Var)));
                Boolean bool3 = (Boolean) kqi0Var.getValue();
                bool3.booleanValue();
                this.f162223b.invoke(bool3);
                break;
            case 7:
                this.f162223b.invoke(((Boolean) this.f162224c.getValue()).booleanValue() ? re91.f198324a : se91.f208250a);
                break;
            case 8:
                this.f162223b.invoke(jdb1.f111323a);
                this.f162224c.setValue(Boolean.TRUE);
                break;
            case 9:
                this.f162223b.invoke(jdb1.f111323a);
                this.f162224c.setValue(Boolean.TRUE);
                break;
            case 10:
                kqi0 kqi0Var2 = this.f162224c;
                kqi0Var2.setValue(Boolean.valueOf(!((Boolean) kqi0Var2.getValue()).booleanValue()));
                this.f162223b.invoke(ay6.f21112b);
                break;
            default:
                this.f162224c.setValue(Boolean.FALSE);
                this.f162223b.invoke(tkc1.f221121a);
                break;
        }
        return w2a1.f247311a;
    }
}
