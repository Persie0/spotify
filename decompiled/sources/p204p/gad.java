package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gad implements lad {

    /* JADX INFO: renamed from: a */
    public final List f78031a;

    public gad(List list) {
        this.f78031a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gad) && wj50.m88271j(this.f78031a, ((gad) obj).f78031a);
    }

    public final int hashCode() {
        return this.f78031a.hashCode();
    }
}
