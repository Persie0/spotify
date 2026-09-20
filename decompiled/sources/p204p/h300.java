package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class h300 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f87103a;

    /* JADX INFO: renamed from: b */
    public final int f87104b;

    /* JADX INFO: renamed from: c */
    public final String f87105c;

    /* JADX INFO: renamed from: d */
    public final String f87106d;

    public h300(int i, String str, int i2, String str2) {
        this.f87103a = i;
        this.f87104b = i2;
        this.f87105c = str;
        this.f87106d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h300 h300Var = (h300) obj;
        int i = this.f87103a - h300Var.f87103a;
        return i == 0 ? this.f87104b - h300Var.f87104b : i;
    }
}
