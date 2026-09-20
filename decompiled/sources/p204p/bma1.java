package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bma1 implements gma1 {

    /* JADX INFO: renamed from: a */
    public final String f28483a;

    /* JADX INFO: renamed from: b */
    public final String f28484b;

    /* JADX INFO: renamed from: c */
    public final String f28485c;

    /* JADX INFO: renamed from: d */
    public final List f28486d;

    public bma1(String str, List list, String str2, String str3) {
        this.f28483a = str;
        this.f28484b = str2;
        this.f28485c = str3;
        this.f28486d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bma1)) {
            return false;
        }
        bma1 bma1Var = (bma1) obj;
        return wj50.m88271j(this.f28483a, bma1Var.f28483a) && wj50.m88271j(this.f28484b, bma1Var.f28484b) && wj50.m88271j(this.f28485c, bma1Var.f28485c) && wj50.m88271j(this.f28486d, bma1Var.f28486d);
    }

    public final int hashCode() {
        int iHashCode = this.f28483a.hashCode() * 31;
        String str = this.f28484b;
        return this.f28486d.hashCode() + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f28485c);
    }
}
