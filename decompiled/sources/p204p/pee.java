package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pee extends see {

    /* JADX INFO: renamed from: a */
    public final String f176739a;

    /* JADX INFO: renamed from: b */
    public final String f176740b;

    /* JADX INFO: renamed from: c */
    public final boolean f176741c;

    public pee(String str, String str2, boolean z) {
        this.f176739a = str;
        this.f176740b = str2;
        this.f176741c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pee)) {
            return false;
        }
        pee peeVar = (pee) obj;
        return wj50.m88271j(this.f176739a, peeVar.f176739a) && wj50.m88271j(this.f176740b, peeVar.f176740b) && this.f176741c == peeVar.f176741c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f176741c) + s571.m77243b(this.f176739a.hashCode() * 31, 31, this.f176740b);
    }
}
