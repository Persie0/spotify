package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tj80 {

    /* JADX INFO: renamed from: a */
    public final String f220848a;

    public tj80(String str) {
        this.f220848a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj80) && wj50.m88271j(this.f220848a, ((tj80) obj).f220848a);
    }

    public final int hashCode() {
        return this.f220848a.hashCode();
    }
}
