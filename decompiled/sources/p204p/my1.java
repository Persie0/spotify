package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class my1 implements ny1 {

    /* JADX INFO: renamed from: a */
    public final String f148248a;

    public my1(String str) {
        this.f148248a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my1) && wj50.m88271j(this.f148248a, ((my1) obj).f148248a);
    }

    public final int hashCode() {
        return this.f148248a.hashCode();
    }
}
