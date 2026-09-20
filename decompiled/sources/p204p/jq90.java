package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jq90 extends sq90 {

    /* JADX INFO: renamed from: a */
    public final Throwable f114857a;

    public jq90(Throwable th) {
        this.f114857a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq90) && wj50.m88271j(this.f114857a, ((jq90) obj).f114857a);
    }

    public final int hashCode() {
        return this.f114857a.hashCode();
    }
}
