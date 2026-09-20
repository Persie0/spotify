package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class up7 {

    /* JADX INFO: renamed from: a */
    public final zew f232587a;

    /* JADX INFO: renamed from: b */
    public final String f232588b;

    public up7(zew zewVar, String str) {
        this.f232587a = zewVar;
        this.f232588b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up7)) {
            return false;
        }
        up7 up7Var = (up7) obj;
        return this.f232587a == up7Var.f232587a && wj50.m88271j(this.f232588b, up7Var.f232588b);
    }

    public final int hashCode() {
        return this.f232588b.hashCode() + (this.f232587a.hashCode() * 31);
    }
}
