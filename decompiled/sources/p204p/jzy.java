package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jzy extends pzy {

    /* JADX INFO: renamed from: a */
    public final List f117815a;

    public jzy(List list) {
        this.f117815a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzy) && wj50.m88271j(this.f117815a, ((jzy) obj).f117815a);
    }

    public final int hashCode() {
        return this.f117815a.hashCode();
    }
}
