package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f91 {

    /* JADX INFO: renamed from: a */
    public final String f67145a;

    public f91(String str) {
        this.f67145a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f91) && wj50.m88271j(this.f67145a, ((f91) obj).f67145a);
    }

    public final int hashCode() {
        return this.f67145a.hashCode();
    }
}
