package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xki implements sli {

    /* JADX INFO: renamed from: a */
    public final String f262379a;

    /* JADX INFO: renamed from: b */
    public final String f262380b;

    public xki(String str, String str2) {
        this.f262379a = str;
        this.f262380b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m91283a() {
        return this.f262380b;
    }

    /* JADX INFO: renamed from: b */
    public final String m91284b() {
        return this.f262379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xki)) {
            return false;
        }
        xki xkiVar = (xki) obj;
        return wj50.m88271j(this.f262379a, xkiVar.f262379a) && wj50.m88271j(this.f262380b, xkiVar.f262380b);
    }

    public final int hashCode() {
        return this.f262380b.hashCode() + (this.f262379a.hashCode() * 31);
    }
}
