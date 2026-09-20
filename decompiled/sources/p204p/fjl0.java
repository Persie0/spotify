package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fjl0 implements ljl0 {

    /* JADX INFO: renamed from: a */
    public final String f70309a;

    public fjl0(String str) {
        this.f70309a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjl0) && wj50.m88271j(this.f70309a, ((fjl0) obj).f70309a);
    }

    public final int hashCode() {
        return this.f70309a.hashCode();
    }
}
