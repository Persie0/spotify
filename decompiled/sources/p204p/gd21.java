package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class gd21 {

    /* JADX INFO: renamed from: a */
    public final String f78713a;

    /* JADX INFO: renamed from: b */
    public final int f78714b = R.color.light_invertedlight_text_brightaccent;

    /* JADX INFO: renamed from: c */
    public final qe70 f78715c;

    /* JADX WARN: Multi-variable type inference failed */
    public gd21(String str, gh00 gh00Var, int i) {
        this.f78713a = str;
        this.f78715c = (qe70) gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd21)) {
            return false;
        }
        gd21 gd21Var = (gd21) obj;
        return wj50.m88271j(this.f78713a, gd21Var.f78713a) && this.f78714b == gd21Var.f78714b && wj50.m88271j(this.f78715c, gd21Var.f78715c);
    }

    public final int hashCode() {
        return this.f78715c.hashCode() + mt60.m62800g(this.f78714b, this.f78713a.hashCode() * 31, 31);
    }
}
