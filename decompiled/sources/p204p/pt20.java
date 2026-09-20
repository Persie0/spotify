package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class pt20 {

    /* JADX INFO: renamed from: a */
    public final fuz0 f181027a;

    /* JADX INFO: renamed from: b */
    public final fuz0 f181028b;

    /* JADX INFO: renamed from: c */
    public final String f181029c;

    public pt20(fuz0 fuz0Var, fuz0 fuz0Var2, String str) {
        this.f181027a = fuz0Var;
        this.f181028b = fuz0Var2;
        this.f181029c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt20)) {
            return false;
        }
        pt20 pt20Var = (pt20) obj;
        return wj50.m88271j(this.f181027a, pt20Var.f181027a) && wj50.m88271j(this.f181028b, pt20Var.f181028b) && wj50.m88271j(this.f181029c, pt20Var.f181029c);
    }

    public final int hashCode() {
        int iM80647e = tfe.m80647e(Arrays.hashCode(this.f181027a.f73606a) * 31, this.f181028b.f73606a, 31);
        String str = this.f181029c;
        return iM80647e + (str == null ? 0 : str.hashCode());
    }
}
