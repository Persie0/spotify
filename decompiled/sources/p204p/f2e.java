package p204p;

import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes.dex */
public final class f2e extends AbstractC2638z5 {

    /* JADX INFO: renamed from: f */
    public final Checksum f65157f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ g2e f65158g;

    public f2e(g2e g2eVar, Checksum checksum) {
        this.f65158g = g2eVar;
        checksum.getClass();
        this.f65157f = checksum;
    }

    @Override // p204p.c95
    /* JADX INFO: renamed from: F */
    public final nd20 mo25555F() {
        long value = this.f65157f.getValue();
        if (this.f65158g.f75897L0 == 32) {
            char[] cArr = nd20.f152641a;
            return new ld20((int) value);
        }
        char[] cArr2 = nd20.f152641a;
        return new md20(value);
    }

    @Override // p204p.AbstractC2638z5
    /* JADX INFO: renamed from: e0 */
    public final void mo40584e0(byte[] bArr, int i) {
        this.f65157f.update(bArr, 0, i);
    }
}
