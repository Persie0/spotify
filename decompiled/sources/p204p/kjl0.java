package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kjl0 implements ljl0 {

    /* JADX INFO: renamed from: a */
    public final String f123379a;

    public kjl0(String str) {
        this.f123379a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjl0) && wj50.m88271j(this.f123379a, ((kjl0) obj).f123379a);
    }

    public final int hashCode() {
        return this.f123379a.hashCode();
    }
}
