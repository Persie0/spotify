package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class f420 implements i420 {

    /* JADX INFO: renamed from: a */
    public final List f65639a;

    public f420(List list) {
        this.f65639a = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m40704a() {
        return this.f65639a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f420) && wj50.m88271j(this.f65639a, ((f420) obj).f65639a);
    }

    public final int hashCode() {
        return this.f65639a.hashCode();
    }
}
