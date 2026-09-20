package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ky60 implements ly60 {

    /* JADX INFO: renamed from: a */
    public final String f127690a;

    public ky60(String str) {
        this.f127690a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky60) && wj50.m88271j(this.f127690a, ((ky60) obj).f127690a);
    }

    public final int hashCode() {
        return this.f127690a.hashCode();
    }
}
