package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kj3 {

    /* JADX INFO: renamed from: a */
    public final String f123210a;

    public kj3(String str) {
        this.f123210a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj3) && wj50.m88271j(this.f123210a, ((kj3) obj).f123210a);
    }

    public final int hashCode() {
        return this.f123210a.hashCode();
    }
}
