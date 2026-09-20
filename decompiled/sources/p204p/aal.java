package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aal {

    /* JADX INFO: renamed from: a */
    public final String f13891a;

    /* JADX INFO: renamed from: b */
    public final String f13892b;

    public aal(String str, String str2) {
        this.f13891a = str;
        this.f13892b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aal)) {
            return false;
        }
        aal aalVar = (aal) obj;
        return wj50.m88271j(this.f13891a, aalVar.f13891a) && wj50.m88271j(this.f13892b, aalVar.f13892b);
    }

    public final int hashCode() {
        return this.f13892b.hashCode() + (this.f13891a.hashCode() * 31);
    }
}
