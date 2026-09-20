package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ova1 implements rva1 {

    /* JADX INFO: renamed from: a */
    public final List f170458a;

    public ova1(List list) {
        this.f170458a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ova1) && wj50.m88271j(this.f170458a, ((ova1) obj).f170458a);
    }

    public final int hashCode() {
        return this.f170458a.hashCode();
    }
}
