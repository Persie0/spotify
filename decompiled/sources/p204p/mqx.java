package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mqx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f146377a;

    public mqx(String str) {
        this.f146377a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqx) && wj50.m88271j(this.f146377a, ((mqx) obj).f146377a);
    }

    public final int hashCode() {
        return this.f146377a.hashCode();
    }
}
