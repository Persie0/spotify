package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mks {

    /* JADX INFO: renamed from: a */
    public final String f144665a;

    /* JADX INFO: renamed from: b */
    public final int f144666b;

    /* JADX INFO: renamed from: c */
    public final Long f144667c;

    public mks(int i, Long l, String str) {
        this.f144665a = str;
        this.f144666b = i;
        this.f144667c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mks)) {
            return false;
        }
        mks mksVar = (mks) obj;
        return wj50.m88271j(this.f144665a, mksVar.f144665a) && this.f144666b == mksVar.f144666b && wj50.m88271j(this.f144667c, mksVar.f144667c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f144666b, this.f144665a.hashCode() * 31, 31);
        Long l = this.f144667c;
        return iM40938f + (l == null ? 0 : l.hashCode());
    }

    public /* synthetic */ mks(String str, int i, int i2) {
        this((i2 & 2) != 0 ? 2 : i, (Long) null, str);
    }
}
