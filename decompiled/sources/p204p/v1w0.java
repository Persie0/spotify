package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v1w0 implements y1w0 {

    /* JADX INFO: renamed from: a */
    public final String f236490a;

    public v1w0(String str) {
        this.f236490a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1w0) && wj50.m88271j(this.f236490a, ((v1w0) obj).f236490a);
    }

    public final int hashCode() {
        return this.f236490a.hashCode();
    }
}
