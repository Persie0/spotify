package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cpf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final int f40551a;

    /* JADX INFO: renamed from: b */
    public final boolean f40552b;

    /* JADX INFO: renamed from: c */
    public final int f40553c;

    public cpf0(int i, boolean z, int i2) {
        this.f40551a = i;
        this.f40552b = z;
        this.f40553c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpf0)) {
            return false;
        }
        cpf0 cpf0Var = (cpf0) obj;
        return this.f40551a == cpf0Var.f40551a && this.f40552b == cpf0Var.f40552b && this.f40553c == cpf0Var.f40553c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40553c) + s571.m77245d(Integer.hashCode(this.f40551a) * 31, 31, this.f40552b);
    }
}
