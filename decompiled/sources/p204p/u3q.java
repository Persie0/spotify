package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u3q extends w3q {

    /* JADX INFO: renamed from: a */
    public final String f226419a;

    public u3q(String str) {
        this.f226419a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3q) && wj50.m88271j(this.f226419a, ((u3q) obj).f226419a);
    }

    public final int hashCode() {
        return this.f226419a.hashCode();
    }
}
