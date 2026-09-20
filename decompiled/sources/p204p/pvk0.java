package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pvk0 {

    /* JADX INFO: renamed from: a */
    public final List f181787a;

    public pvk0(List list) {
        this.f181787a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvk0) && wj50.m88271j(this.f181787a, ((pvk0) obj).f181787a);
    }

    public final int hashCode() {
        return this.f181787a.hashCode();
    }
}
