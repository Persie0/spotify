package p204p;

import androidx.compose.p002ui.unit.TextUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class wt20 {

    /* JADX INFO: renamed from: a */
    public final long f254801a;

    /* JADX INFO: renamed from: b */
    public final long f254802b;

    /* JADX INFO: renamed from: c */
    public final float f254803c;

    public wt20(float f, long j, long j2) {
        this.f254801a = j;
        this.f254802b = j2;
        this.f254803c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt20)) {
            return false;
        }
        wt20 wt20Var = (wt20) obj;
        return TextUnit.m306a(this.f254801a, wt20Var.f254801a) && TextUnit.m306a(this.f254802b, wt20Var.f254802b) && Float.compare(this.f254803c, wt20Var.f254803c) == 0;
    }

    public final int hashCode() {
        tf71[] tf71VarArr = TextUnit.f546b;
        return Float.hashCode(this.f254803c) + dq60.m36605e(Long.hashCode(this.f254801a) * 31, this.f254802b, 31);
    }
}
