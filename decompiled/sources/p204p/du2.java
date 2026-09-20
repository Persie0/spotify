package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class du2 implements fu2 {

    /* JADX INFO: renamed from: a */
    public final List f52942a;

    public du2(List list) {
        this.f52942a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du2) && wj50.m88271j(this.f52942a, ((du2) obj).f52942a);
    }

    public final int hashCode() {
        return this.f52942a.hashCode();
    }
}
