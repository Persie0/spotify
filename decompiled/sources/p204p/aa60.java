package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class aa60 implements ca60 {

    /* JADX INFO: renamed from: a */
    public final Set f13770a;

    public aa60(Set set) {
        this.f13770a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa60) && wj50.m88271j(this.f13770a, ((aa60) obj).f13770a);
    }

    public final int hashCode() {
        return this.f13770a.hashCode();
    }
}
