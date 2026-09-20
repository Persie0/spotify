package p204p;

import com.google.android.recaptcha.internal.zzaez;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class r9f1 extends q9f1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f197054c;

    public r9f1(byte[] bArr) {
        bArr.getClass();
        this.f197054c = bArr;
    }

    @Override // p204p.q9f1
    /* JADX INFO: renamed from: A */
    public final boolean mo69375A(s9f1 s9f1Var, int i, int i2) {
        int iMo69377e = s9f1Var.mo69377e();
        byte[] bArr = this.f197054c;
        if (i2 > iMo69377e) {
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 <= s9f1Var.mo69377e()) {
            if (s9f1Var instanceof r9f1) {
                return s9f1.m77578b(0, i, i2, bArr, ((r9f1) s9f1Var).f197054c);
            }
            if (!(s9f1Var instanceof p9f1)) {
                return s9f1Var.mo69379i(i, i3).equals(mo69379i(0, i2));
            }
            p9f1 p9f1Var = (p9f1) s9f1Var;
            return s9f1.m77578b(0, p9f1Var.f175238d + i, i2, bArr, p9f1Var.f175237c);
        }
        int iMo69377e2 = s9f1Var.mo69377e();
        int length3 = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iMo69377e2).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new IllegalArgumentException(s571.m77248g(iMo69377e2, ", ", sb2));
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: d */
    public final byte mo69376d(int i) {
        return this.f197054c[i];
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: e */
    public final int mo69377e() {
        return this.f197054c.length;
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: f */
    public final s9f1 mo69378f(int i, int i2) {
        byte[] bArr = this.f197054c;
        int iM77577a = s9f1.m77577a(i, i2, bArr.length);
        return iM77577a == 0 ? s9f1.f206952b : new p9f1(bArr, i, iM77577a);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: i */
    public final s9f1 mo69379i(int i, int i2) {
        byte[] bArr = this.f197054c;
        int iM77577a = s9f1.m77577a(i, i2, bArr.length);
        return iM77577a == 0 ? s9f1.f206952b : new p9f1(bArr, i, iM77577a);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: j */
    public final void mo69380j(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f197054c, i, bArr, i2, i3);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: l */
    public final ByteBuffer mo69381l() {
        return ByteBuffer.wrap(this.f197054c).asReadOnlyBuffer();
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: m */
    public final void mo69382m(w780 w780Var) throws zzaez {
        byte[] bArr = this.f197054c;
        w780Var.m87376o0(0, bArr, bArr.length);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: n */
    public final String mo69383n() {
        return new String(this.f197054c, StandardCharsets.UTF_8);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: o */
    public final boolean mo69384o(s9f1 s9f1Var) {
        boolean z = s9f1Var instanceof r9f1;
        byte[] bArr = this.f197054c;
        if (z) {
            return Arrays.equals(bArr, ((r9f1) s9f1Var).f197054c);
        }
        return s9f1Var instanceof p9f1 ? mo69375A(s9f1Var, 0, bArr.length) : s9f1Var.mo69384o(this);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: q */
    public final int mo69385q(int i, int i2, int i3) {
        return abf1.m25351b(i, this.f197054c, i2, i3);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: r */
    public final v9f1 mo69386r() {
        byte[] bArr = this.f197054c;
        return v9f1.m84963e(0, bArr, bArr.length);
    }
}
