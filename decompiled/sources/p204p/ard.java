package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ard implements brd {

    /* JADX INFO: renamed from: a */
    public final String f19018a;

    public ard(String str) {
        this.f19018a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ard) && wj50.m88271j(this.f19018a, ((ard) obj).f19018a);
    }

    public final int hashCode() {
        return this.f19018a.hashCode();
    }
}
