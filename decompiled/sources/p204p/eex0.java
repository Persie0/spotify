package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class eex0 implements k330 {

    /* JADX INFO: renamed from: a */
    public final String f58870a;

    /* JADX INFO: renamed from: b */
    public final String f58871b;

    /* JADX INFO: renamed from: c */
    public final t3x0 f58872c;

    /* JADX INFO: renamed from: d */
    public final v9b f58873d;

    /* JADX INFO: renamed from: e */
    public final boolean f58874e;

    public eex0(String str, String str2, t3x0 t3x0Var, v9b v9bVar, boolean z) {
        this.f58870a = str;
        this.f58871b = str2;
        this.f58872c = t3x0Var;
        this.f58873d = v9bVar;
        this.f58874e = z;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        v9b v9bVar = this.f58873d;
        int iM38547C = edb.m38547C(v9bVar.f238896a);
        int i = 1;
        if (iM38547C != 1) {
            i = 2;
            if (iM38547C != 2) {
                i = 3;
                if (iM38547C != 3) {
                    i = 0;
                }
            }
        }
        int i2 = i;
        if (i2 == 0) {
            return lau.f131415a;
        }
        String str = v9bVar.f238897b;
        String str2 = v9bVar.f238898c;
        String str3 = v9bVar.f238899d;
        String str4 = v9bVar.f238900e;
        boolean z = this.f58874e;
        String str5 = this.f58871b;
        String str6 = this.f58870a;
        return Collections.singletonList(new ydx0(new jex0(str6, str, str2, str3, str4, i2, z, str5), str6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eex0)) {
            return false;
        }
        eex0 eex0Var = (eex0) obj;
        return this.f58870a.equals(eex0Var.f58870a) && this.f58871b.equals(eex0Var.f58871b) && this.f58872c.equals(eex0Var.f58872c) && this.f58873d.equals(eex0Var.f58873d) && this.f58874e == eex0Var.f58874e;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f58872c;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f58870a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58874e) + ((this.f58873d.hashCode() + j4x.m52406d(this.f58872c, s571.m77243b(this.f58870a.hashCode() * 31, 961, this.f58871b), 31)) * 31);
    }
}
