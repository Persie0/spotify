package p204p;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes4.dex */
public final class g6f1 extends rul {

    /* JADX INFO: renamed from: a */
    public final PendingIntent f77043a;

    /* JADX INFO: renamed from: b */
    public final boolean f77044b;

    public g6f1(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f77043a = pendingIntent;
        this.f77044b = z;
    }

    @Override // p204p.rul
    /* JADX INFO: renamed from: c */
    public final PendingIntent mo43755c() {
        return this.f77043a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rul) {
            g6f1 g6f1Var = (g6f1) ((rul) obj);
            if (this.f77043a.equals(g6f1Var.f77043a) && this.f77044b == g6f1Var.f77044b) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.rul
    /* JADX INFO: renamed from: g */
    public final boolean mo43756g() {
        return this.f77044b;
    }

    public final int hashCode() {
        return ((this.f77043a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f77044b ? 1237 : 1231);
    }

    public final String toString() {
        return edb.m38570s(edb.m38572u("CrossDevicePromptInfo{pendingIntent=", this.f77043a.toString(), ", isNoOp="), this.f77044b, "}");
    }
}
