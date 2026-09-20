package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bha {

    /* JADX INFO: renamed from: a */
    public final br70 f27124a;

    /* JADX INFO: renamed from: b */
    public final int f27125b;

    /* JADX INFO: renamed from: c */
    public final int f27126c;

    public bha(br70 br70Var, int i, int i2) {
        this.f27124a = br70Var;
        this.f27125b = i;
        this.f27126c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bha)) {
            return false;
        }
        bha bhaVar = (bha) obj;
        return this.f27124a == bhaVar.f27124a && this.f27125b == bhaVar.f27125b && this.f27126c == bhaVar.f27126c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27126c) + mt60.m62800g(this.f27125b, this.f27124a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f27124a + ", horizontalAlignment=" + ((Object) ib3.m50115c(this.f27125b)) + ", verticalAlignment=" + ((Object) kb3.m55925c(this.f27126c)) + ')';
    }
}
