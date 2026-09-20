package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class vy7 {

    /* JADX INFO: renamed from: a */
    public final uy7 f245995a;

    /* JADX INFO: renamed from: b */
    public final String f245996b;

    /* JADX INFO: renamed from: c */
    public final File f245997c;

    public vy7(uy7 uy7Var, String str, File file) {
        this.f245995a = uy7Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f245996b = str;
        this.f245997c = file;
    }

    /* JADX INFO: renamed from: a */
    public final g4l m86710a() {
        return this.f245995a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vy7)) {
            return false;
        }
        vy7 vy7Var = (vy7) obj;
        return this.f245995a.equals(vy7Var.f245995a) && this.f245996b.equals(vy7Var.f245996b) && this.f245997c.equals(vy7Var.f245997c);
    }

    public final int hashCode() {
        return ((((this.f245995a.hashCode() ^ 1000003) * 1000003) ^ this.f245996b.hashCode()) * 1000003) ^ this.f245997c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f245995a + ", sessionId=" + this.f245996b + ", reportFile=" + this.f245997c + "}";
    }
}
