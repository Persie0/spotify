package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ncf0 implements qcf0 {

    /* JADX INFO: renamed from: a */
    public final List f152506a;

    public ncf0(List list) {
        this.f152506a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncf0) && wj50.m88271j(this.f152506a, ((ncf0) obj).f152506a);
    }

    public final int hashCode() {
        return this.f152506a.hashCode();
    }
}
