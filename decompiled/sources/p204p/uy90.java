package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uy90 implements wy90 {

    /* JADX INFO: renamed from: a */
    public final String f235217a;

    public uy90(String str) {
        this.f235217a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy90) && wj50.m88271j(this.f235217a, ((uy90) obj).f235217a);
    }

    public final int hashCode() {
        return this.f235217a.hashCode();
    }
}
