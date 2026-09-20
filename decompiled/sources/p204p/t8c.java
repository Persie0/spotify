package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t8c implements u8c {

    /* JADX INFO: renamed from: a */
    public final String f218052a;

    public t8c(String str) {
        this.f218052a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8c) && wj50.m88271j(this.f218052a, ((t8c) obj).f218052a);
    }

    public final int hashCode() {
        return this.f218052a.hashCode();
    }
}
