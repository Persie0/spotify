package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ex01 {

    /* JADX INFO: renamed from: a */
    public final String f63642a;

    public ex01(String str) {
        this.f63642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex01) && wj50.m88271j(this.f63642a, ((ex01) obj).f63642a);
    }

    public final int hashCode() {
        return this.f63642a.hashCode();
    }
}
