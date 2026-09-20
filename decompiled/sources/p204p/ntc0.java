package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ntc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final List f158045a;

    public ntc0(List list) {
        this.f158045a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ntc0) && wj50.m88271j(this.f158045a, ((ntc0) obj).f158045a);
    }

    public final int hashCode() {
        return this.f158045a.hashCode();
    }
}
