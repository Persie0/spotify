package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v5b1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f237390a;

    public v5b1(String str) {
        this.f237390a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5b1) && wj50.m88271j(this.f237390a, ((v5b1) obj).f237390a);
    }

    public final int hashCode() {
        String str = this.f237390a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
