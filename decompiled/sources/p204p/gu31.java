package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gu31 {

    /* JADX INFO: renamed from: a */
    public final String f84370a;

    public /* synthetic */ gu31(String str) {
        this.f84370a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gu31) {
            return wj50.m88271j(this.f84370a, ((gu31) obj).f84370a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84370a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("SourceIdentifier(id=", this.f84370a, ")");
    }
}
