package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hai extends nai {

    /* JADX INFO: renamed from: a */
    public final String f89222a;

    /* JADX INFO: renamed from: b */
    public final String f89223b;

    /* JADX INFO: renamed from: c */
    public final d850 f89224c;

    public hai(String str, String str2, d850 d850Var) {
        this.f89222a = str;
        this.f89223b = str2;
        this.f89224c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hai)) {
            return false;
        }
        hai haiVar = (hai) obj;
        return wj50.m88271j(this.f89222a, haiVar.f89222a) && wj50.m88271j(this.f89223b, haiVar.f89223b) && wj50.m88271j(this.f89224c, haiVar.f89224c);
    }

    public final int hashCode() {
        return this.f89224c.hashCode() + s571.m77243b(this.f89222a.hashCode() * 31, 31, this.f89223b);
    }
}
