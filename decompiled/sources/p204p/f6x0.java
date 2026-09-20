package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f6x0 extends y6x0 {

    /* JADX INFO: renamed from: a */
    public final String f66514a;

    public f6x0(String str) {
        this.f66514a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6x0) && wj50.m88271j(this.f66514a, ((f6x0) obj).f66514a);
    }

    public final int hashCode() {
        return this.f66514a.hashCode();
    }
}
