package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rex0 implements afx0 {

    /* JADX INFO: renamed from: a */
    public final List f198450a;

    public rex0(List list) {
        this.f198450a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rex0) && wj50.m88271j(this.f198450a, ((rex0) obj).f198450a);
    }

    public final int hashCode() {
        return this.f198450a.hashCode();
    }
}
