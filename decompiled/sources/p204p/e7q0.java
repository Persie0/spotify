package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class e7q0 extends f7q0 {

    /* JADX INFO: renamed from: a */
    public final List f56988a;

    public e7q0(List list) {
        this.f56988a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7q0) && wj50.m88271j(this.f56988a, ((e7q0) obj).f56988a);
    }

    public final int hashCode() {
        List list = this.f56988a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
