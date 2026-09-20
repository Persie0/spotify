package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class abu {

    /* JADX INFO: renamed from: a */
    public final String f14192a;

    public abu(String str) {
        this.f14192a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abu) && wj50.m88271j(this.f14192a, ((abu) obj).f14192a);
    }

    public final int hashCode() {
        return this.f14192a.hashCode();
    }
}
