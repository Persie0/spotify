package p204p;

import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes.dex */
public final class g2e extends y85 implements Serializable {

    /* JADX INFO: renamed from: L0 */
    public final int f75897L0 = 32;

    /* JADX INFO: renamed from: M0 */
    public final String f75898M0;

    /* JADX INFO: renamed from: Z */
    public final vd20 f75899Z;

    public g2e(vd20 vd20Var, String str) {
        this.f75899Z = vd20Var;
        this.f75898M0 = str;
    }

    public final String toString() {
        return this.f75898M0;
    }

    @Override // p204p.y85
    /* JADX INFO: renamed from: w */
    public final c95 mo28837w() {
        return new f2e(this, (Checksum) this.f75899Z.get());
    }
}
