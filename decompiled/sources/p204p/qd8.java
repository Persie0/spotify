package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f187505a;

    public qd8(String str) {
        this.f187505a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd8) && wj50.m88271j(this.f187505a, ((qd8) obj).f187505a);
    }

    public final int hashCode() {
        return this.f187505a.hashCode();
    }
}
