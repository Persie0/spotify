package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aca1 {

    /* JADX INFO: renamed from: a */
    public final String f14307a;

    public aca1(String str) {
        this.f14307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aca1) && wj50.m88271j(this.f14307a, ((aca1) obj).f14307a);
    }

    public final int hashCode() {
        String str = this.f14307a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
