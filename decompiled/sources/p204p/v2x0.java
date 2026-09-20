package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v2x0 implements n3x0 {

    /* JADX INFO: renamed from: a */
    public final String f236732a;

    public v2x0(String str) {
        this.f236732a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2x0) && wj50.m88271j(this.f236732a, ((v2x0) obj).f236732a);
    }

    public final int hashCode() {
        return this.f236732a.hashCode();
    }
}
