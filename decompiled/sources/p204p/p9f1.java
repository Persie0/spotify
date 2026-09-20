package p204p;

import com.google.android.recaptcha.internal.zzaez;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class p9f1 extends q9f1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f175237c;

    /* JADX INFO: renamed from: d */
    public final int f175238d;

    /* JADX INFO: renamed from: e */
    public final int f175239e;

    public p9f1(byte[] bArr, int i, int i2) {
        s9f1.m77577a(i, i + i2, bArr.length);
        this.f175237c = bArr;
        this.f175238d = i;
        this.f175239e = i2;
    }

    @Override // p204p.q9f1
    /* JADX INFO: renamed from: A */
    public final boolean mo69375A(s9f1 s9f1Var, int i, int i2) {
        if (i2 > s9f1Var.mo69377e()) {
            int length = String.valueOf(i2).length();
            int i3 = this.f175239e;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(i3).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i + i2;
        if (i4 > s9f1Var.mo69377e()) {
            int iMo69377e = s9f1Var.mo69377e();
            int length2 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length2 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iMo69377e).length());
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IllegalArgumentException(s571.m77248g(iMo69377e, ", ", sb2));
        }
        boolean z = s9f1Var instanceof r9f1;
        byte[] bArr = this.f175237c;
        int i5 = this.f175238d;
        if (z) {
            return s9f1.m77578b(i5, i, i2, bArr, ((r9f1) s9f1Var).f197054c);
        }
        if (!(s9f1Var instanceof p9f1)) {
            return s9f1Var.mo69379i(i, i4).equals(mo69379i(i5, i2 + i5));
        }
        p9f1 p9f1Var = (p9f1) s9f1Var;
        return s9f1.m77578b(i5, p9f1Var.f175238d + i, i2, bArr, p9f1Var.f175237c);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: d */
    public final byte mo69376d(int i) {
        return this.f175237c[this.f175238d + i];
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: e */
    public final int mo69377e() {
        return this.f175239e;
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: f */
    public final s9f1 mo69378f(int i, int i2) {
        int iM77577a = s9f1.m77577a(i, i2, this.f175239e);
        if (iM77577a == 0) {
            return s9f1.f206952b;
        }
        return new p9f1(this.f175237c, this.f175238d + i, iM77577a);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: i */
    public final s9f1 mo69379i(int i, int i2) {
        int iM77577a = s9f1.m77577a(i, i2, this.f175239e);
        if (iM77577a == 0) {
            return s9f1.f206952b;
        }
        return new p9f1(this.f175237c, this.f175238d + i, iM77577a);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: j */
    public final void mo69380j(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f175237c, this.f175238d + i, bArr, i2, i3);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: l */
    public final ByteBuffer mo69381l() {
        return ByteBuffer.wrap(this.f175237c, this.f175238d, this.f175239e).asReadOnlyBuffer();
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: m */
    public final void mo69382m(w780 w780Var) throws zzaez {
        w780Var.m87376o0(this.f175238d, this.f175237c, this.f175239e);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: n */
    public final String mo69383n() {
        Charset charset = StandardCharsets.UTF_8;
        return new String(this.f175237c, this.f175238d, this.f175239e, charset);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: o */
    public final boolean mo69384o(s9f1 s9f1Var) {
        return ((s9f1Var instanceof r9f1) || (s9f1Var instanceof p9f1)) ? mo69375A(s9f1Var, 0, this.f175239e) : s9f1Var.mo69384o(this);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: q */
    public final int mo69385q(int i, int i2, int i3) {
        return abf1.m25351b(i, this.f175237c, this.f175238d + i2, i3);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: r */
    public final v9f1 mo69386r() {
        return v9f1.m84963e(this.f175238d, this.f175237c, this.f175239e);
    }
}
