package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cil {

    /* JADX INFO: renamed from: a */
    public final String f38382a;

    public cil(String str) {
        this.f38382a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cil) && wj50.m88271j(this.f38382a, ((cil) obj).f38382a);
    }

    public final int hashCode() {
        return this.f38382a.hashCode();
    }
}
