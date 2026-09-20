package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class det implements eet {

    /* JADX INFO: renamed from: a */
    public final String f48166a;

    /* JADX INFO: renamed from: b */
    public final String f48167b;

    public det(String str, String str2) {
        this.f48166a = str;
        this.f48167b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof det)) {
            return false;
        }
        det detVar = (det) obj;
        return wj50.m88271j(this.f48166a, detVar.f48166a) && wj50.m88271j(this.f48167b, detVar.f48167b);
    }

    public final int hashCode() {
        return this.f48167b.hashCode() + (this.f48166a.hashCode() * 31);
    }
}
