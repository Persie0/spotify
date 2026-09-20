package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ksf implements msf {

    /* JADX INFO: renamed from: a */
    public final String f125944a;

    public ksf(String str) {
        this.f125944a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksf) && wj50.m88271j(this.f125944a, ((ksf) obj).f125944a);
    }

    public final int hashCode() {
        return this.f125944a.hashCode();
    }
}
