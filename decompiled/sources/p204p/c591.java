package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c591 implements e591 {

    /* JADX INFO: renamed from: a */
    public final String f34110a;

    public c591(String str) {
        this.f34110a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c591) && wj50.m88271j(this.f34110a, ((c591) obj).f34110a);
    }

    public final int hashCode() {
        return this.f34110a.hashCode() + (Integer.hashCode(4) * 31);
    }
}
