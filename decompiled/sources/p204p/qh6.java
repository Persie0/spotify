package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qh6 extends uh6 {

    /* JADX INFO: renamed from: a */
    public final List f188659a;

    public qh6(List list) {
        this.f188659a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh6) && wj50.m88271j(this.f188659a, ((qh6) obj).f188659a);
    }

    public final int hashCode() {
        return this.f188659a.hashCode();
    }
}
