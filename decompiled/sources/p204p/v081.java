package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v081 implements x081 {

    /* JADX INFO: renamed from: a */
    public final String f235940a;

    public v081(String str) {
        this.f235940a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v081) && wj50.m88271j(this.f235940a, ((v081) obj).f235940a);
    }

    public final int hashCode() {
        return this.f235940a.hashCode();
    }
}
