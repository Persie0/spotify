package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ef8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f58977a;

    public ef8(String str) {
        this.f58977a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f58977a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef8) && wj50.m88271j(this.f58977a, ((ef8) obj).f58977a);
    }

    public final int hashCode() {
        return this.f58977a.hashCode();
    }
}
