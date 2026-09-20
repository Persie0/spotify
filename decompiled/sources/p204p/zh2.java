package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zh2 implements bi2 {

    /* JADX INFO: renamed from: a */
    public final String f282781a;

    public zh2(String str) {
        this.f282781a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh2) && wj50.m88271j(this.f282781a, ((zh2) obj).f282781a);
    }

    public final int hashCode() {
        return this.f282781a.hashCode();
    }
}
