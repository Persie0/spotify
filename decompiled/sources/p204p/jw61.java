package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jw61 implements mw61 {

    /* JADX INFO: renamed from: a */
    public final String f116598a;

    public jw61(String str) {
        this.f116598a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw61) && wj50.m88271j(this.f116598a, ((jw61) obj).f116598a);
    }

    public final int hashCode() {
        return this.f116598a.hashCode();
    }
}
