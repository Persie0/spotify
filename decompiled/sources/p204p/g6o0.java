package p204p;

import androidx.compose.p002ui.unit.TextUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class g6o0 {

    /* JADX INFO: renamed from: a */
    public final long f77086a;

    /* JADX INFO: renamed from: b */
    public final long f77087b;

    /* JADX INFO: renamed from: c */
    public final int f77088c;

    public g6o0(int i, long j, long j2) {
        this.f77086a = j;
        this.f77087b = j2;
        this.f77088c = i;
        tf71[] tf71VarArr = TextUnit.f546b;
        if ((j & 1095216660480L) == 0) {
            nt40.m65597a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            nt40.m65597a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6o0)) {
            return false;
        }
        g6o0 g6o0Var = (g6o0) obj;
        return TextUnit.m306a(this.f77086a, g6o0Var.f77086a) && TextUnit.m306a(this.f77087b, g6o0Var.f77087b) && this.f77088c == g6o0Var.f77088c;
    }

    public final int hashCode() {
        tf71[] tf71VarArr = TextUnit.f546b;
        return Integer.hashCode(this.f77088c) + dq60.m36605e(Long.hashCode(this.f77086a) * 31, this.f77087b, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) TextUnit.m311f(this.f77086a));
        sb.append(", height=");
        sb.append((Object) TextUnit.m311f(this.f77087b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.f77088c;
        if (i == 1) {
            str = "AboveBaseline";
        } else if (i == 2) {
            str = "Top";
        } else if (i == 3) {
            str = "Bottom";
        } else if (i == 4) {
            str = "Center";
        } else if (i == 5) {
            str = "TextTop";
        } else if (i == 6) {
            str = "TextBottom";
        } else {
            str = i == 7 ? "TextCenter" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
