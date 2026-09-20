package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qzj extends rzj {

    /* JADX INFO: renamed from: b */
    public final String f194215b;

    public qzj(String str) {
        super(str);
        this.f194215b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzj) && wj50.m88271j(this.f194215b, ((qzj) obj).f194215b);
    }

    public final int hashCode() {
        return this.f194215b.hashCode();
    }
}
