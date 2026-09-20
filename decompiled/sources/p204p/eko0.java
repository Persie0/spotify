package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eko0 implements fko0 {

    /* JADX INFO: renamed from: a */
    public final String f60511a;

    public eko0(String str) {
        this.f60511a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eko0) && wj50.m88271j(this.f60511a, ((eko0) obj).f60511a);
    }

    public final int hashCode() {
        return this.f60511a.hashCode();
    }
}
