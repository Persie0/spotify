package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class v1c {

    /* JADX INFO: renamed from: a */
    public final String f236316a;

    /* JADX INFO: renamed from: b */
    public final String f236317b;

    public v1c(String str, String str2) {
        this.f236316a = str;
        this.f236317b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1c)) {
            return false;
        }
        v1c v1cVar = (v1c) obj;
        return wj50.m88271j(this.f236316a, v1cVar.f236316a) && wj50.m88271j(this.f236317b, v1cVar.f236317b);
    }

    public final int hashCode() {
        return this.f236317b.hashCode() + (this.f236316a.hashCode() * 31);
    }
}
