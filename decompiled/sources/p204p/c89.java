package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c89 implements e89 {

    /* JADX INFO: renamed from: a */
    public final String f35145a;

    public c89(String str) {
        this.f35145a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c89) && wj50.m88271j(this.f35145a, ((c89) obj).f35145a);
    }

    public final int hashCode() {
        return this.f35145a.hashCode();
    }
}
