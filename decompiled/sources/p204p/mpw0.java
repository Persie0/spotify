package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mpw0 extends upw0 {

    /* JADX INFO: renamed from: a */
    public final String f146104a;

    public mpw0(String str) {
        this.f146104a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpw0) && wj50.m88271j(this.f146104a, ((mpw0) obj).f146104a);
    }

    public final int hashCode() {
        return this.f146104a.hashCode();
    }
}
