package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fno0 implements wma, isr {

    /* JADX INFO: renamed from: a */
    public final String f71335a;

    /* JADX INFO: renamed from: b */
    public final String f71336b;

    /* JADX INFO: renamed from: c */
    public final un20 f71337c;

    /* JADX INFO: renamed from: d */
    public final String f71338d;

    /* JADX INFO: renamed from: e */
    public final String f71339e;

    /* JADX INFO: renamed from: f */
    public final f5u f71340f;

    public fno0(String str, String str2, un20 un20Var, String str3, String str4, f5u f5uVar) {
        this.f71335a = str;
        this.f71336b = str2;
        this.f71337c = un20Var;
        this.f71338d = str3;
        this.f71339e = str4;
        this.f71340f = f5uVar;
    }

    @Override // p204p.isr
    /* JADX INFO: renamed from: b */
    public final String mo42230b() {
        return this.f71338d;
    }

    @Override // p204p.wma
    /* JADX INFO: renamed from: d */
    public final List mo28698d(int i, int i2) {
        rq91 rq91Var = new rq91(i);
        String str = this.f71338d;
        String str2 = this.f71339e;
        String str3 = str2 == null ? str : str2;
        f5u f5uVar = this.f71340f;
        String str4 = this.f71336b;
        return Collections.singletonList(new hmo0(this.f71335a, rq91Var, new nno0(str, (String) null, str3, str4, f5uVar), str4, this.f71337c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fno0)) {
            return false;
        }
        fno0 fno0Var = (fno0) obj;
        return wj50.m88271j(this.f71335a, fno0Var.f71335a) && wj50.m88271j(this.f71336b, fno0Var.f71336b) && wj50.m88271j(this.f71337c, fno0Var.f71337c) && wj50.m88271j(this.f71338d, fno0Var.f71338d) && wj50.m88271j(this.f71339e, fno0Var.f71339e) && wj50.m88271j(this.f71340f, fno0Var.f71340f);
    }

    @Override // p204p.wma
    public final String getId() {
        return this.f71335a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f71335a.hashCode() * 31, 31, this.f71336b);
        un20 un20Var = this.f71337c;
        int iM77243b2 = s571.m77243b((iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f71338d);
        String str = this.f71339e;
        int iHashCode = (iM77243b2 + (str == null ? 0 : str.hashCode())) * 31;
        f5u f5uVar = this.f71340f;
        return iHashCode + (f5uVar != null ? f5uVar.hashCode() : 0);
    }
}
