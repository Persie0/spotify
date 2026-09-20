package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class obx extends gcx {

    /* JADX INFO: renamed from: a */
    public final List f163768a;

    public obx(List list) {
        this.f163768a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obx) && wj50.m88271j(this.f163768a, ((obx) obj).f163768a);
    }

    public final int hashCode() {
        return this.f163768a.hashCode();
    }
}
