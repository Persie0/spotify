package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s8u implements r8u {

    /* JADX INFO: renamed from: a */
    public final int f206793a;

    /* JADX INFO: renamed from: b */
    public int f206794b = -1;

    /* JADX INFO: renamed from: c */
    public int f206795c = -1;

    public s8u(int i) {
        this.f206793a = i;
    }

    @Override // p204p.r8u
    /* JADX INFO: renamed from: a */
    public final boolean mo52222a(CharSequence charSequence, int i, int i2, ep91 ep91Var) {
        int i3 = this.f206793a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f206794b = i;
        this.f206795c = i2;
        return false;
    }

    @Override // p204p.r8u
    public final Object getResult() {
        return this;
    }
}
