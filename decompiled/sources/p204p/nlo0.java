package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nlo0 implements rlo0 {

    /* JADX INFO: renamed from: a */
    public final String f155127a;

    public nlo0(String str) {
        this.f155127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlo0) && wj50.m88271j(this.f155127a, ((nlo0) obj).f155127a);
    }

    public final int hashCode() {
        return this.f155127a.hashCode();
    }
}
