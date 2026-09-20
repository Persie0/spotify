package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j3j implements o3j {

    /* JADX INFO: renamed from: a */
    public final List f108407a;

    public j3j(List list) {
        this.f108407a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3j) && wj50.m88271j(this.f108407a, ((j3j) obj).f108407a);
    }

    public final int hashCode() {
        return this.f108407a.hashCode();
    }
}
