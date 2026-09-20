package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dpm0 {

    /* JADX INFO: renamed from: a */
    public final List f51370a;

    /* JADX INFO: renamed from: b */
    public final String f51371b;

    public dpm0(List list, String str) {
        this.f51370a = list;
        this.f51371b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpm0)) {
            return false;
        }
        dpm0 dpm0Var = (dpm0) obj;
        return wj50.m88271j(this.f51370a, dpm0Var.f51370a) && wj50.m88271j(this.f51371b, dpm0Var.f51371b);
    }

    public final int hashCode() {
        return this.f51371b.hashCode() + (this.f51370a.hashCode() * 31);
    }
}
