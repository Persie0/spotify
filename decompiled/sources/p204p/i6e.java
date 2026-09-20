package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i6e {

    /* JADX INFO: renamed from: a */
    public final String f99216a;

    /* JADX INFO: renamed from: b */
    public final String f99217b;

    public i6e(String str, String str2) {
        this.f99216a = str;
        this.f99217b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6e)) {
            return false;
        }
        i6e i6eVar = (i6e) obj;
        return wj50.m88271j(this.f99216a, i6eVar.f99216a) && wj50.m88271j(this.f99217b, i6eVar.f99217b);
    }

    public final int hashCode() {
        return this.f99217b.hashCode() + (this.f99216a.hashCode() * 31);
    }
}
