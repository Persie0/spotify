package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bn90 {

    /* JADX INFO: renamed from: a */
    public final String f28733a;

    /* JADX INFO: renamed from: b */
    public final String f28734b;

    public bn90(String str, String str2) {
        this.f28733a = str;
        this.f28734b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn90)) {
            return false;
        }
        bn90 bn90Var = (bn90) obj;
        return wj50.m88271j(this.f28733a, bn90Var.f28733a) && wj50.m88271j(this.f28734b, bn90Var.f28734b);
    }

    public final int hashCode() {
        return this.f28734b.hashCode() + (this.f28733a.hashCode() * 31);
    }
}
