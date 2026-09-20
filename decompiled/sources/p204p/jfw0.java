package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jfw0 implements lfw0 {

    /* JADX INFO: renamed from: a */
    public final Set f111983a;

    public jfw0(Set set) {
        this.f111983a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfw0) && wj50.m88271j(this.f111983a, ((jfw0) obj).f111983a);
    }

    public final int hashCode() {
        return this.f111983a.hashCode();
    }
}
