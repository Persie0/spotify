package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qda1 {

    /* JADX INFO: renamed from: a */
    public final String f187528a;

    public qda1(String str) {
        this.f187528a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qda1) && wj50.m88271j(this.f187528a, ((qda1) obj).f187528a);
    }

    public final int hashCode() {
        String str = this.f187528a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
