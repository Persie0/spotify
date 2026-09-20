package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ilt implements pmt {

    /* JADX INFO: renamed from: a */
    public final String f103475a;

    /* JADX INFO: renamed from: b */
    public final String f103476b;

    public ilt(String str, String str2) {
        this.f103475a = str;
        this.f103476b = str2;
    }

    /* JADX INFO: renamed from: b */
    public final String m51042b() {
        return this.f103476b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilt)) {
            return false;
        }
        ilt iltVar = (ilt) obj;
        return wj50.m88271j(this.f103475a, iltVar.f103475a) && wj50.m88271j(this.f103476b, iltVar.f103476b);
    }

    public final int hashCode() {
        return this.f103476b.hashCode() + (this.f103475a.hashCode() * 31);
    }
}
