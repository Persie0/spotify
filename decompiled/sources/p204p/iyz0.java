package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class iyz0 {

    /* JADX INFO: renamed from: a */
    public final List f107094a;

    public iyz0(List list) {
        this.f107094a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyz0) && wj50.m88271j(this.f107094a, ((iyz0) obj).f107094a);
    }

    public final int hashCode() {
        return this.f107094a.hashCode();
    }
}
