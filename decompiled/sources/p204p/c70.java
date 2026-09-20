package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class c70 implements e70 {

    /* JADX INFO: renamed from: a */
    public final String f34647a;

    public c70(String str) {
        this.f34647a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c70) && wj50.m88271j(this.f34647a, ((c70) obj).f34647a);
    }

    public final int hashCode() {
        return this.f34647a.hashCode();
    }
}
