package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bet implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f26423a;

    /* JADX INFO: renamed from: b */
    public final String f26424b;

    public bet(String str, String str2) {
        this.f26423a = str;
        this.f26424b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bet)) {
            return false;
        }
        bet betVar = (bet) obj;
        return wj50.m88271j(this.f26423a, betVar.f26423a) && wj50.m88271j(this.f26424b, betVar.f26424b);
    }

    public final int hashCode() {
        return this.f26424b.hashCode() + (this.f26423a.hashCode() * 31);
    }
}
