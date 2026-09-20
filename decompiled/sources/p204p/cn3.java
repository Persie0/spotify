package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cn3 {

    /* JADX INFO: renamed from: a */
    public final String f39876a;

    public final boolean equals(Object obj) {
        if (obj instanceof cn3) {
            return wj50.m88271j(this.f39876a, ((cn3) obj).f39876a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39876a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("AllocationRequestSuccessMessage(text=", this.f39876a, ")");
    }
}
