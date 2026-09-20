package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class td40 {

    /* JADX INFO: renamed from: a */
    public final sd40 f219224a;

    /* JADX INFO: renamed from: b */
    public final int f219225b;

    public td40(sd40 sd40Var, int i) {
        this.f219224a = sd40Var;
        this.f219225b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td40)) {
            return false;
        }
        td40 td40Var = (td40) obj;
        return wj50.m88271j(this.f219224a, td40Var.f219224a) && this.f219225b == td40Var.f219225b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219225b) + (this.f219224a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f219224a);
        sb.append(", configFlags=");
        return edb.m38567p(sb, this.f219225b, ')');
    }
}
