package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cd81 {

    /* JADX INFO: renamed from: a */
    public final String f36832a;

    /* JADX INFO: renamed from: b */
    public final String f36833b;

    public cd81(String str, String str2) {
        this.f36832a = str;
        this.f36833b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd81)) {
            return false;
        }
        cd81 cd81Var = (cd81) obj;
        return wj50.m88271j(this.f36832a, cd81Var.f36832a) && wj50.m88271j(this.f36833b, cd81Var.f36833b);
    }

    public final int hashCode() {
        return this.f36833b.hashCode() + (this.f36832a.hashCode() * 31);
    }
}
