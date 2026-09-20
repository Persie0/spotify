package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ci71 implements ei71 {

    /* JADX INFO: renamed from: a */
    public final String f38246a;

    public ci71(String str) {
        this.f38246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci71) && wj50.m88271j(this.f38246a, ((ci71) obj).f38246a);
    }

    public final int hashCode() {
        return this.f38246a.hashCode();
    }
}
