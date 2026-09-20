package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class buz {

    /* JADX INFO: renamed from: a */
    public final String f31242a;

    /* JADX INFO: renamed from: b */
    public final vtz f31243b;

    public buz(String str) {
        vtz vtzVar = new vtz();
        this.f31242a = str;
        this.f31243b = vtzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buz)) {
            return false;
        }
        buz buzVar = (buz) obj;
        return wj50.m88271j(this.f31242a, buzVar.f31242a) && wj50.m88271j(this.f31243b, buzVar.f31243b);
    }

    public final int hashCode() {
        return this.f31243b.hashCode() + (this.f31242a.hashCode() * 31);
    }
}
