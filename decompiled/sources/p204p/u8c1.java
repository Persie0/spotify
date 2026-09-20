package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u8c1 {

    /* JADX INFO: renamed from: a */
    public final String f227905a;

    public u8c1(String str) {
        this.f227905a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8c1) && wj50.m88271j(this.f227905a, ((u8c1) obj).f227905a);
    }

    public final int hashCode() {
        return this.f227905a.hashCode();
    }
}
