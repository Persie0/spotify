package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pt41 implements ev41 {

    /* JADX INFO: renamed from: a */
    public final String f181041a;

    public pt41(String str) {
        this.f181041a = str;
    }

    @Override // p204p.ev41
    /* JADX INFO: renamed from: a */
    public final String mo40094a() {
        return this.f181041a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt41) && wj50.m88271j(this.f181041a, ((pt41) obj).f181041a);
    }

    public final int hashCode() {
        return this.f181041a.hashCode();
    }
}
