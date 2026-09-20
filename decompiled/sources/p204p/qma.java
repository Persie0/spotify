package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qma {

    /* JADX INFO: renamed from: a */
    public final String f190169a;

    /* JADX INFO: renamed from: b */
    public final String f190170b;

    /* JADX INFO: renamed from: c */
    public final String f190171c;

    public qma(String str, String str2, String str3) {
        this.f190169a = str;
        this.f190170b = str2;
        this.f190171c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma)) {
            return false;
        }
        qma qmaVar = (qma) obj;
        return wj50.m88271j(this.f190169a, qmaVar.f190169a) && wj50.m88271j(this.f190170b, qmaVar.f190170b) && wj50.m88271j(this.f190171c, qmaVar.f190171c);
    }

    public final int hashCode() {
        return this.f190171c.hashCode() + s571.m77243b(this.f190169a.hashCode() * 31, 31, this.f190170b);
    }
}
