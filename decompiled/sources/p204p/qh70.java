package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qh70 extends uh70 {

    /* JADX INFO: renamed from: a */
    public final List f188664a;

    public qh70(List list) {
        this.f188664a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh70) && wj50.m88271j(this.f188664a, ((qh70) obj).f188664a);
    }

    public final int hashCode() {
        return this.f188664a.hashCode();
    }
}
