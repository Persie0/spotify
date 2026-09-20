package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class r2s0 {

    /* JADX INFO: renamed from: a */
    public final int f195221a;

    /* JADX INFO: renamed from: b */
    public final List f195222b;

    /* JADX INFO: renamed from: c */
    public final String f195223c;

    public r2s0(String str, int i, List list) {
        this.f195221a = i;
        this.f195222b = list;
        this.f195223c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2s0)) {
            return false;
        }
        r2s0 r2s0Var = (r2s0) obj;
        return this.f195221a == r2s0Var.f195221a && wj50.m88271j(this.f195222b, r2s0Var.f195222b) && wj50.m88271j(this.f195223c, r2s0Var.f195223c);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(Integer.hashCode(this.f195221a) * 31, 31, this.f195222b);
        String str = this.f195223c;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }
}
