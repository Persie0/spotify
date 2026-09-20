package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ijt {

    /* JADX INFO: renamed from: a */
    public final String f102891a;

    public ijt(String str) {
        this.f102891a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ijt) && wj50.m88271j(this.f102891a, ((ijt) obj).f102891a);
    }

    public final int hashCode() {
        String str = this.f102891a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
