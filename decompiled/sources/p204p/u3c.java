package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u3c {

    /* JADX INFO: renamed from: a */
    public final String f226316a;

    public u3c(String str) {
        this.f226316a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3c) && wj50.m88271j(this.f226316a, ((u3c) obj).f226316a);
    }

    public final int hashCode() {
        return this.f226316a.hashCode();
    }
}
