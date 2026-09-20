package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class av90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f20128a;

    public av90(String str) {
        this.f20128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av90) && wj50.m88271j(this.f20128a, ((av90) obj).f20128a);
    }

    public final int hashCode() {
        return this.f20128a.hashCode();
    }
}
