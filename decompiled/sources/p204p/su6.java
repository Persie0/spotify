package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class su6 extends wu6 {

    /* JADX INFO: renamed from: a */
    public final String f214015a;

    public su6(String str) {
        this.f214015a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su6) && wj50.m88271j(this.f214015a, ((su6) obj).f214015a);
    }

    public final int hashCode() {
        return this.f214015a.hashCode();
    }
}
