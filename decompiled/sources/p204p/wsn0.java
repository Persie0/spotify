package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wsn0 implements xsn0 {

    /* JADX INFO: renamed from: a */
    public final List f254656a;

    public wsn0(List list) {
        this.f254656a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsn0) && wj50.m88271j(this.f254656a, ((wsn0) obj).f254656a);
    }

    public final int hashCode() {
        return this.f254656a.hashCode();
    }
}
