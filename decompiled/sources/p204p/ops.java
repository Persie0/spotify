package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ops {

    /* JADX INFO: renamed from: a */
    public final String f168013a;

    /* JADX INFO: renamed from: b */
    public final String f168014b;

    public ops(String str, String str2) {
        this.f168013a = str;
        this.f168014b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ops)) {
            return false;
        }
        ops opsVar = (ops) obj;
        return wj50.m88271j(this.f168013a, opsVar.f168013a) && wj50.m88271j(this.f168014b, opsVar.f168014b);
    }

    public final int hashCode() {
        return this.f168014b.hashCode() + (this.f168013a.hashCode() * 31);
    }
}
