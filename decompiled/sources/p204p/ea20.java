package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ea20 {

    /* JADX INFO: renamed from: a */
    public final String f57570a;

    public ea20(String str) {
        this.f57570a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea20) && wj50.m88271j(this.f57570a, ((ea20) obj).f57570a);
    }

    public final int hashCode() {
        return this.f57570a.hashCode();
    }
}
