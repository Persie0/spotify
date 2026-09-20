package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class va6 implements rtr {

    /* JADX INFO: renamed from: a */
    public final String f239128a;

    public va6(String str) {
        this.f239128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va6) && wj50.m88271j(this.f239128a, ((va6) obj).f239128a);
    }

    public final int hashCode() {
        return this.f239128a.hashCode();
    }
}
