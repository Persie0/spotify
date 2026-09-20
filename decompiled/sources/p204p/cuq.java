package p204p;

import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class cuq {

    /* JADX INFO: renamed from: a */
    public final Spannable f42184a;

    /* JADX INFO: renamed from: b */
    public final boolean f42185b;

    /* JADX INFO: renamed from: c */
    public final Integer f42186c;

    public cuq(Spannable spannable, boolean z, Integer num) {
        this.f42184a = spannable;
        this.f42185b = z;
        this.f42186c = num;
    }

    /* JADX INFO: renamed from: a */
    public static cuq m33949a(cuq cuqVar, SpannableStringBuilder spannableStringBuilder, boolean z, int i) {
        Spannable spannable = spannableStringBuilder;
        if ((i & 1) != 0) {
            spannable = cuqVar.f42184a;
        }
        if ((i & 2) != 0) {
            z = cuqVar.f42185b;
        }
        Integer num = cuqVar.f42186c;
        cuqVar.getClass();
        return new cuq(spannable, z, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuq)) {
            return false;
        }
        cuq cuqVar = (cuq) obj;
        return wj50.m88271j(this.f42184a, cuqVar.f42184a) && this.f42185b == cuqVar.f42185b && wj50.m88271j(this.f42186c, cuqVar.f42186c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f42184a.hashCode() * 31, 31, this.f42185b);
        Integer num = this.f42186c;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
