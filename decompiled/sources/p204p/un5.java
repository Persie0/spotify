package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class un5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final List f232064a;

    public un5(List list) {
        this.f232064a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un5) && wj50.m88271j(this.f232064a, ((un5) obj).f232064a);
    }

    public final int hashCode() {
        return this.f232064a.hashCode();
    }
}
