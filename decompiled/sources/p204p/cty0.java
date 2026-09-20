package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f42000a;

    public cty0(String str) {
        this.f42000a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cty0) && wj50.m88271j(this.f42000a, ((cty0) obj).f42000a);
    }

    public final int hashCode() {
        return this.f42000a.hashCode();
    }
}
