package p204p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class owt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f170782a;

    /* JADX INFO: renamed from: b */
    public final Set f170783b;

    /* JADX INFO: renamed from: c */
    public final Set f170784c;

    public owt0(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.f170782a = z;
        this.f170783b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.f170784c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68186a(Class cls, boolean z) {
        if (this.f170783b.contains(cls)) {
            return true;
        }
        return !this.f170784c.contains(cls) && this.f170782a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof owt0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        owt0 owt0Var = (owt0) obj;
        return this.f170782a == owt0Var.f170782a && Objects.equals(this.f170783b, owt0Var.f170783b) && Objects.equals(this.f170784c, owt0Var.f170784c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f170782a), this.f170783b, this.f170784c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f170782a + ", forceEnabledQuirks=" + this.f170783b + ", forceDisabledQuirks=" + this.f170784c + '}';
    }
}
