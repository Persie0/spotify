package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zur implements nx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286504a;

    /* JADX INFO: renamed from: b */
    public final om0 f286505b;

    /* JADX INFO: renamed from: c */
    public String f286506c;

    /* JADX INFO: renamed from: d */
    public eh00 f286507d;

    /* JADX INFO: renamed from: e */
    public boolean f286508e;

    /* JADX INFO: renamed from: f */
    public int f286509f = -1;

    /* JADX INFO: renamed from: g */
    public volatile boolean f286510g;

    public /* synthetic */ zur(om0 om0Var, int i) {
        this.f286504a = i;
        this.f286505b = om0Var;
    }

    @Override // p204p.nx0
    /* JADX INFO: renamed from: a */
    public final void mo46878a(int i) {
        switch (this.f286504a) {
            case 0:
                m97065d(i);
                if (this.f286510g) {
                    String str = this.f286506c;
                    if (str != null && this.f286509f < 50 && i >= 50) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_50, str, null, null, null, 124);
                    }
                    String str2 = this.f286506c;
                    if (str2 != null && this.f286509f >= 50 && i < 50) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_50_LESS, str2, null, null, null, 124);
                    }
                    String str3 = this.f286506c;
                    if (str3 != null && this.f286509f > 0 && i <= 0) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_0, str3, null, null, null, 124);
                    }
                    String str4 = this.f286506c;
                    if (str4 != null && this.f286509f < 100 && i >= 100) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_100, str4, null, null, null, 124);
                    }
                }
                String str5 = this.f286506c;
                if (str5 != null && this.f286509f <= 0 && i > 0) {
                    om0.m67310a(this.f286505b, qm0.VIEWABILITY_GREATER_THAN_0, str5, null, null, null, 124);
                }
                this.f286509f = i;
                break;
            default:
                if (this.f286510g) {
                    String str6 = this.f286506c;
                    if (str6 != null && this.f286509f < 50 && i >= 50) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_50, str6, null, null, null, 124);
                    }
                    String str7 = this.f286506c;
                    if (str7 != null && this.f286509f >= 50 && i < 50) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_50_LESS, str7, null, null, null, 124);
                    }
                    String str8 = this.f286506c;
                    if (str8 != null && this.f286509f > 0 && i <= 0) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_0, str8, null, null, null, 124);
                    }
                    String str9 = this.f286506c;
                    if (str9 != null && this.f286509f < 100 && i >= 100) {
                        om0.m67310a(this.f286505b, qm0.VIEWABILITY_100, str9, null, null, null, 124);
                    }
                }
                String str10 = this.f286506c;
                if (str10 != null && this.f286509f <= 0 && i > 0) {
                    om0.m67310a(this.f286505b, qm0.VIEWABILITY_GREATER_THAN_0, str10, null, null, null, 124);
                }
                this.f286509f = i;
                break;
        }
    }

    @Override // p204p.nx0
    /* JADX INFO: renamed from: b */
    public final void mo46879b(String str) {
        so0 so0Var;
        switch (this.f286504a) {
            case 0:
                String str2 = this.f286506c;
                if (!(str2 == null ? false : wj50.m88271j(str, str2))) {
                    String str3 = this.f286506c;
                    String strM78599d = str3 == null ? "null" : so0.m78599d(str3);
                    na6.m63958f("onAssetLoaded called for mismatched ad identifier", "expected " + strM78599d + " but got " + so0.m78599d(str));
                    return;
                }
                if (this.f286508e) {
                    return;
                }
                this.f286508e = true;
                om0 om0Var = this.f286505b;
                qm0 qm0Var = qm0.LOADED;
                String str4 = this.f286506c;
                so0 so0Var2 = str4 != null ? new so0(str4) : null;
                if (so0Var2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var, qm0Var, so0Var2.f211068a, null, null, null, 124);
                m97065d(this.f286509f);
                return;
            default:
                String str5 = this.f286506c;
                if (!(str5 == null ? false : wj50.m88271j(str, str5))) {
                    String str6 = this.f286506c;
                    String strM78599d2 = str6 == null ? "null" : so0.m78599d(str6);
                    na6.m63958f("onAssetLoaded called for mismatched ad identifier", "expected " + strM78599d2 + " but got " + so0.m78599d(str));
                    return;
                }
                if (this.f286508e) {
                    return;
                }
                this.f286508e = true;
                om0 om0Var2 = this.f286505b;
                qm0 qm0Var2 = qm0.LOADED;
                String str7 = this.f286506c;
                so0 so0Var3 = str7 != null ? new so0(str7) : null;
                if (so0Var3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var2, qm0Var2, so0Var3.f211068a, null, null, null, 124);
                int i = this.f286509f;
                if (!this.f286508e || this.f286510g) {
                    return;
                }
                om0 om0Var3 = this.f286505b;
                qm0 qm0Var3 = qm0.IMPRESSION;
                String str8 = this.f286506c;
                so0 so0Var4 = str8 != null ? new so0(str8) : null;
                if (so0Var4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var3, qm0Var3, so0Var4.f211068a, null, null, null, 124);
                this.f286510g = true;
                eh00 eh00Var = this.f286507d;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                if (i < 50) {
                    om0 om0Var4 = this.f286505b;
                    qm0 qm0Var4 = qm0.VIEWABILITY_50_LESS;
                    String str9 = this.f286506c;
                    so0Var = str9 != null ? new so0(str9) : null;
                    if (so0Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    om0.m67310a(om0Var4, qm0Var4, so0Var.f211068a, null, null, null, 124);
                    return;
                }
                om0 om0Var5 = this.f286505b;
                qm0 qm0Var5 = qm0.VIEWABILITY_50;
                String str10 = this.f286506c;
                so0Var = str10 != null ? new so0(str10) : null;
                if (so0Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                om0.m67310a(om0Var5, qm0Var5, so0Var.f211068a, null, null, null, 124);
                return;
        }
    }

    @Override // p204p.nx0
    /* JADX INFO: renamed from: c */
    public final void mo46880c(String str, el40 el40Var) {
        switch (this.f286504a) {
            case 0:
                if (this.f286506c != null) {
                    this.f286509f = -1;
                    this.f286508e = false;
                    this.f286510g = false;
                }
                this.f286506c = str;
                this.f286507d = el40Var;
                break;
            default:
                if (this.f286506c != null) {
                    this.f286509f = -1;
                    this.f286508e = false;
                    this.f286510g = false;
                }
                this.f286506c = str;
                this.f286507d = el40Var;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m97065d(int i) {
        so0 so0Var;
        if (!this.f286508e || i <= 0 || this.f286510g) {
            return;
        }
        om0 om0Var = this.f286505b;
        qm0 qm0Var = qm0.IMPRESSION;
        String str = this.f286506c;
        so0 so0Var2 = str != null ? new so0(str) : null;
        if (so0Var2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        om0.m67310a(om0Var, qm0Var, so0Var2.f211068a, null, null, null, 124);
        this.f286510g = true;
        eh00 eh00Var = this.f286507d;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
        if (i < 50) {
            om0 om0Var2 = this.f286505b;
            qm0 qm0Var2 = qm0.VIEWABILITY_50_LESS;
            String str2 = this.f286506c;
            so0Var = str2 != null ? new so0(str2) : null;
            if (so0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            om0.m67310a(om0Var2, qm0Var2, so0Var.f211068a, null, null, null, 124);
            return;
        }
        om0 om0Var3 = this.f286505b;
        qm0 qm0Var3 = qm0.VIEWABILITY_50;
        String str3 = this.f286506c;
        so0Var = str3 != null ? new so0(str3) : null;
        if (so0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        om0.m67310a(om0Var3, qm0Var3, so0Var.f211068a, null, null, null, 124);
    }
}
