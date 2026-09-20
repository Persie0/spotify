package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mb7 {

    /* JADX INFO: renamed from: a */
    public final String f141809a;

    public /* synthetic */ mb7(String str) {
        this.f141809a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mb7) {
            return wj50.m88271j(this.f141809a, ((mb7) obj).f141809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f141809a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("OnCappedEvent(bookUri=", this.f141809a, ")");
    }
}
