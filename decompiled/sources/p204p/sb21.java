package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sb21 implements k330 {

    /* JADX INFO: renamed from: a */
    public final String f207324a;

    /* JADX INFO: renamed from: b */
    public final String f207325b;

    /* JADX INFO: renamed from: c */
    public final t3x0 f207326c;

    /* JADX INFO: renamed from: d */
    public final w9b f207327d;

    public sb21(String str, String str2, t3x0 t3x0Var, w9b w9bVar) {
        this.f207324a = str;
        this.f207325b = str2;
        this.f207326c = t3x0Var;
        this.f207327d = w9bVar;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        w9b w9bVar = this.f207327d;
        int iM38547C = edb.m38547C(w9bVar.f249135a);
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
        String str = w9bVar.f249136b;
        String str2 = w9bVar.f249137c;
        String str3 = this.f207325b;
        String str4 = this.f207324a;
        return Collections.singletonList(new qb21(new tb21(i2, str4, str, str2, str3), str4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb21)) {
            return false;
        }
        sb21 sb21Var = (sb21) obj;
        return this.f207324a.equals(sb21Var.f207324a) && this.f207325b.equals(sb21Var.f207325b) && this.f207326c.equals(sb21Var.f207326c) && this.f207327d.equals(sb21Var.f207327d);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f207326c;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f207324a;
    }

    public final int hashCode() {
        return this.f207327d.hashCode() + j4x.m52406d(this.f207326c, s571.m77243b(this.f207324a.hashCode() * 31, 961, this.f207325b), 31);
    }
}
