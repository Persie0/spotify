package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b710 {

    /* JADX INFO: renamed from: a */
    public final String f24113a;

    public b710(String str) {
        this.f24113a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b710) && wj50.m88271j(this.f24113a, ((b710) obj).f24113a);
    }

    public final int hashCode() {
        return this.f24113a.hashCode();
    }
}
