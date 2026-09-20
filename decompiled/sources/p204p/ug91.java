package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ug91 {

    /* JADX INFO: renamed from: a */
    public final int f230052a;

    /* JADX INFO: renamed from: b */
    public final Integer f230053b;

    public ug91(int i, int i2) {
        Integer numValueOf = (i2 & 8) != 0 ? null : Integer.valueOf(R.string.opt_in_trial_dialog_no_cc_required_with_period);
        this.f230052a = i;
        this.f230053b = numValueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug91)) {
            return false;
        }
        ug91 ug91Var = (ug91) obj;
        return this.f230052a == ug91Var.f230052a && wj50.m88271j(this.f230053b, ug91Var.f230053b);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(R.string.opt_in_trial_dialog_failure_try_again, mt60.m62800g(R.string.opt_in_trial_dialog_failure_subtitle, Integer.hashCode(this.f230052a) * 31, 31), 31);
        Integer num = this.f230053b;
        return iM62800g + (num == null ? 0 : num.hashCode());
    }
}
