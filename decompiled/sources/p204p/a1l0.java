package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a1l0 {

    /* JADX INFO: renamed from: a */
    public final List f11438a;

    public a1l0(List list) {
        this.f11438a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1l0) && wj50.m88271j(this.f11438a, ((a1l0) obj).f11438a);
    }

    public final int hashCode() {
        return this.f11438a.hashCode();
    }
}
