package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hu10 implements iu10 {

    /* JADX INFO: renamed from: a */
    public final String f95236a;

    public hu10(String str) {
        this.f95236a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu10) && wj50.m88271j(this.f95236a, ((hu10) obj).f95236a);
    }

    public final int hashCode() {
        return this.f95236a.hashCode();
    }
}
