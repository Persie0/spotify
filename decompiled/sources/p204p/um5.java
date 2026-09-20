package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class um5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final List f231741a;

    public um5(List list) {
        this.f231741a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um5) && wj50.m88271j(this.f231741a, ((um5) obj).f231741a);
    }

    public final int hashCode() {
        return this.f231741a.hashCode();
    }
}
