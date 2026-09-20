package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qg31 implements vg31 {

    /* JADX INFO: renamed from: a */
    public final List f188368a;

    public qg31(List list) {
        this.f188368a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg31) && wj50.m88271j(this.f188368a, ((qg31) obj).f188368a);
    }

    public final int hashCode() {
        return this.f188368a.hashCode();
    }
}
