package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qu7 implements su7 {

    /* JADX INFO: renamed from: a */
    public final int f192577a;

    /* JADX INFO: renamed from: b */
    public final t060 f192578b;

    public qu7(int i, t060 t060Var) {
        this.f192577a = i;
        this.f192578b = t060Var;
    }

    @Override // p204p.uu7
    /* JADX INFO: renamed from: a */
    public final int mo73877a() {
        return this.f192577a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu7)) {
            return false;
        }
        qu7 qu7Var = (qu7) obj;
        return this.f192577a == qu7Var.f192577a && this.f192578b.equals(qu7Var.f192578b);
    }

    public final int hashCode() {
        return this.f192578b.hashCode() + (Integer.hashCode(this.f192577a) * 31);
    }
}
