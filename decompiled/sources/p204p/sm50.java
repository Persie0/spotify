package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sm50 {

    /* JADX INFO: renamed from: a */
    public final List f210567a;

    public sm50(List list) {
        this.f210567a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm50) && wj50.m88271j(this.f210567a, ((sm50) obj).f210567a);
    }

    public final int hashCode() {
        return this.f210567a.hashCode();
    }
}
