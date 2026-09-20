package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qrc {

    /* JADX INFO: renamed from: a */
    public final String f191801a;

    public qrc(String str) {
        this.f191801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrc) && wj50.m88271j(this.f191801a, ((qrc) obj).f191801a);
    }

    public final int hashCode() {
        return this.f191801a.hashCode();
    }
}
