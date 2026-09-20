package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final String f117833a;

    public k001(String str) {
        this.f117833a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k001) && wj50.m88271j(this.f117833a, ((k001) obj).f117833a);
    }

    public final int hashCode() {
        return this.f117833a.hashCode() + (Integer.hashCode(4) * 31);
    }
}
