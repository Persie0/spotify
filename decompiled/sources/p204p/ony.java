package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ony implements hoy {

    /* JADX INFO: renamed from: a */
    public final String f167397a;

    public ony(String str) {
        this.f167397a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ony) && wj50.m88271j(this.f167397a, ((ony) obj).f167397a);
    }

    public final int hashCode() {
        return this.f167397a.hashCode();
    }
}
