package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final String f198015a;

    public rd30(String str) {
        this.f198015a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd30) && wj50.m88271j(this.f198015a, ((rd30) obj).f198015a);
    }

    public final int hashCode() {
        return this.f198015a.hashCode();
    }
}
