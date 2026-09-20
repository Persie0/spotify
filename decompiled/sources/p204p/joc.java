package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class joc implements i4a {

    /* JADX INFO: renamed from: a */
    public final String f114385a;

    public joc(String str) {
        this.f114385a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joc) && wj50.m88271j(this.f114385a, ((joc) obj).f114385a);
    }

    public final int hashCode() {
        return this.f114385a.hashCode();
    }
}
