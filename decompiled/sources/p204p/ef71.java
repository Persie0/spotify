package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ef71 {

    /* JADX INFO: renamed from: a */
    public final String f58973a;

    /* JADX INFO: renamed from: b */
    public String f58974b;

    /* JADX INFO: renamed from: c */
    public boolean f58975c = false;

    /* JADX INFO: renamed from: d */
    public rsm0 f58976d = null;

    public ef71(String str, String str2) {
        this.f58973a = str;
        this.f58974b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef71)) {
            return false;
        }
        ef71 ef71Var = (ef71) obj;
        return wj50.m88271j(this.f58973a, ef71Var.f58973a) && wj50.m88271j(this.f58974b, ef71Var.f58974b) && this.f58975c == ef71Var.f58975c && wj50.m88271j(this.f58976d, ef71Var.f58976d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f58973a.hashCode() * 31, 31, this.f58974b), 31, this.f58975c);
        rsm0 rsm0Var = this.f58976d;
        return iM77245d + (rsm0Var == null ? 0 : rsm0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f58976d);
        sb.append(", isShowingSubstitution=");
        return s571.m77253l(sb, this.f58975c, ')');
    }
}
