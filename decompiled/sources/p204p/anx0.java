package p204p;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class anx0 {

    /* JADX INFO: renamed from: a */
    public final String f17514a;

    /* JADX INFO: renamed from: b */
    public final int f17515b;

    /* JADX INFO: renamed from: c */
    public final int f17516c;

    /* JADX INFO: renamed from: d */
    public final int f17517d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f17518e;

    public anx0(zmx0 zmx0Var) {
        this.f17514a = (String) zmx0Var.f284358d;
        this.f17515b = zmx0Var.f284355a;
        this.f17516c = zmx0Var.f284356b;
        int i = zmx0Var.f284357c;
        this.f17517d = i;
        CharSequence charSequence = (CharSequence) zmx0Var.f284359e;
        this.f17518e = charSequence;
        wj50.m88275l("The custom subtext message cannot be null if subtext is SUBTEXT_CUSTOM.", (i == 10000 && charSequence == null) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anx0)) {
            return false;
        }
        anx0 anx0Var = (anx0) obj;
        return this.f17514a.equals(anx0Var.f17514a) && this.f17515b == anx0Var.f17515b && this.f17516c == anx0Var.f17516c && this.f17517d == anx0Var.f17517d && TextUtils.equals(this.f17518e, anx0Var.f17518e);
    }

    public final int hashCode() {
        return Objects.hash(this.f17514a, Integer.valueOf(this.f17515b), Integer.valueOf(this.f17516c), Integer.valueOf(this.f17517d), this.f17518e);
    }
}
