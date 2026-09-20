package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e3w0 extends j3w0 {

    /* JADX INFO: renamed from: a */
    public final String f55897a;

    public e3w0(String str) {
        this.f55897a = str;
    }

    @Override // p204p.j3w0
    /* JADX INFO: renamed from: a */
    public final String mo34897a() {
        return this.f55897a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3w0) && wj50.m88271j(this.f55897a, ((e3w0) obj).f55897a);
    }

    public final int hashCode() {
        String str = this.f55897a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
