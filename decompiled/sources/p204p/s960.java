package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s960 implements v960 {

    /* JADX INFO: renamed from: a */
    public final Set f206867a;

    public s960(Set set) {
        this.f206867a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s960) && wj50.m88271j(this.f206867a, ((s960) obj).f206867a);
    }

    public final int hashCode() {
        return this.f206867a.hashCode();
    }
}
