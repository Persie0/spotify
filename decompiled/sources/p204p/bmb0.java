package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class bmb0 implements fmb0 {

    /* JADX INFO: renamed from: a */
    public final wab0 f28490a;

    /* JADX INFO: renamed from: b */
    public final sbb0 f28491b;

    /* JADX INFO: renamed from: c */
    public final String f28492c;

    /* JADX INFO: renamed from: d */
    public final String f28493d;

    /* JADX INFO: renamed from: e */
    public final String f28494e;

    /* JADX INFO: renamed from: f */
    public final Set f28495f;

    public bmb0(wab0 wab0Var, sbb0 sbb0Var, String str, String str2, String str3, Set set) {
        this.f28490a = wab0Var;
        this.f28491b = sbb0Var;
        this.f28492c = str;
        this.f28493d = str2;
        this.f28494e = str3;
        this.f28495f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmb0)) {
            return false;
        }
        bmb0 bmb0Var = (bmb0) obj;
        return wj50.m88271j(this.f28490a, bmb0Var.f28490a) && wj50.m88271j(this.f28491b, bmb0Var.f28491b) && wj50.m88271j(this.f28492c, bmb0Var.f28492c) && wj50.m88271j(this.f28493d, bmb0Var.f28493d) && wj50.m88271j(this.f28494e, bmb0Var.f28494e) && wj50.m88271j(this.f28495f, bmb0Var.f28495f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b((this.f28491b.hashCode() + (this.f28490a.hashCode() * 31)) * 31, 31, this.f28492c), 31, this.f28493d);
        String str = this.f28494e;
        return this.f28495f.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
