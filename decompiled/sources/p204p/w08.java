package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w08 extends y0y {

    /* JADX INFO: renamed from: a */
    public final Integer f246666a;

    public w08(Integer num) {
        this.f246666a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0y)) {
            return false;
        }
        Integer num = this.f246666a;
        w08 w08Var = (w08) ((y0y) obj);
        if (num == null) {
            return w08Var.f246666a == null;
        }
        return num.equals(w08Var.f246666a);
    }

    public final int hashCode() {
        Integer num = this.f246666a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f246666a + "}";
    }
}
