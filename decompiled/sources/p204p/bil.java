package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bil {

    /* JADX INFO: renamed from: a */
    public final String f27509a;

    public bil(String str) {
        this.f27509a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bil) && wj50.m88271j(this.f27509a, ((bil) obj).f27509a);
    }

    public final int hashCode() {
        return this.f27509a.hashCode();
    }
}
