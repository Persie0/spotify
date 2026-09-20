package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mdq0 implements odq0 {

    /* JADX INFO: renamed from: a */
    public final String f142468a;

    public mdq0(String str) {
        this.f142468a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdq0) && wj50.m88271j(this.f142468a, ((mdq0) obj).f142468a);
    }

    public final int hashCode() {
        return this.f142468a.hashCode();
    }
}
