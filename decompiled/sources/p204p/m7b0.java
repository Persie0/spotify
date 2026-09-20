package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class m7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final String f140758a;

    public m7b0(String str) {
        this.f140758a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7b0) && wj50.m88271j(this.f140758a, ((m7b0) obj).f140758a);
    }

    public final int hashCode() {
        return this.f140758a.hashCode();
    }
}
