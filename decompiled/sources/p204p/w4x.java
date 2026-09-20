package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w4x {

    /* JADX INFO: renamed from: a */
    public final String f247909a;

    /* JADX INFO: renamed from: b */
    public final String f247910b;

    /* JADX INFO: renamed from: c */
    public final String f247911c;

    public w4x(String str, String str2, String str3) {
        this.f247909a = str;
        this.f247910b = str2;
        this.f247911c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4x)) {
            return false;
        }
        w4x w4xVar = (w4x) obj;
        return wj50.m88271j(this.f247909a, w4xVar.f247909a) && wj50.m88271j(this.f247910b, w4xVar.f247910b) && wj50.m88271j(this.f247911c, w4xVar.f247911c);
    }

    public final int hashCode() {
        return this.f247911c.hashCode() + s571.m77243b(this.f247909a.hashCode() * 31, 31, this.f247910b);
    }
}
