package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qy90 implements wy90 {

    /* JADX INFO: renamed from: a */
    public final String f193855a;

    public qy90(String str) {
        this.f193855a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy90) && wj50.m88271j(this.f193855a, ((qy90) obj).f193855a);
    }

    public final int hashCode() {
        return this.f193855a.hashCode();
    }
}
