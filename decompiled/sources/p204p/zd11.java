package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zd11 {

    /* JADX INFO: renamed from: a */
    public final Set f281607a;

    public zd11(Set set) {
        this.f281607a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd11) && wj50.m88271j(this.f281607a, ((zd11) obj).f281607a);
    }

    public final int hashCode() {
        return this.f281607a.hashCode();
    }
}
