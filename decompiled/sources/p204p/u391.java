package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u391 implements w391 {

    /* JADX INFO: renamed from: a */
    public final String f226306a;

    public u391(String str) {
        this.f226306a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u391) && wj50.m88271j(this.f226306a, ((u391) obj).f226306a);
    }

    public final int hashCode() {
        return this.f226306a.hashCode();
    }
}
