package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class su5 {

    /* JADX INFO: renamed from: a */
    public final String f214008a;

    public su5(String str) {
        this.f214008a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su5) && wj50.m88271j(this.f214008a, ((su5) obj).f214008a);
    }

    public final int hashCode() {
        return this.f214008a.hashCode();
    }
}
