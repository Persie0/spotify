package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cam extends azg1 {

    /* JADX INFO: renamed from: b */
    public final String f35839b;

    public cam(String str) {
        this.f35839b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cam) && wj50.m88271j(this.f35839b, ((cam) obj).f35839b);
    }

    public final int hashCode() {
        return this.f35839b.hashCode();
    }
}
