package p204p;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class m28 {

    /* JADX INFO: renamed from: a */
    public final Size f139273a;

    /* JADX INFO: renamed from: b */
    public final Rect f139274b;

    /* JADX INFO: renamed from: c */
    public final ifb f139275c;

    /* JADX INFO: renamed from: d */
    public final int f139276d;

    /* JADX INFO: renamed from: e */
    public final boolean f139277e;

    public m28(Size size, Rect rect, ifb ifbVar, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f139273a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f139274b = rect;
        this.f139275c = ifbVar;
        this.f139276d = i;
        this.f139277e = z;
    }

    public final boolean equals(Object obj) {
        ifb ifbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m28) {
            m28 m28Var = (m28) obj;
            ifb ifbVar2 = m28Var.f139275c;
            if (this.f139273a.equals(m28Var.f139273a) && this.f139274b.equals(m28Var.f139274b) && ((ifbVar = this.f139275c) != null ? ifbVar.equals(ifbVar2) : ifbVar2 == null) && this.f139276d == m28Var.f139276d && this.f139277e == m28Var.f139277e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f139273a.hashCode() ^ 1000003) * 1000003) ^ this.f139274b.hashCode()) * 1000003;
        ifb ifbVar = this.f139275c;
        return ((((iHashCode ^ (ifbVar == null ? 0 : ifbVar.hashCode())) * 1000003) ^ this.f139276d) * 1000003) ^ (this.f139277e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.f139273a);
        sb.append(", inputCropRect=");
        sb.append(this.f139274b);
        sb.append(", cameraInternal=");
        sb.append(this.f139275c);
        sb.append(", rotationDegrees=");
        sb.append(this.f139276d);
        sb.append(", mirroring=");
        return edb.m38570s(sb, this.f139277e, "}");
    }
}
