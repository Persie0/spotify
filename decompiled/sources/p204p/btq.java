package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes.dex */
public final class btq {

    /* JADX INFO: renamed from: a */
    public final eht0 f30911a;

    /* JADX INFO: renamed from: b */
    public final int f30912b;

    /* JADX INFO: renamed from: c */
    public final int f30913c;

    public btq(Class cls, int i, int i2) {
        this(eht0.m39004a(cls), i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static btq m30467a(Class cls) {
        return new btq(cls, 1, 0);
    }

    /* JADX INFO: renamed from: b */
    public static btq m30468b(eht0 eht0Var) {
        return new btq(eht0Var, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof btq)) {
            return false;
        }
        btq btqVar = (btq) obj;
        return this.f30911a.equals(btqVar.f30911a) && this.f30912b == btqVar.f30912b && this.f30913c == btqVar.f30913c;
    }

    public final int hashCode() {
        return ((((this.f30911a.hashCode() ^ 1000003) * 1000003) ^ this.f30912b) * 1000003) ^ this.f30913c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f30911a);
        sb.append(", type=");
        int i = this.f30912b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f30913c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = ContextTrack.Metadata.KEY_PROVIDER;
        } else {
            if (i2 != 2) {
                throw new AssertionError(s571.m77246e(i2, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return dq60.m36616p(str2, "}", sb);
    }

    public btq(eht0 eht0Var, int i, int i2) {
        bga.m29092n(eht0Var, "Null dependency anInterface.");
        this.f30911a = eht0Var;
        this.f30912b = i;
        this.f30913c = i2;
    }
}
