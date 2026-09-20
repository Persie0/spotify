package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class poc extends qoc {

    /* JADX INFO: renamed from: a */
    public final String f179672a;

    public poc(String str) {
        this.f179672a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof poc) && wj50.m88271j(this.f179672a, ((poc) obj).f179672a);
    }

    public final int hashCode() {
        return this.f179672a.hashCode();
    }
}
