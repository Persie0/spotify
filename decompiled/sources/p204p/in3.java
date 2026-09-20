package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class in3 {

    /* JADX INFO: renamed from: a */
    public final List f103842a;

    public in3(List list) {
        this.f103842a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in3) && wj50.m88271j(this.f103842a, ((in3) obj).f103842a);
    }

    public final int hashCode() {
        return this.f103842a.hashCode();
    }
}
