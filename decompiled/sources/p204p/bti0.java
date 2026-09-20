package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bti0 implements eti0 {

    /* JADX INFO: renamed from: a */
    public final String f30876a;

    public bti0(String str) {
        this.f30876a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bti0) && wj50.m88271j(this.f30876a, ((bti0) obj).f30876a);
    }

    public final int hashCode() {
        return this.f30876a.hashCode();
    }
}
