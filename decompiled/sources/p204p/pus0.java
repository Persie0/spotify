package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pus0 implements qus0 {

    /* JADX INFO: renamed from: a */
    public final String f181523a;

    public pus0(String str) {
        this.f181523a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pus0) && wj50.m88271j(this.f181523a, ((pus0) obj).f181523a);
    }

    public final int hashCode() {
        return this.f181523a.hashCode();
    }
}
