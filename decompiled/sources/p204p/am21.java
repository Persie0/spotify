package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class am21 {

    /* JADX INFO: renamed from: a */
    public final String f17030a;

    public am21(String str) {
        this.f17030a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am21) && wj50.m88271j(this.f17030a, ((am21) obj).f17030a);
    }

    public final int hashCode() {
        String str = this.f17030a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
