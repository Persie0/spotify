package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tk40 implements vk40 {

    /* JADX INFO: renamed from: a */
    public final String f221084a;

    public tk40(String str) {
        this.f221084a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk40) && wj50.m88271j(this.f221084a, ((tk40) obj).f221084a);
    }

    public final int hashCode() {
        return this.f221084a.hashCode();
    }
}
