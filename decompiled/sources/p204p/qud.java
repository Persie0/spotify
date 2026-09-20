package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qud implements sud {

    /* JADX INFO: renamed from: a */
    public final List f192641a;

    /* JADX INFO: renamed from: b */
    public final boolean f192642b;

    public qud(List list, boolean z) {
        this.f192641a = list;
        this.f192642b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qud)) {
            return false;
        }
        qud qudVar = (qud) obj;
        return wj50.m88271j(this.f192641a, qudVar.f192641a) && this.f192642b == qudVar.f192642b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192642b) + (this.f192641a.hashCode() * 31);
    }
}
