package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class l5q {

    /* JADX INFO: renamed from: a */
    public final List f129991a;

    public l5q(List list) {
        this.f129991a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5q) && wj50.m88271j(this.f129991a, ((l5q) obj).f129991a);
    }

    public final int hashCode() {
        return this.f129991a.hashCode();
    }
}
