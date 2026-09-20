package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class s08 {

    /* JADX INFO: renamed from: a */
    public final Integer f204316a;

    /* JADX INFO: renamed from: b */
    public final Object f204317b;

    /* JADX INFO: renamed from: c */
    public final ler0 f204318c;

    public s08(Integer num, Object obj, ler0 ler0Var) {
        this.f204316a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f204317b = obj;
        this.f204318c = ler0Var;
    }

    /* JADX INFO: renamed from: a */
    public static s08 m76856a(Object obj) {
        return new s08(null, obj, ler0.f132669a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s08) {
            s08 s08Var = (s08) obj;
            Integer num = s08Var.f204316a;
            Integer num2 = this.f204316a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f204317b.equals(s08Var.f204317b) && this.f204318c.equals(s08Var.f204318c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f204316a;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f204317b.hashCode()) * 1000003) ^ this.f204318c.hashCode()) * (-721379959);
    }

    public final String toString() {
        return "Event{code=" + this.f204316a + ", payload=" + this.f204317b + ", priority=" + this.f204318c + ", productData=null, eventContext=null}";
    }
}
