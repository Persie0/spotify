package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cao0 {

    /* JADX INFO: renamed from: a */
    public final int f35845a;

    /* JADX INFO: renamed from: b */
    public final String f35846b;

    public cao0(int i, String str) {
        this.f35845a = i;
        this.f35846b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cao0)) {
            return false;
        }
        cao0 cao0Var = (cao0) obj;
        return this.f35845a == cao0Var.f35845a && wj50.m88271j(this.f35846b, cao0Var.f35846b);
    }

    public final int hashCode() {
        return this.f35846b.hashCode() + (Integer.hashCode(this.f35845a) * 31);
    }
}
