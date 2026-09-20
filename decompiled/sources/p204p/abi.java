package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class abi implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f14117a;

    /* JADX INFO: renamed from: b */
    public final String f14118b;

    public abi(String str, String str2) {
        this.f14117a = str;
        this.f14118b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abi)) {
            return false;
        }
        abi abiVar = (abi) obj;
        return wj50.m88271j(this.f14117a, abiVar.f14117a) && wj50.m88271j(this.f14118b, abiVar.f14118b);
    }

    public final int hashCode() {
        return this.f14118b.hashCode() + (this.f14117a.hashCode() * 31);
    }
}
