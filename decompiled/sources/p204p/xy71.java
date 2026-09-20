package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xy71 implements zy71 {

    /* JADX INFO: renamed from: a */
    public final String f267254a;

    public xy71(String str) {
        this.f267254a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy71) && wj50.m88271j(this.f267254a, ((xy71) obj).f267254a);
    }

    public final int hashCode() {
        return this.f267254a.hashCode();
    }
}
