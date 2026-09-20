package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class em51 extends DrawStyle {

    /* JADX INFO: renamed from: a */
    public final float f60824a;

    /* JADX INFO: renamed from: b */
    public final float f60825b;

    /* JADX INFO: renamed from: c */
    public final int f60826c;

    /* JADX INFO: renamed from: d */
    public final int f60827d;

    /* JADX INFO: renamed from: e */
    public final vk4 f60828e;

    public em51(float f, float f2, int i, int i2, vk4 vk4Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        vk4Var = (i3 & 16) != 0 ? null : vk4Var;
        this.f60824a = f;
        this.f60825b = f2;
        this.f60826c = i;
        this.f60827d = i2;
        this.f60828e = vk4Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m39402a() {
        return this.f60826c;
    }

    /* JADX INFO: renamed from: b */
    public final int m39403b() {
        return this.f60827d;
    }

    /* JADX INFO: renamed from: c */
    public final float m39404c() {
        return this.f60825b;
    }

    /* JADX INFO: renamed from: d */
    public final vk4 m39405d() {
        return this.f60828e;
    }

    /* JADX INFO: renamed from: e */
    public final float m39406e() {
        return this.f60824a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em51)) {
            return false;
        }
        em51 em51Var = (em51) obj;
        return this.f60824a == em51Var.f60824a && this.f60825b == em51Var.f60825b && this.f60826c == em51Var.f60826c && this.f60827d == em51Var.f60827d && wj50.m88271j(this.f60828e, em51Var.f60828e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f60827d, mt60.m62800g(this.f60826c, AbstractC0000a.m8g(Float.hashCode(this.f60824a) * 31, 31, this.f60825b), 31), 31);
        vk4 vk4Var = this.f60828e;
        return iM62800g + (vk4Var != null ? vk4Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f60824a);
        sb.append(", miter=");
        sb.append(this.f60825b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.f60826c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.f60827d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=");
        sb.append(this.f60828e);
        sb.append(')');
        return sb.toString();
    }
}
