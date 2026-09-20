package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kvf0 implements lvf0 {

    /* JADX INFO: renamed from: a */
    public final String f126858a;

    public kvf0(String str) {
        this.f126858a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvf0) && wj50.m88271j(this.f126858a, ((kvf0) obj).f126858a);
    }

    public final int hashCode() {
        return this.f126858a.hashCode();
    }
}
