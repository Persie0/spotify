package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pk81 implements qk81 {

    /* JADX INFO: renamed from: a */
    public final String f178415a;

    public pk81(String str) {
        this.f178415a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk81) && wj50.m88271j(this.f178415a, ((pk81) obj).f178415a);
    }

    public final int hashCode() {
        String str = this.f178415a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
