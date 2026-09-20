package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class raz {

    /* JADX INFO: renamed from: a */
    public final String f197410a;

    /* JADX INFO: renamed from: b */
    public final String f197411b;

    public raz(String str, String str2) {
        this.f197410a = str;
        this.f197411b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raz)) {
            return false;
        }
        raz razVar = (raz) obj;
        return wj50.m88271j(this.f197410a, razVar.f197410a) && wj50.m88271j(this.f197411b, razVar.f197411b);
    }

    public final int hashCode() {
        String str = this.f197410a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f197411b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f197410a);
        sb.append(", authToken=");
        return dq60.m36617q(sb, this.f197411b, ')');
    }
}
