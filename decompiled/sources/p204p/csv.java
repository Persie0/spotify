package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class csv {

    /* JADX INFO: renamed from: a */
    public final String f41704a;

    /* JADX INFO: renamed from: b */
    public final boolean f41705b;

    public csv(String str, boolean z) {
        this.f41704a = str;
        this.f41705b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csv)) {
            return false;
        }
        csv csvVar = (csv) obj;
        return wj50.m88271j(this.f41704a, csvVar.f41704a) && this.f41705b == csvVar.f41705b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41705b) + (this.f41704a.hashCode() * 31);
    }
}
