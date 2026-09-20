package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c6v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final String f34635a;

    public c6v0(String str) {
        this.f34635a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6v0) && wj50.m88271j(this.f34635a, ((c6v0) obj).f34635a);
    }

    public final int hashCode() {
        return this.f34635a.hashCode();
    }
}
