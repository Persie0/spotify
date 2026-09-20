package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p39 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f173591b;

    public /* synthetic */ p39(String str, int i) {
        this.f173590a = i;
        this.f173591b = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f173590a;
        w2a1 w2a1Var = w2a1.f247311a;
        String str = this.f173591b;
        switch (i) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54004r(mpz0Var, 1);
                jpz0.m54005s(mpz0Var, str);
                return w2a1Var;
            case 1:
                jpz0.m54000n((mpz0) obj, str);
                return w2a1Var;
            case 2:
                jpz0.m54005s((mpz0) obj, str);
                return w2a1Var;
            case 3:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54000n(mpz0Var2, str);
                jpz0.m54007u(mpz0Var2, 5);
                return w2a1Var;
            case 4:
                mpz0 mpz0Var3 = (mpz0) obj;
                jpz0.m54000n(mpz0Var3, str);
                jpz0.m54007u(mpz0Var3, 5);
                return w2a1Var;
            case 5:
                mpz0 mpz0Var4 = (mpz0) obj;
                jpz0.m54000n(mpz0Var4, str);
                jpz0.m54007u(mpz0Var4, 5);
                return w2a1Var;
            case 6:
                mpz0 mpz0Var5 = (mpz0) obj;
                jpz0.m54005s(mpz0Var5, str);
                jpz0.m53986D(mpz0Var5, 0.0f);
                return w2a1Var;
            case 7:
                String str2 = (String) obj;
                if (wl51.m88460J0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return s571.m77250i(str, str2);
            default:
                qr60[] qr60VarArr = jpz0.f114758a;
                ((mpz0) obj).mo62511a(hpz0.f93939O, str);
                return w2a1Var;
        }
    }
}
