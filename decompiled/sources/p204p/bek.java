package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bek {

    /* JADX INFO: renamed from: a */
    public final pwb f26379a;

    /* JADX INFO: renamed from: b */
    public final aek f26380b;

    public bek(pwb pwbVar, aek aekVar) {
        this.f26379a = pwbVar;
        this.f26380b = aekVar;
    }

    /* JADX INFO: renamed from: a */
    public final aek m28942a() {
        return this.f26380b;
    }

    /* JADX INFO: renamed from: b */
    public final pwb m28943b() {
        return this.f26379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bek)) {
            return false;
        }
        bek bekVar = (bek) obj;
        return wj50.m88271j(this.f26379a, bekVar.f26379a) && wj50.m88271j(this.f26380b, bekVar.f26380b);
    }

    public final int hashCode() {
        return this.f26380b.hashCode() + (this.f26379a.hashCode() * 31);
    }
}
