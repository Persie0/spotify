package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f260410a;

    public xd8(String str) {
        this.f260410a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd8) && wj50.m88271j(this.f260410a, ((xd8) obj).f260410a);
    }

    public final int hashCode() {
        return this.f260410a.hashCode();
    }
}
