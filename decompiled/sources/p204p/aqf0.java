package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aqf0 {

    /* JADX INFO: renamed from: a */
    public final String f18239a;

    /* JADX INFO: renamed from: b */
    public final String f18240b;

    /* JADX INFO: renamed from: c */
    public final String f18241c;

    public aqf0(String str, String str2, String str3) {
        this.f18239a = str;
        this.f18240b = str2;
        this.f18241c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqf0)) {
            return false;
        }
        aqf0 aqf0Var = (aqf0) obj;
        return wj50.m88271j(this.f18239a, aqf0Var.f18239a) && wj50.m88271j(this.f18240b, aqf0Var.f18240b) && wj50.m88271j(this.f18241c, aqf0Var.f18241c);
    }

    public final int hashCode() {
        return this.f18241c.hashCode() + s571.m77243b(this.f18239a.hashCode() * 31, 31, this.f18240b);
    }
}
