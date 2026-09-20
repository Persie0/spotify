package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rm5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final List f200452a;

    public rm5(List list) {
        this.f200452a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm5) && wj50.m88271j(this.f200452a, ((rm5) obj).f200452a);
    }

    public final int hashCode() {
        return this.f200452a.hashCode();
    }
}
