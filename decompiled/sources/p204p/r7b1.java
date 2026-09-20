package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r7b1 implements Init, InterfaceC2207oa, a9f1, xeg1 {
    @Override // p204p.xeg1
    /* JADX INFO: renamed from: a */
    public h6h1 mo74896a(h6h1 h6h1Var, int i, int i2) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i < 0 || i > i2 || i2 > (length = (bArr = h6h1Var.f88099a).length) || i > i2 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            bArr2 = bArr3;
        }
        return new h6h1(bArr2);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        u300 u300Var = ((ihi) obj).f102296c;
        return u300Var == u300.WRAPPED_2025_TOP_100 || u300Var == u300.WRAPPED_2026_TOP_100 || u300Var == u300.ALL_TIME_TOP_SONGS_20_YEARS;
    }

    @Override // p204p.a9f1
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo24339b(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // p204p.xeg1
    /* JADX INFO: renamed from: c */
    public byte mo74897c(h6h1 h6h1Var, int i) {
        return h6h1Var.m46727b(i);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((p7b1) obj);
    }

    @Override // p204p.xeg1
    public xeg1 zzc() {
        return new r7b1();
    }
}
