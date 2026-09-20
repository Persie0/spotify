package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ai61 {

    /* JADX INFO: renamed from: a */
    public String f15903a;

    /* JADX INFO: renamed from: b */
    public boolean f15904b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ai61.class != obj.getClass()) {
            return false;
        }
        ai61 ai61Var = (ai61) obj;
        return this.f15903a.equals(ai61Var.f15903a) && this.f15904b == ai61Var.f15904b;
    }

    public final int hashCode() {
        int i = ((this.f15904b ? 1 : 0) + 1) * 31;
        String str = this.f15903a;
        return i + (str == null ? 0 : str.hashCode());
    }
}
