package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u3c1 implements v3c1 {

    /* JADX INFO: renamed from: a */
    public final String f226321a;

    public u3c1(String str) {
        this.f226321a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3c1) && wj50.m88271j(this.f226321a, ((u3c1) obj).f226321a);
    }

    public final int hashCode() {
        return this.f226321a.hashCode();
    }
}
