package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class peb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final String f176695a;

    public peb0(String str) {
        this.f176695a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof peb0) && wj50.m88271j(this.f176695a, ((peb0) obj).f176695a);
    }

    public final int hashCode() {
        String str = this.f176695a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
