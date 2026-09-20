package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class jdq0 implements pdq0 {

    /* JADX INFO: renamed from: a */
    public final Set f111381a;

    public jdq0(Set set) {
        this.f111381a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdq0) && wj50.m88271j(this.f111381a, ((jdq0) obj).f111381a);
    }

    public final int hashCode() {
        return this.f111381a.hashCode();
    }
}
