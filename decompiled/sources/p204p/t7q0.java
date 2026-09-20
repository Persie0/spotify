package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class t7q0 implements u7q0 {

    /* JADX INFO: renamed from: a */
    public final List f217873a;

    public t7q0(List list) {
        this.f217873a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7q0) && wj50.m88271j(this.f217873a, ((t7q0) obj).f217873a);
    }

    public final int hashCode() {
        return this.f217873a.hashCode();
    }
}
