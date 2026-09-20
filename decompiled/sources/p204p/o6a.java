package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o6a implements q6a {

    /* JADX INFO: renamed from: a */
    public final String f162298a;

    public o6a(String str) {
        this.f162298a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6a) && wj50.m88271j(this.f162298a, ((o6a) obj).f162298a);
    }

    public final int hashCode() {
        return this.f162298a.hashCode();
    }
}
