package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final String f88688a;

    public h8e1(String str) {
        this.f88688a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8e1) && wj50.m88271j(this.f88688a, ((h8e1) obj).f88688a);
    }

    public final int hashCode() {
        return this.f88688a.hashCode();
    }
}
