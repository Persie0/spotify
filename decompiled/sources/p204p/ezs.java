package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ezs {

    /* JADX INFO: renamed from: a */
    public final List f64458a;

    public ezs(List list) {
        this.f64458a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezs) && wj50.m88271j(this.f64458a, ((ezs) obj).f64458a);
    }

    public final int hashCode() {
        return this.f64458a.hashCode();
    }
}
