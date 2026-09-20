package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m7q0 {

    /* JADX INFO: renamed from: a */
    public final String f140816a;

    public m7q0(String str) {
        this.f140816a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7q0) && wj50.m88271j(this.f140816a, ((m7q0) obj).f140816a);
    }

    public final int hashCode() {
        return this.f140816a.hashCode();
    }
}
