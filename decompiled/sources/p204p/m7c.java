package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m7c {

    /* JADX INFO: renamed from: a */
    public final String f140759a;

    public m7c(String str) {
        this.f140759a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7c) && wj50.m88271j(this.f140759a, ((m7c) obj).f140759a);
    }

    public final int hashCode() {
        return this.f140759a.hashCode();
    }
}
