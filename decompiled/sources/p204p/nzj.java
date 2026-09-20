package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nzj extends rzj {

    /* JADX INFO: renamed from: b */
    public final String f160098b;

    public nzj(String str) {
        super(str);
        this.f160098b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzj) && wj50.m88271j(this.f160098b, ((nzj) obj).f160098b);
    }

    public final int hashCode() {
        return this.f160098b.hashCode();
    }
}
