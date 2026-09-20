package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sog extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f211187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f211188b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fhv f211189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sog(gh00 gh00Var, fhv fhvVar, int i) {
        super(0);
        this.f211187a = i;
        this.f211188b = gh00Var;
        this.f211189c = fhvVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f211187a) {
            case 0:
                u980 u980Var = this.f211189c.f69720b;
                this.f211188b.invoke(new su8(u980Var.f228093e, u980Var.f228089a));
                break;
            case 1:
                fhv fhvVar = this.f211189c;
                String str = fhvVar.f69719a;
                u980 u980Var2 = fhvVar.f69720b;
                pyl pylVar = u980Var2.f228092d;
                String str2 = pylVar != null ? pylVar.f183430b : null;
                if (str2 == null) {
                    str2 = "";
                }
                this.f211188b.invoke(new tu8(str, str2, u980Var2.f228093e, u980Var2.f228089a));
                break;
            default:
                fhv fhvVar2 = this.f211189c;
                String str3 = fhvVar2.f69719a;
                u980 u980Var3 = fhvVar2.f69720b;
                this.f211188b.invoke(new ru8(str3, u980Var3.f228093e, u980Var3.f228089a));
                break;
        }
        return w2a1.f247311a;
    }
}
