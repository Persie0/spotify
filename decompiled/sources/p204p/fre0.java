package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fre0 implements gre0 {

    /* JADX INFO: renamed from: a */
    public final String f72473a;

    public fre0(String str) {
        this.f72473a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fre0) && wj50.m88271j(this.f72473a, ((fre0) obj).f72473a);
    }

    public final int hashCode() {
        return this.f72473a.hashCode();
    }
}
