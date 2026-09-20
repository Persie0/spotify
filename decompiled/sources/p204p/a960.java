package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a960 implements c960 {

    /* JADX INFO: renamed from: a */
    public final Set f13490a;

    public a960(Set set) {
        this.f13490a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a960) && wj50.m88271j(this.f13490a, ((a960) obj).f13490a);
    }

    public final int hashCode() {
        return this.f13490a.hashCode();
    }
}
