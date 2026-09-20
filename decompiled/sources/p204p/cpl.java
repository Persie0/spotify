package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cpl {

    /* JADX INFO: renamed from: a */
    public final String f40576a;

    public cpl(String str) {
        this.f40576a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpl) && wj50.m88271j(this.f40576a, ((cpl) obj).f40576a);
    }

    public final int hashCode() {
        return this.f40576a.hashCode();
    }
}
