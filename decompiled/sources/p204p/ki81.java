package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ki81 implements oi81 {

    /* JADX INFO: renamed from: a */
    public final String f122882a;

    public ki81(String str) {
        this.f122882a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki81) && wj50.m88271j(this.f122882a, ((ki81) obj).f122882a);
    }

    public final int hashCode() {
        return this.f122882a.hashCode();
    }
}
