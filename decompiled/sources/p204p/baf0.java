package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class baf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final String f25195b;

    public baf0(String str) {
        super(true);
        this.f25195b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof baf0) && wj50.m88271j(this.f25195b, ((baf0) obj).f25195b);
    }

    public final int hashCode() {
        return this.f25195b.hashCode();
    }
}
