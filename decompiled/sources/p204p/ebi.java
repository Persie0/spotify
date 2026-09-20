package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ebi implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f57941a;

    public ebi(String str) {
        this.f57941a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebi) && wj50.m88271j(this.f57941a, ((ebi) obj).f57941a);
    }

    public final int hashCode() {
        return this.f57941a.hashCode();
    }
}
