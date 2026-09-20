package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jua {

    /* JADX INFO: renamed from: a */
    public int f116061a;

    /* JADX INFO: renamed from: b */
    public Object f116062b = new hj5();

    /* JADX INFO: renamed from: a */
    public abstract void mo607a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo608b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo609c();

    /* JADX INFO: renamed from: d */
    public abstract void mo610d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo611e(int i);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo612f();

    /* JADX INFO: renamed from: g */
    public abstract ava mo613g();

    /* JADX INFO: renamed from: h */
    public abstract double mo614h();

    /* JADX INFO: renamed from: i */
    public abstract int mo615i();

    /* JADX INFO: renamed from: j */
    public abstract int mo616j();

    /* JADX INFO: renamed from: k */
    public abstract long mo617k();

    /* JADX INFO: renamed from: l */
    public abstract float mo618l();

    /* JADX INFO: renamed from: m */
    public abstract int mo619m();

    /* JADX INFO: renamed from: n */
    public abstract long mo620n();

    /* JADX INFO: renamed from: o */
    public abstract int mo621o();

    /* JADX INFO: renamed from: p */
    public abstract long mo622p();

    /* JADX INFO: renamed from: q */
    public abstract int mo623q();

    /* JADX INFO: renamed from: r */
    public abstract long mo624r();

    /* JADX INFO: renamed from: s */
    public abstract String mo625s();

    /* JADX INFO: renamed from: t */
    public abstract String mo626t();

    /* JADX INFO: renamed from: u */
    public abstract int mo627u();

    /* JADX INFO: renamed from: v */
    public abstract int mo628v();

    /* JADX INFO: renamed from: w */
    public abstract long mo629w();

    /* JADX INFO: renamed from: x */
    public void m54334x(byte[] bArr) {
        synchronized (this) {
            int i = this.f116061a;
            if (bArr.length + i < xj5.f262048a) {
                this.f116061a = i + (bArr.length / 2);
                ((hj5) this.f116062b).addLast(bArr);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public byte[] m54335y(int i) {
        byte[] bArr;
        synchronized (this) {
            hj5 hj5Var = (hj5) this.f116062b;
            bArr = null;
            byte[] bArr2 = (byte[]) (hj5Var.isEmpty() ? null : hj5Var.removeLast());
            if (bArr2 != null) {
                this.f116061a -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }
}
