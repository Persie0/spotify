package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b90 {

    /* JADX INFO: renamed from: a */
    public final List f24729a;

    public b90(List list) {
        this.f24729a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b90) && wj50.m88271j(this.f24729a, ((b90) obj).f24729a);
    }

    public final int hashCode() {
        return this.f24729a.hashCode();
    }
}
