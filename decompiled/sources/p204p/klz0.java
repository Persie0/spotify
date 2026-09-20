package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class klz0 {

    /* JADX INFO: renamed from: a */
    public final gb20 f124014a;

    /* JADX INFO: renamed from: b */
    public final long f124015b;

    /* JADX INFO: renamed from: c */
    public final int f124016c;

    /* JADX INFO: renamed from: d */
    public final boolean f124017d;

    public klz0(gb20 gb20Var, long j, int i, boolean z) {
        this.f124014a = gb20Var;
        this.f124015b = j;
        this.f124016c = i;
        this.f124017d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klz0)) {
            return false;
        }
        klz0 klz0Var = (klz0) obj;
        return this.f124014a == klz0Var.f124014a && Offset.m253c(this.f124015b, klz0Var.f124015b) && this.f124016c == klz0Var.f124016c && this.f124017d == klz0Var.f124017d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124017d) + f710.m40938f(this.f124016c, dq60.m36605e(this.f124014a.hashCode() * 31, this.f124015b, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f124014a);
        sb.append(", position=");
        sb.append((Object) Offset.m259i(this.f124015b));
        sb.append(", anchor=");
        int i = this.f124016c;
        if (i == 1) {
            str = "Left";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Right";
        } else {
            str = "Middle";
        }
        sb.append(str);
        sb.append(", visible=");
        return s571.m77253l(sb, this.f124017d, ')');
    }
}
