package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uqz {

    /* JADX INFO: renamed from: a */
    public final String f233154a;

    /* JADX INFO: renamed from: b */
    public final int f233155b;

    public uqz(String str, int i) {
        this.f233154a = str;
        this.f233155b = i;
    }

    /* JADX INFO: renamed from: a */
    public static uqz m83822a(uqz uqzVar, int i) {
        return new uqz(uqzVar.f233154a, i);
    }

    /* JADX INFO: renamed from: b */
    public final String m83823b() {
        return this.f233154a;
    }

    /* JADX INFO: renamed from: c */
    public final int m83824c() {
        return this.f233155b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqz)) {
            return false;
        }
        uqz uqzVar = (uqz) obj;
        return wj50.m88271j(this.f233154a, uqzVar.f233154a) && this.f233155b == uqzVar.f233155b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f233155b) + (this.f233154a.hashCode() * 31);
    }
}
