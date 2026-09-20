package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g37 implements k37 {

    /* JADX INFO: renamed from: a */
    public final String f76124a;

    public g37(String str) {
        this.f76124a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m43440a() {
        return this.f76124a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g37) && wj50.m88271j(this.f76124a, ((g37) obj).f76124a);
    }

    public final int hashCode() {
        return this.f76124a.hashCode();
    }
}
