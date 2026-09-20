package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f56788a;

    public e71(String str) {
        this.f56788a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e71) && wj50.m88271j(this.f56788a, ((e71) obj).f56788a);
    }

    public final int hashCode() {
        return this.f56788a.hashCode();
    }
}
