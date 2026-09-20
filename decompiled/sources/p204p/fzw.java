package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class fzw implements s2x {

    /* JADX INFO: renamed from: a */
    public final boolean f75189a;

    /* JADX INFO: renamed from: b */
    public final String f75190b;

    /* JADX INFO: renamed from: c */
    public final String f75191c;

    /* JADX INFO: renamed from: d */
    public final Set f75192d;

    public fzw(boolean z, String str, String str2, Set set) {
        this.f75189a = z;
        this.f75190b = str;
        this.f75191c = str2;
        this.f75192d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzw)) {
            return false;
        }
        fzw fzwVar = (fzw) obj;
        return this.f75189a == fzwVar.f75189a && wj50.m88271j(this.f75190b, fzwVar.f75190b) && wj50.m88271j(this.f75191c, fzwVar.f75191c) && wj50.m88271j(this.f75192d, fzwVar.f75192d);
    }

    public final int hashCode() {
        return this.f75192d.hashCode() + s571.m77243b(s571.m77243b(Boolean.hashCode(this.f75189a) * 31, 31, this.f75190b), 31, this.f75191c);
    }
}
