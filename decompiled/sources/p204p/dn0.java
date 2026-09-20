package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dn0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final String f50645a;

    public dn0(String str) {
        this.f50645a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn0) && wj50.m88271j(this.f50645a, ((dn0) obj).f50645a);
    }

    public final int hashCode() {
        return this.f50645a.hashCode();
    }
}
