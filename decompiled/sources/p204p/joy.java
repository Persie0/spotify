package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class joy extends koy {

    /* JADX INFO: renamed from: a */
    public final String f114529a;

    public joy(String str) {
        this.f114529a = str;
    }

    @Override // p204p.koy
    /* JADX INFO: renamed from: a */
    public final String mo51222a() {
        return this.f114529a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joy) && wj50.m88271j(this.f114529a, ((joy) obj).f114529a);
    }

    public final int hashCode() {
        return this.f114529a.hashCode();
    }
}
