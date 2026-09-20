package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bem {

    /* JADX INFO: renamed from: a */
    public final String f26388a;

    /* JADX INFO: renamed from: b */
    public final String f26389b;

    public bem(String str, String str2) {
        this.f26388a = str;
        this.f26389b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bem)) {
            return false;
        }
        bem bemVar = (bem) obj;
        return wj50.m88271j(this.f26388a, bemVar.f26388a) && wj50.m88271j(this.f26389b, bemVar.f26389b);
    }

    public final int hashCode() {
        return this.f26389b.hashCode() + (this.f26388a.hashCode() * 31);
    }
}
