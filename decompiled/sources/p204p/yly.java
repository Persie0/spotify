package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yly implements hmy {

    /* JADX INFO: renamed from: a */
    public final koy f274119a;

    /* JADX INFO: renamed from: b */
    public final String f274120b;

    public yly(koy koyVar, String str) {
        this.f274119a = koyVar;
        this.f274120b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yly)) {
            return false;
        }
        yly ylyVar = (yly) obj;
        return wj50.m88271j(this.f274119a, ylyVar.f274119a) && wj50.m88271j(this.f274120b, ylyVar.f274120b);
    }

    public final int hashCode() {
        return this.f274120b.hashCode() + (this.f274119a.hashCode() * 31);
    }
}
