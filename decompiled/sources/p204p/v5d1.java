package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f237395a;

    public v5d1(String str) {
        this.f237395a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5d1) && wj50.m88271j(this.f237395a, ((v5d1) obj).f237395a);
    }

    public final int hashCode() {
        return this.f237395a.hashCode();
    }
}
