package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class hts0 {

    /* JADX INFO: renamed from: a */
    public final String f95162a;

    /* JADX INFO: renamed from: b */
    public final UUID f95163b;

    public hts0(String str, UUID uuid) {
        this.f95162a = str;
        this.f95163b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hts0)) {
            return false;
        }
        hts0 hts0Var = (hts0) obj;
        return wj50.m88271j(this.f95162a, hts0Var.f95162a) && wj50.m88271j(this.f95163b, hts0Var.f95163b);
    }

    public final int hashCode() {
        return this.f95163b.hashCode() + (this.f95162a.hashCode() * 31);
    }
}
