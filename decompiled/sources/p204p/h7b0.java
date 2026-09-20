package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final String f88399a;

    public h7b0(String str) {
        this.f88399a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7b0) && wj50.m88271j(this.f88399a, ((h7b0) obj).f88399a);
    }

    public final int hashCode() {
        return this.f88399a.hashCode();
    }
}
