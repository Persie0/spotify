package p204p;

import androidx.compose.p002ui.graphics.ColorFilter;

/* JADX INFO: loaded from: classes6.dex */
public final class s6o0 {

    /* JADX INFO: renamed from: a */
    public final ColorFilter f206169a;

    /* JADX INFO: renamed from: b */
    public final mqm0 f206170b;

    public s6o0(ColorFilter colorFilter, mqm0 mqm0Var) {
        this.f206169a = colorFilter;
        this.f206170b = mqm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6o0)) {
            return false;
        }
        s6o0 s6o0Var = (s6o0) obj;
        return wj50.m88271j(this.f206169a, s6o0Var.f206169a) && wj50.m88271j(this.f206170b, s6o0Var.f206170b);
    }

    public final int hashCode() {
        return this.f206170b.hashCode() + (this.f206169a.hashCode() * 31);
    }
}
