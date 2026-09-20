package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xoe0 extends ape0 {

    /* JADX INFO: renamed from: a */
    public final String f264266a;

    public xoe0(String str) {
        this.f264266a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xoe0) && wj50.m88271j(this.f264266a, ((xoe0) obj).f264266a);
    }

    public final int hashCode() {
        String str = this.f264266a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
