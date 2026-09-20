package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m8b0 extends exh0 implements dp70 {

    /* JADX INFO: renamed from: M0 */
    public int f141002M0;

    /* JADX INFO: renamed from: N0 */
    public int f141003N0;

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        long jM38110a;
        long jM38113d = e8j.m38113d(j, epv0.m39682b(this.f141002M0, this.f141003N0));
        if (b8j.m28429h(j) == Integer.MAX_VALUE && b8j.m28430i(j) != Integer.MAX_VALUE) {
            int i = (int) (jM38113d >> 32);
            int i2 = (this.f141003N0 * i) / this.f141002M0;
            jM38110a = e8j.m38110a(i, i, i2, i2);
        } else if (b8j.m28430i(j) != Integer.MAX_VALUE || b8j.m28429h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jM38113d >> 32);
            int i4 = (int) (jM38113d & 4294967295L);
            jM38110a = e8j.m38110a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jM38113d & 4294967295L);
            int i6 = (this.f141002M0 * i5) / this.f141003N0;
            jM38110a = e8j.m38110a(i6, i6, i5, i5);
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(jM38110a);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2000j2(t5o0VarMo39619B, 20));
    }
}
