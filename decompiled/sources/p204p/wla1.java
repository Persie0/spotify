package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wla1 implements gma1 {

    /* JADX INFO: renamed from: a */
    public final String f252500a;

    public wla1(String str) {
        this.f252500a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wla1) && wj50.m88271j(this.f252500a, ((wla1) obj).f252500a);
    }

    public final int hashCode() {
        return this.f252500a.hashCode();
    }
}
