package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jo60 extends hqg1 {

    /* JADX INFO: renamed from: c */
    public final String f114337c;

    /* JADX INFO: renamed from: d */
    public final String f114338d;

    public jo60(String str, String str2) {
        this.f114337c = str;
        this.f114338d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo60)) {
            return false;
        }
        jo60 jo60Var = (jo60) obj;
        return wj50.m88271j(this.f114337c, jo60Var.f114337c) && wj50.m88271j(this.f114338d, jo60Var.f114338d);
    }

    public final int hashCode() {
        return this.f114338d.hashCode() + (this.f114337c.hashCode() * 31);
    }

    public final String toString() {
        return this.f114337c + this.f114338d;
    }
}
