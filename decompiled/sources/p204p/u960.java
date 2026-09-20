package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class u960 implements v960 {

    /* JADX INFO: renamed from: a */
    public final Set f228083a;

    public u960(Set set) {
        this.f228083a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u960) && wj50.m88271j(this.f228083a, ((u960) obj).f228083a);
    }

    public final int hashCode() {
        return this.f228083a.hashCode();
    }
}
