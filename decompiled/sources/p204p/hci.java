package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hci implements jci {

    /* JADX INFO: renamed from: a */
    public final String f89796a;

    public hci(String str) {
        this.f89796a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hci) && wj50.m88271j(this.f89796a, ((hci) obj).f89796a);
    }

    public final int hashCode() {
        return this.f89796a.hashCode();
    }
}
