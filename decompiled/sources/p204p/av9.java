package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class av9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final String f20127a;

    public av9(String str) {
        this.f20127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av9) && wj50.m88271j(this.f20127a, ((av9) obj).f20127a);
    }

    public final int hashCode() {
        return this.f20127a.hashCode();
    }
}
