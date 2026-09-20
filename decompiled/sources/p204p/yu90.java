package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f276289a;

    public yu90(String str) {
        this.f276289a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu90) && wj50.m88271j(this.f276289a, ((yu90) obj).f276289a);
    }

    public final int hashCode() {
        return this.f276289a.hashCode();
    }
}
