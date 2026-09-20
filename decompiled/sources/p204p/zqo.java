package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zqo {

    /* JADX INFO: renamed from: a */
    public final p340 f285424a;

    /* JADX INFO: renamed from: b */
    public final boolean f285425b;

    public zqo(p340 p340Var, boolean z) {
        this.f285424a = p340Var;
        this.f285425b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqo)) {
            return false;
        }
        zqo zqoVar = (zqo) obj;
        return wj50.m88271j(this.f285424a, zqoVar.f285424a) && this.f285425b == zqoVar.f285425b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285425b) + (this.f285424a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.f285424a);
        sb.append(", isSampled=");
        return s571.m77253l(sb, this.f285425b, ')');
    }
}
