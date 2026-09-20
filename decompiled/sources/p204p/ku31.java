package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ku31 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f126444a;

    /* JADX INFO: renamed from: b */
    public final bv31 f126445b;

    public ku31(CharSequence charSequence, bv31 bv31Var) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.f126444a = charSequence;
        this.f126445b = bv31Var;
    }

    /* JADX INFO: renamed from: a */
    public final ku31 m57375a(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.f126444a.subSequence(i, i2);
        bv31 bv31Var = this.f126445b;
        return new ku31(charSequenceSubSequence, (bv31Var == null || (i3 = i2 - i) == 0) ? null : new bv31(bv31Var.f31266a, bv31Var.f31267b + i, bv31Var.f31268c + i, i3));
    }
}
