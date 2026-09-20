package p204p;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class o18 {

    /* JADX INFO: renamed from: a */
    public final UUID f160640a;

    /* JADX INFO: renamed from: b */
    public final int f160641b;

    /* JADX INFO: renamed from: c */
    public final int f160642c;

    /* JADX INFO: renamed from: d */
    public final Rect f160643d;

    /* JADX INFO: renamed from: e */
    public final Size f160644e;

    /* JADX INFO: renamed from: f */
    public final int f160645f;

    /* JADX INFO: renamed from: g */
    public final boolean f160646g;

    public o18(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f160640a = uuid;
        this.f160641b = i;
        this.f160642c = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f160643d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f160644e = size;
        this.f160645f = i3;
        this.f160646g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o18)) {
            return false;
        }
        o18 o18Var = (o18) obj;
        return this.f160640a.equals(o18Var.f160640a) && this.f160641b == o18Var.f160641b && this.f160642c == o18Var.f160642c && this.f160643d.equals(o18Var.f160643d) && this.f160644e.equals(o18Var.f160644e) && this.f160645f == o18Var.f160645f && this.f160646g == o18Var.f160646g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f160640a.hashCode() ^ 1000003) * 1000003) ^ this.f160641b) * 1000003) ^ this.f160642c) * 1000003) ^ this.f160643d.hashCode()) * 1000003) ^ this.f160644e.hashCode()) * 1000003) ^ this.f160645f) * 1000003) ^ (this.f160646g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.f160640a);
        sb.append(", getTargets=");
        sb.append(this.f160641b);
        sb.append(", getFormat=");
        sb.append(this.f160642c);
        sb.append(", getCropRect=");
        sb.append(this.f160643d);
        sb.append(", getSize=");
        sb.append(this.f160644e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f160645f);
        sb.append(", isMirroring=");
        return edb.m38570s(sb, this.f160646g, ", shouldRespectInputCropRect=false}");
    }
}
