package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v190 implements y190 {

    /* JADX INFO: renamed from: a */
    public final String f236300a;

    public v190(String str) {
        this.f236300a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v190) && wj50.m88271j(this.f236300a, ((v190) obj).f236300a);
    }

    public final int hashCode() {
        return this.f236300a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("Id(itemId=", this.f236300a, ")");
    }
}
