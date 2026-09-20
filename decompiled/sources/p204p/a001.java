package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a001 implements e001 {

    /* JADX INFO: renamed from: a */
    public final String f10972a;

    public a001(String str) {
        this.f10972a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a001) && wj50.m88271j(this.f10972a, ((a001) obj).f10972a);
    }

    public final int hashCode() {
        return this.f10972a.hashCode();
    }
}
