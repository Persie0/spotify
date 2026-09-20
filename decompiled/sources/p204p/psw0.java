package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class psw0 {

    /* JADX INFO: renamed from: a */
    public final String f180996a;

    public psw0(String str) {
        this.f180996a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psw0) && wj50.m88271j(this.f180996a, ((psw0) obj).f180996a);
    }

    public final int hashCode() {
        return this.f180996a.hashCode();
    }
}
