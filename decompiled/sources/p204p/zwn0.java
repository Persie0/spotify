package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zwn0 {

    /* JADX INFO: renamed from: a */
    public final List f287012a;

    /* JADX INFO: renamed from: b */
    public final String f287013b;

    public zwn0(List list, String str) {
        this.f287012a = list;
        this.f287013b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwn0)) {
            return false;
        }
        zwn0 zwn0Var = (zwn0) obj;
        return wj50.m88271j(this.f287012a, zwn0Var.f287012a) && wj50.m88271j(this.f287013b, zwn0Var.f287013b);
    }

    public final int hashCode() {
        int iHashCode = this.f287012a.hashCode() * 31;
        String str = this.f287013b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
