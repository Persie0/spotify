package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class kgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f122443a;

    /* JADX INFO: renamed from: b */
    public final String f122444b;

    /* JADX INFO: renamed from: c */
    public final Set f122445c;

    /* JADX INFO: renamed from: d */
    public final Set f122446d;

    public kgs0(String str, String str2, Set set, Set set2) {
        this.f122443a = str;
        this.f122444b = str2;
        this.f122445c = set;
        this.f122446d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgs0)) {
            return false;
        }
        kgs0 kgs0Var = (kgs0) obj;
        return wj50.m88271j(this.f122443a, kgs0Var.f122443a) && wj50.m88271j(this.f122444b, kgs0Var.f122444b) && wj50.m88271j(this.f122445c, kgs0Var.f122445c) && wj50.m88271j(this.f122446d, kgs0Var.f122446d);
    }

    public final int hashCode() {
        return this.f122446d.hashCode() + klh.m56830b(s571.m77243b(this.f122443a.hashCode() * 31, 31, this.f122444b), 31, this.f122445c);
    }
}
