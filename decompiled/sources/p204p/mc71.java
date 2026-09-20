package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mc71 implements nc71 {

    /* JADX INFO: renamed from: a */
    public final String f142093a;

    public mc71(String str) {
        this.f142093a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc71) && wj50.m88271j(this.f142093a, ((mc71) obj).f142093a);
    }

    public final int hashCode() {
        return this.f142093a.hashCode();
    }
}
