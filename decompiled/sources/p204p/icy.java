package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class icy implements ncy {

    /* JADX INFO: renamed from: a */
    public final String f100898a;

    public icy(String str) {
        this.f100898a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icy) && wj50.m88271j(this.f100898a, ((icy) obj).f100898a);
    }

    public final int hashCode() {
        return this.f100898a.hashCode();
    }
}
