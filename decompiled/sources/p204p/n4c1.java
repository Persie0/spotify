package p204p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class n4c1 implements wma, wze, isr {

    /* JADX INFO: renamed from: a */
    public final String f150315a;

    /* JADX INFO: renamed from: b */
    public final String f150316b;

    /* JADX INFO: renamed from: c */
    public final un20 f150317c;

    /* JADX INFO: renamed from: d */
    public final String f150318d;

    /* JADX INFO: renamed from: e */
    public final String f150319e;

    /* JADX INFO: renamed from: f */
    public final String f150320f;

    /* JADX INFO: renamed from: g */
    public final f5u f150321g;

    public n4c1(String str, String str2, String str3, String str4, String str5, f5u f5uVar, un20 un20Var) {
        this.f150315a = str;
        this.f150316b = str2;
        this.f150317c = un20Var;
        this.f150318d = str3;
        this.f150319e = str4;
        this.f150320f = str5;
        this.f150321g = f5uVar;
    }

    @Override // p204p.wze
    /* JADX INFO: renamed from: a */
    public final Set mo51590a() {
        String str = this.f150320f;
        if (str == null) {
            str = "";
        }
        return Collections.singleton(str);
    }

    @Override // p204p.isr
    /* JADX INFO: renamed from: b */
    public final String mo42230b() {
        String str = this.f150320f;
        return str == null ? "" : str;
    }

    @Override // p204p.wma
    /* JADX INFO: renamed from: d */
    public final List mo28698d(int i, int i2) {
        rq91 rq91Var = new rq91(i);
        String str = this.f150316b;
        return Collections.singletonList(new u7e0(this.f150315a, rq91Var, new ezs0(str, str, this.f150319e, this.f150318d, this.f150317c, this.f150320f, this.f150321g, null, null, 384)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4c1)) {
            return false;
        }
        n4c1 n4c1Var = (n4c1) obj;
        return wj50.m88271j(this.f150315a, n4c1Var.f150315a) && wj50.m88271j(this.f150316b, n4c1Var.f150316b) && wj50.m88271j(this.f150317c, n4c1Var.f150317c) && wj50.m88271j(this.f150318d, n4c1Var.f150318d) && wj50.m88271j(this.f150319e, n4c1Var.f150319e) && wj50.m88271j(this.f150320f, n4c1Var.f150320f) && wj50.m88271j(this.f150321g, n4c1Var.f150321g);
    }

    @Override // p204p.wma
    public final String getId() {
        return this.f150315a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f150315a.hashCode() * 31, 31, this.f150316b);
        un20 un20Var = this.f150317c;
        int iM77243b2 = s571.m77243b(s571.m77243b((iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f150318d), 31, this.f150319e);
        String str = this.f150320f;
        int iHashCode = (iM77243b2 + (str == null ? 0 : str.hashCode())) * 31;
        f5u f5uVar = this.f150321g;
        return iHashCode + (f5uVar != null ? f5uVar.hashCode() : 0);
    }
}
